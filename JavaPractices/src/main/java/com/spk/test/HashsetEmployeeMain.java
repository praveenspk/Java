package com.spk.test;

import java.util.HashSet;


public class HashsetEmployeeMain
{
public static void main(String[] args) 
{
HashSet<Employees> employee=new HashSet<>();
employee.add(new Employees(519, "Praveen", "praveen@spk.com", 9490137902L, "Pulivendula"));
//employee.add(new Employees(56, name, email, mobile, addrs));
System.out.println(employee);
}

}