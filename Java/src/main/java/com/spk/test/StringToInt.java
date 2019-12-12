package com.spk.test;

import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class StringToInt {
    public static void main(String args[]) {
     String inputString;
     Scanner s = new Scanner(System.in);
     inputString = s.nextLine();

     if (!inputString.matches("([+-]?([0-9]*[.])?[0-9]+)")) {
      System.out.println("Not a Number");
     } else {
      Double result2 = getNumber(inputString);
      System.out.println("result = " + result2);
     }

    }
    public static Double getNumber(String number) {
     Double result = 0.0;
     Double beforeDecimal = 0.0;
     Double afterDecimal = 0.0;
     Double afterDecimalCount = 0.0;
     int signBit = 1;
     boolean flag = false;

     int count = number.length();
     if (number.charAt(0) == '-') {
      signBit = -1;
      flag = true;
     } else if (number.charAt(0) == '+') {
      flag = true;
     }
     for (int i = 0; i < count; i++) {
      if (flag && i == 0) {
       continue;

      }
      if (afterDecimalCount == 0.0) {
       if (number.charAt(i) - '.' == 0) {
        afterDecimalCount++;
       } else {
        beforeDecimal = beforeDecimal * 10 + (number.charAt(i) - '0');
       }

      } else {
       afterDecimal = afterDecimal * 10 + number.charAt(i) - ('0');
       afterDecimalCount = afterDecimalCount * 10;
      }
     }
     if (afterDecimalCount != 0.0) {
      afterDecimal = afterDecimal / afterDecimalCount;
      result = beforeDecimal + afterDecimal;
     } else {
      result = beforeDecimal;
     }

     return result * signBit;
    }
   }