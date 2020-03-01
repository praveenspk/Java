/**
 * 
 */
package com.spk.utility;

/**
 * @author Praveen
 *
 */
public class DecimalCurrencyToStatement {

	public static String convertDecimalCurrencyToStatement(int currency) {
		String statement = "";
		int modPrev=0,mod=0;
		for (int i = 0; currency > 0; i++) {
			modPrev=mod;
			mod=currency % 10;
			if(i==1 && mod==1 )
			{
				//to get teen values
				statement=numberEquivalent(i, modPrev)+decimalStatementEquivalent(i, modPrev);
			}else
			{
			statement = numberEquivalent(i,mod) + decimalStatementEquivalent(i,mod) +" "+ statement;
			}
			currency = currency / 10;
		}
		return statement;
	}
	

	/**
	 * @param i
	 * @return
	 */
	private static String decimalStatementEquivalent(int decimal,int number) {
		// TODO Auto-generated method stub

		switch (decimal) {
		case 1:
			if(decimal==1 && number==1)
			 return "teen";
			else
			{
				return "";
			}
		case 2:
			return "Hundred";

		case 3:
			return "Thousands";
		case 4:
			return "";
		case 5:
			return "Lakhs";
		case 6:
			return "";
		case 7:
			return "Crore";

		default:
			break;
		}
		return "";
	}

	/**
	 * @param i
	 * @return
	 */
	private static String numberEquivalent(int decimal,int number) {
		// TODO Auto-generated method stub
		boolean myTeaFlag=false;
		if( decimal==1 || decimal==4 || decimal==6)
		{
			myTeaFlag=true;
		}
		switch (number) {
		case 1:
			return "One";

		case 2:
			if(myTeaFlag)
			{
			return "twenty";
			}else
			{
				return "twenty";
			}

		case 3:
			if(myTeaFlag)
			{
			return "Thirty";
			}
			else
			{
				return "three";
			}
		case 4:
			if(myTeaFlag)
			{
			return "Fourty";
			}
			else
			{
				return "Four";
			}
		case 5:
			if(myTeaFlag)
			{
			return "Fifty";
			}
			else
			{
				return "Five";
			}
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			if(myTeaFlag){
			return "Eighty";}
			else
			{
				return "Eight";
			}

		case 9:
			if(myTeaFlag){
				return "Ninety";}
				else
				{
					return "Nine";
				}

		default:
			break;

		}
		return " ";
	}

	public static void main(String[] args) {
		System.out.println(convertDecimalCurrencyToStatement(9023511));
	}

}
