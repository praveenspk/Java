package com.spk.test;
/**
 * @author Praveen
 *
 */
import java.net.InetAddress;

public class IPAddressExample {
	public static void main(String args[]) throws Exception {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("IP Address:- " + inetAddress.getHostAddress());
		System.out.println("Host Name:- " + inetAddress.getHostName());
		System.out.println(inetAddress.getCanonicalHostName() + " \n " + inetAddress.getByName(null) + "\n "
				+ inetAddress.getLocalHost());
		InetAddress host = InetAddress.getByName("192.168.5.102");
		System.out.println(host.getHostName()+" "+host.getHostAddress());
	}
}