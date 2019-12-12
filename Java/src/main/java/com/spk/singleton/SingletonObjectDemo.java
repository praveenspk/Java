
package com.spk.singleton;
/**
 * @author Praveen
 *
 */
public class SingletonObjectDemo {

	public static void main(String args[]) {

		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}