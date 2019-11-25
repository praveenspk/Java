package com.huawei.exception;

class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
} /* Line 2 */

public class ExceptionDemo {

	static {
		outer: for (int i = 0; i < 3; i++) {
			for (int j = 3; j >= 0; j--) {
				if (i == j)
					break outer;

				System.out.println(i + " " + j);
			}

		}
	}

	public static void main(String args[]) {
		if (args.length > 0)
			System.out.println(args.length);

		try {
			throw new Exc1(); /* Line 9 */
		} catch (Exc0 e0) /* Line 11 */
		{
			System.out.println("Ex0 caught");
		} catch (Exception e) {
			System.out.println("exception caught");
		}
	}
}
