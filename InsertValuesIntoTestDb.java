package com.huawei.CSVReader;

/**
 * Hello world!
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;

public class InsertValuesIntoTestDb {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception {
                String splitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader("IF_CFG_BTS.csv"));
        String line = br.readLine();
        while(line!=null){
             String[] b = line.split(splitBy);
             System.out.println(b[0]);
        }
        br.close();

  }
}