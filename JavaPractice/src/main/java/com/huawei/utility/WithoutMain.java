package com.huawei.utility;

/*public final class WithoutMain {
	// private static String msg = " Running without Main() ";
	static {
		System.out.println("Hello : ");
		System.exit(0);
	}
}
*/

/*The execution is done in this sequence :
jvm loads class
executes static blocks
looks for main method and invokes it*/

public class WithoutMain {

	static {
		System.out.println("hello");
		System.exit(0);
	}

}
