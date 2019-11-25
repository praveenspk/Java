package groovy.tasklet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.FileWriterWithEncoding;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;

import com.huawei.smartcare.dsi.util.Util;
import com.huawei.smartcare.dsi.util.AlarmUtil;//yuxingtao增加

/*****
 * DataCheckTasklet
 * @author wWX296380
 *
 */
public class DataCheckTasklet implements Tasklet
{
    /**
     * 日志变量logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(DataCheckTasklet.class);
    
    private boolean addECI = false;
	private boolean addIndex = false;
    
    //2G/3G/4G 黑名单校验
    //(&,<,>,",',;,=,?,%,\n,\r,\n\r,\,|, tab and comma)
    //private String cellRegEx = "[&<>\"\';,=|%?\$#\\n\\r\\t\\\\]";
    private String cellRegEx = "[&<>\"\';,=|%?\$#\\n\\r\\t\\\\]";
    
    private String cellType;
	private String xmlName;
    
    //字符集map
    private Map<String, String> charMap;
    
    private boolean checkMillion = false;
    
    private Integer[] columnLs;
    
    private String errorFileName;
    
    private String errorFilePath;
    
    private Integer[] filterIndexs;
    
    private String inCharset = "UTF-8";
    
    private String inFileName;
    
    private String inSeparatorChar = "|";
    
    private String outFileName;
	    
    private String outFilePath;
    
    private Integer[] primaryKeyIndexs;
    
    //使用代替字符
    private String replaceStr = "_";
    
    private Integer totalCol;
    
    private String charChange(String str)
    {
        Set<String> charKeySet = charMap.keySet();
        for (String string : charKeySet)
        {
            str = str.replace(string, charMap.get(string));
        }
        return str;
    }
    
    /***
     * 清理字串中的特殊字符
     * @param str  字符串参数
     * @return String 结果
     */
    private String cleanIllegalCharacter(String str)
    {
        Pattern p = Pattern.compile(cellRegEx);
        Matcher m = p.matcher(str);
        return m.replaceAll(replaceStr).trim();
    }
    
    /*****
     * execute
     * @param stepContribution stepContribution
     * @param chunkContext chunkContext
     * @return RepeatStatus
     * @throws Exception Exception
     */
    @Override
    public RepeatStatus execute(StepContribution stepContribution,
            ChunkContext chunkContext) throws Exception
    {
		logger.info("deal with file start:"+inFileName);//yuxingtao增加
        ExecutionContext context = chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
        
        File errorFileDir = new File(errorFilePath);
        if (!errorFileDir.exists())
        {
            errorFileDir.mkdirs();
        }
		
		 File outFileDir = new File(outFilePath);
        if (!outFileDir.exists())
        {
            outFileDir.mkdirs();
        }
		
		
        String date = new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());
        
        String errorResultFileName = null;
        
        int dataSize = 0;
        
        //存放文件记录
        List<String> userDataLs = new ArrayList<String>();
        
        userDataLs = getRecord(inFileName);
        
        dataSize = userDataLs.size();
        
        //错误记录结果集
        List<String> listError = new ArrayList<String>();
		List<String> listR = new ArrayList<String>();//yuxingtao增加
		
        if (dataSize != 0)
        {
            //最终结果集
           // List<String> listR = new ArrayList<String>();
            StringBuilder strBuilder = new StringBuilder();
            //Map key值
            StringBuilder key = new StringBuilder();
            //列为NULL校验结果集
            List<String> listNotNull = new ArrayList<String>();
            //联合主键校验
            Map<String, Integer> map = new HashMap<String, Integer>();
            //临时数组
            String[] strs = null;
            
            logger.info("userDataLs========: " + userDataLs.size());
            for (String str : userDataLs)
            {
                strs = StringUtils.splitPreserveAllTokens(str, inSeparatorChar);
                
                if (strs.length != totalCol)
                {
                    listError.add("is not " + totalCol + " columns :" + str);
                }
                else
                {
                    key.setLength(0);
				if(addIndex)
				{
                    for (Integer i : primaryKeyIndexs)
                    {
                        key.append(strs[i.intValue()]).append(inSeparatorChar);
                    }
                  
					if (map.get(key.toString()) == null)
					{
						map.put(key.toString(), 1);
					}
					else
					{
						map.put(key.toString(), map.get(key.toString()) + 1);
					}
				 } 
                    listNotNull.add(str);
                }
            }
            
            logger.info("listNotNull========: " + listNotNull.size());
            for (String str : listNotNull)
            {
                key.setLength(0);
                strs = StringUtils.splitPreserveAllTokens(str, inSeparatorChar);
				if(null!=primaryKeyIndexs && primaryKeyIndexs.length>0)
				{
					for (Integer i : primaryKeyIndexs)
					{
						key.append(strs[i.intValue()]).append(inSeparatorChar);
					}
				}
					if (addIndex && map.get(key.toString()) != 1)
					{
						listError.add("the datas is duplicateRecord :" + str);
					}
                else
                {
                    
                    if (null == filterIndexs || filterIndexs.length == 0)
                    {
                        listR.add(str);
                    }
                    else
                    {
                        Object[] processed = new Object[filterIndexs.length];
                        strs = StringUtils.splitPreserveAllTokens(str,
                                inSeparatorChar);
                        //处理后的文件的列索引
                        Integer index = 0;
                        for (Integer filter : filterIndexs)
                        {
                            
                            //如果文件中没有，但表中需要此字段,该列值插入空字符串占位
                            if (-1 == filter)
                            {
                                processed[index++] = "";
                            }
                            else
                            {
                                processed[index++] = strs[filter];
                            }
                        }
                        
                        for (Integer i : columnLs)
                        {
                            processed[i] = charChange(processed[i].toString());
                            
                        }
                        if (cellType.equalsIgnoreCase("ecgi"))
                        {
							if (NumberUtils.isNumber(processed[1].toString()))
                            {
                               processed[1]='0'+processed[1].toString();
                            }
							if (NumberUtils.isNumber(processed[3].toString()))
                            {
                               processed[3]=String.valueOf(Integer.parseInt(processed[3].toString()));
                            }
							
                            if (addECI)
                            {
                                processed[4] = addECGIECI(processed[2].toString(),processed[3].toString());
                            }
                            processed[5] = cleanIllegalCharacter(processed[5].toString());
                            if (NumberUtils.isNumber(processed[8].toString()))
                            {
                              //processed[8] = getLongitudeAndLatitude(processed[8].toString(),checkMillion);
                            }
                            if (NumberUtils.isNumber(processed[9].toString()))
                            {
                                //processed[9] = getLongitudeAndLatitude(processed[9].toString(),checkMillion);
                            }
                        }
                        if (cellType.equalsIgnoreCase("sai"))
                        {
							if (NumberUtils.isNumber(processed[1].toString()))
                            {
                               processed[1]='0'+processed[1].toString();
                            }
							
                            if (NumberUtils.isNumber(processed[2].toString()))
                            {
                                processed[2] = getHex(processed[2].toString());
                            }
                            if (NumberUtils.isNumber(processed[3].toString()))
                            {
                                processed[3] = getHex(processed[3].toString());
                            }
                            processed[4] = cleanIllegalCharacter(processed[4].toString());
                            processed[5] = cleanIllegalCharacter(processed[5].toString());
                            processed[6] = cleanIllegalCharacter(processed[6].toString());
                            if (NumberUtils.isNumber(processed[8].toString()))
                            {
                                //processed[8] = getLongitudeAndLatitude(processed[8].toString(),checkMillion);
                            }
                            if (NumberUtils.isNumber(processed[9].toString()))
                            {
                                //processed[9] = getLongitudeAndLatitude(processed[9].toString(),checkMillion);
                            }
                        }
                        if (cellType.equalsIgnoreCase("cgi"))
                        {
							if (NumberUtils.isNumber(processed[1].toString()))
                            {
                               processed[1]='0'+processed[1].toString();
                            }
                            if (NumberUtils.isNumber(processed[2].toString()))
                            {
                                processed[2] = getHex(processed[2].toString());
                            }
                            if (NumberUtils.isNumber(processed[3].toString()))
                            {
                                processed[3] = getHex(processed[3].toString());
                            }
                            processed[4] = cleanIllegalCharacter(processed[4].toString());
                            processed[5] = cleanIllegalCharacter(processed[5].toString());
                            processed[6] = cleanIllegalCharacter(processed[6].toString());
                            if (NumberUtils.isNumber(processed[8].toString()))
                            {
                                //processed[8] = getLongitudeAndLatitude(processed[8].toString(),checkMillion);
                            }
                            if (NumberUtils.isNumber(processed[9].toString()))
                            {
                               //processed[9] = getLongitudeAndLatitude(processed[9].toString(), checkMillion);
                            }
                        }
                        if (cellType.equalsIgnoreCase("bts"))
                        {
                            if (NumberUtils.isNumber(processed[2].toString()))
                            {
                                //processed[2] = getLongitudeAndLatitude(processed[2].toString(),checkMillion);
                            }
                            if (NumberUtils.isNumber(processed[3].toString()))
                            {
                                //processed[3] = getLongitudeAndLatitude(processed[3].toString(),checkMillion);
                            }
                        }
                        
                        if (cellType.equalsIgnoreCase("nodeb"))
                        {
                            // 校验NodeB Name字段
                            processed[1] = cleanIllegalCharacter(processed[1].toString());
                            // 校验RNC Name字段
                            processed[2] = cleanIllegalCharacter(processed[2].toString());
                            if (NumberUtils.isNumber(processed[5].toString()))
                            {
                                //processed[5] = getLongitudeAndLatitude(processed[5].toString(),checkMillion);
                            }
                            if (NumberUtils.isNumber(processed[6].toString()))
                            {
                                //processed[6] = getLongitudeAndLatitude(processed[6].toString(),checkMillion);
                            }
                            
                        }
                        if (cellType.equalsIgnoreCase("enodeb"))
                        {
							if (NumberUtils.isNumber(processed[1].toString()))
                            {
                               processed[1]='0'+processed[1].toString();
                            }
                            // eNodeB Name
                            processed[3] = cleanIllegalCharacter(processed[3].toString());
                            // MME POOL Name
                            processed[6] = cleanIllegalCharacter(processed[6].toString());
                            
                            if (NumberUtils.isNumber(processed[7].toString()))
                            {
                                //processed[7] = getLongitudeAndLatitude(processed[7].toString(),checkMillion);
                            }
                            if (NumberUtils.isNumber(processed[8].toString()))
                            {
                                //processed[8] = getLongitudeAndLatitude(processed[8].toString(), checkMillion);
                            }
                            
                        }
                        if (cellType.equalsIgnoreCase("regions"))
                        {
							if (NumberUtils.isNumber(processed[2].toString()))
							{
								if(processed[2].toString().length()>1)
								{
									processed[2]=processed[2].toString();
								}
								else
								{
									processed[2]='0'+processed[2].toString();
								}								
							}
							if(Integer.parseInt(processed[0].toString())==5 || Integer.parseInt(processed[0].toString())==6)
							{
								if (NumberUtils.isNumber(processed[3].toString()))
								{
									processed[3] = getHex(processed[3].toString());
								}
								if (NumberUtils.isNumber(processed[4].toString()))
								{
									processed[4] = getHex(processed[4].toString());
								}
							}
                            processed[7] = cleanIllegalCharacter(processed[7].toString()).toUpperCase();
							//if city name has more than one word split by space and use first word
							String[] cityName=processed[9].toString().split(' ');
							processed[9]=cityName[0];
							processed[9] = cleanIllegalCharacter(processed[9].toString()).toUpperCase();
                            processed[7] = processed[7]+'-'+processed[9];							
							
							// for caliculating cell_id for 2g/3g/4g
							if(processed[0].equals("5"))
							{	
                                processed[0]='CGI';		
								processed[6]=(processed[1]+"/"+processed[2]+"/"+processed[3]+"/"+processed[4]);
							}							
							if(processed[0].equals("6"))
							{	
								processed[0]='SAI';
								processed[6]=(processed[1]+"/"+processed[2]+"/"+processed[3]+"/"+processed[4]);
							}							
							if(processed[0].equals("7"))
							{	
								processed[0]='ECGI';
								if (NumberUtils.isNumber(processed[4].toString()))
								{
									String twoDigitHexa='';
									String threeDigitHexa='';
									String finalHexa='';									
									int noOfIterations;
									//converting first two digits to hexa DecimalFormat based in length of the string 
									if(processed[4].toString().length()<2)
									{
										//incase if length of the string is one 
									    twoDigitHexa=toHex(processed[4].toString());
									}
									else
									{
										twoDigitHexa=toHex(processed[4].toString().substring(0,2));
									}														
									//converting last three digits to hexa DecimalFormat
									//if string length is 1 then we will get AIOBE because there is no string at index 2 so handle it									
									if(processed[4].toString().length()>2)
									{
									threeDigitHexa=toHex(processed[4].toString().substring(2));
									}
									finalHexa=twoDigitHexa+threeDigitHexa;
									noOfIterations=7-(finalHexa.length());//this decides to append no of zeros to get a string of length 7
									for(int i=0;i<noOfIterations;i++)
									{
										finalHexa='0'+finalHexa;										
									}
									processed[4]=finalHexa;									
								}								
								processed[6]=(processed[1]+"/"+processed[2]+"/"+processed[4]);
							}
							if(processed[0].equals("3"))
							{
								processed[0]='ENodeB';
							}
							
                          
                        }
                        strBuilder.setLength(0);
                        for (int i = 0; i < filterIndexs.length; i++)
                        {
                            if (i < filterIndexs.length - 1)
                            {
                                strBuilder.append(processed[i])
                                        .append(inSeparatorChar);
                            }
                            else
                            {
                                strBuilder.append(processed[i]);
                            }
                        }
                        
                        listR.add(strBuilder.toString());
                    }
                }
                
            }
            
            logger.info("listR======listR: " + listR.size());
            if (listError.size() != 0)
            {
                
                //错误日志名
                errorResultFileName = errorFileName.substring(0,errorFileName.lastIndexOf("."))+ "_"+ date+ errorFileName.substring(errorFileName.lastIndexOf("."));
                writerResultFile(listError,errorFilePath + errorResultFileName,inCharset);
            }
			if(listR.size() != 0){				
				writerResultFile(listR, outFilePath + outFileName, inCharset);
			}
			
            
        }
		logger.info("dataSize: "+dataSize);
        context.put("alarmNum", listError.size());
        context.put("totalNum", dataSize);
        context.put("dataSize", dataSize);
        context.put("cellType", cellType);
		
		//数据陡变告警yuxingtao增加
		int resultSize = listR.size();
		int abruptThreshold=15;
		String alarmInfo='';
		String dataSizeFilePath="/opt/ecm/app/0010/proc/workspace0/home/ext/integration/TR_TURKCELL_CM/dataSizeFile/";
		File dataPath=new File(dataSizeFilePath);
		if(!dataPath.exists())
		{
			dataPath.mkdir();
		}
		File dataSizeFile = new File(dataSizeFilePath+cellType+".csv");
		if(dataSizeFile.exists())
		{
			int oldNum;
			oldNum = Integer.parseInt(dataSizeFile.getText("UTF-8").trim());
			int changeRate=Math.abs(resultSize-oldNum)*100/oldNum;
			alarmInfo="lastRecordsSize="+oldNum+", currentRecordsSize="+resultSize+", change="+changeRate+"%, threshold="+abruptThreshold+"%";
			if(changeRate >= abruptThreshold)
			{
				logger.info("Send Data Count Change Alarm:"+alarmInfo);
				AlarmUtil.sendInterationMistakeAlarm(xmlName, cellType + " "+"data count change alarm", alarmInfo, false);
			}
			else
			{
				logger.info("Recover Data Count Change Alarm:"+alarmInfo);
				AlarmUtil.sendInterationMistakeAlarm(xmlName, cellType + " "+"data count change alarm", alarmInfo, true);
			}
		}
		if(resultSize!=0){
			dataSizeFile.setText(resultSize.toString(),"UTF-8");
		}
        //yuxingtao增加结束
        
		//记录日志yuxingtao增加
		new File(errorFilePath+'IntegrationDataRecord_'+new SimpleDateFormat('yyyyMMdd').format(System.currentTimeMillis())+'.log').withWriterAppend 'utf-8',{pw ->
			pw.println(new SimpleDateFormat('yyyy-MM-dd HH:mm').format(System.currentTimeMillis())+'|'+cellType+'|'+'total records='+dataSize+'|'+'error records='+listError.size()+'|'+'result records='+listR.size())
		}
		logger.info("deal with file end:"+inFileName);
        //yuxingtao增加结束
		logger.info("DataCheckTasklet is done !");
        return RepeatStatus.FINISHED;
    }
    
    /***
     * 进制转化
     * @param str 字符串参数 
     * @return false/true
     */
    public String getHex(String str)
    {
        return addZeroExField(toHex(str), 4);
    }
    
    /**
     * 补位操作
     */
    public String addZeroExField(String str, int num)
    {
        
        for (int i = 0; i < num; i++)
        {
            str = '0' + str;
        }
        return str.substring(str.length() - num, str.length());
    }
    
    /**
     * 根据5位enodeb id和2位cell id 拼接eci
     * @param enodebid enodebid
     * @param cellid cellid
     * @return eci 
     */
    public String addECGIECI(String enodebid, String cellid)
    {
        return addZeroExField(toHex(enodebid), 5)+ addZeroExField(toHex(cellid), 2);
    }
    
    /**
     * 进制转化
     * @param str str
     * @return String 
     */
    public String toHex(String str)
    {
        long temp = Long.parseLong(str);
        return Long.toHexString(temp).toUpperCase();
    }
    
    public String getCellType()
    {
        return cellType;
    }
	
    public String getXmlName()
    {
        return xmlName;
    }
	
    public Map<String, String> getCharMap()
    {
        return charMap;
    }
    
    public Integer[] getColumnLs()
    {
        return columnLs;
    }
    
    public String getErrorFileName()
    {
        return errorFileName;
    }
    
    public String getErrorFilePath()
    {
        return errorFilePath;
    }
	public String getOutFilePath()
    {
        return outFilePath;
    }
    
    public Integer[] getFilterIndexs()
    {
        return filterIndexs;
    }
    
    public String getInCharset()
    {
        return inCharset;
    }
    
    public String getInFileName()
    {
        return inFileName;
    }
    
    public String getInSeparatorChar()
    {
        return inSeparatorChar;
    }
    
    /***
     * 
     * 返回经纬度实际值
     * 
     * Longitude 经度  有效位为9位的整数或浮点数
     * Latitude  纬度  有效位为9位的整数或浮点数
     * 
     * @param str 参数
     * @param checkMillion 参数
     * @return String
     */
    public String getLongitudeAndLatitude(String str, boolean checkMillion)
    {
        if (StringUtils.isBlank(str) || str.length() <= 6)
        {
            return str;
        }
        int du = 0;
        double fen = 0, miao = 0, ans, num;
        DecimalFormat df = new DecimalFormat("##0.000000");
        DecimalFormat df2 = new DecimalFormat("##0.0");
        num = Double.valueOf(str);
        if (0 == num)
        {
            return df2.format(num) + "";
        }
        du = Integer.parseInt(str.substring(0, str.length() - 6));
        fen = Double.parseDouble(df.format(Double.parseDouble(str.substring(str.length() - 6,str.length() - 4)) / 60));
        miao = Double.parseDouble(df.format(Double.parseDouble(str.substring(str.length() - 4,str.length())) / (360 * 1000)));
        if (checkMillion)
        {
            if (du < 0)
            {
                ans = (du - fen - miao) * 1000 * 1000;
            }
            else
            {
                
                ans = (du + fen + miao) * 1000 * 1000;
            }
            return String.format("%.0f", ans);
        }
        else
        {
            if (du < 0)
            {
                ans = du - fen - miao;
            }
            else
            {
                ans = du + fen + miao;
            }
            if (180 == ans || -180 == ans || -90 == ans || 90 == ans)
            {
                return df2.format(ans) + "";
            }
            else
            {
                return df.format(ans) + "";
            }
        }
    }
    
    public String getOutFileName()
    {
        return outFileName;
    }
    
    public Integer[] getPrimaryKeyIndexs()
    {
        return primaryKeyIndexs;
    }
    
    /**
     * 合并文件
     * @param fileName fileName
     */
    private List<String> getRecord(String fileName)
    {
        List<String> list = new ArrayList<String>();
        //1. 读文件             
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), inCharset));
            String line;
            while (null != (line = reader.readLine()))
            {
                list.add(line);
            }
        }
        catch (Exception e)
        {
            logger.error("read file: {} error:{}",fileName,Util.getExceptionInfo(e));
        }
        finally
        {
            IOUtils.closeQuietly(reader);
        }
        return list;
    }
    
    public String getReplaceStr()
    {
        return replaceStr;
    }
    
    public Integer getTotalCol()
    {
        return totalCol;
    }
    
    public boolean isAddECI()
    {
        return addECI;
    }
    
    public boolean isCheckMillion()
    {
        return checkMillion;
    }
    
    public void setAddECI(boolean addECI)
    {
        this.addECI = addECI;
    }
    
    public void setCellType(String cellType)
    {
        this.cellType = cellType;
    }
    
	public void setXmlName(String xmlName)
    {
        this.xmlName = xmlName;
    }
	
    public void setCharMap(Map<String, String> charMap)
    {
        this.charMap = charMap;
    }
    
    public void setCheckMillion(boolean checkMillion)
    {
        this.checkMillion = checkMillion;
    }
    
    public void setColumnLs(Integer[] columnLs)
    {
        this.columnLs = columnLs;
    }
    
    public void setErrorFileName(String errorFileName)
    {
        this.errorFileName = errorFileName;
    }
    
    public void setErrorFilePath(String errorFilePath)
    {
        this.errorFilePath = errorFilePath;
    }
	public void setOutFilePath(String outFilePath)
    {
        this.outFilePath = outFilePath;
    }
    
    public void setFilterIndexs(Integer[] filterIndexs)
    {
        this.filterIndexs = filterIndexs;
    }
    
    public void setInCharset(String inCharset)
    {
        this.inCharset = inCharset;
    }
    
    public void setInFileName(String inFileName)
    {
        this.inFileName = inFileName;
    }
    
    public void setInSeparatorChar(String inSeparatorChar)
    {
        this.inSeparatorChar = inSeparatorChar;
    }
    
    public void setOutFileName(String outFileName)
    {
        this.outFileName = outFileName;
    }
    
    public void setPrimaryKeyIndexs(Integer[] primaryKeyIndexs)
    {
        this.primaryKeyIndexs = primaryKeyIndexs;
    }
    
    public void setReplaceStr(String replaceStr)
    {
        this.replaceStr = replaceStr;
    }
    
    public void setTotalCol(Integer totalCol)
    {
        this.totalCol = totalCol;
    }
    public boolean isAddIndex() {
		return addIndex;
	}
	public void setAddIndex(boolean addIndex) {
		this.addIndex = addIndex;
	}
    /***
     * writerResultFile 将数据写到到文件
     * @param result result
     * @param fName fName
     * @param charset1 charset1
     */
    private void writerResultFile(Collection<String> result, String fileName,
            String charSet)
    {
        
        FileWriterWithEncoding fileWriter = null;
        BufferedWriter writer = null;
        try
        {
            fileWriter = new FileWriterWithEncoding(fileName, charSet);
            writer = new BufferedWriter(fileWriter);
            for (String string : result)
            {
                writer.write(string);
                writer.newLine();
            }
        }
        catch (IOException e)
        {
            logger.error("writer file error:{}", Util.getExceptionInfo(e));
        }
        finally
        {
            IOUtils.closeQuietly(writer);
            IOUtils.closeQuietly(fileWriter);
        }
    }
}
