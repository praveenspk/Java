package com.spk.exception;
/**
 * @author Praveen
 *
 */
public class OnlineTest {
	static {
		String str1 = "abc";
		String str2 = "def";
		String str3 = str1.concat(str2);

		str1.concat(str2);
		System.out.println(str1);
	}

	static {
		boolean x = false;
		int a;
		if (x)
			a = x ? 1 : 2;
		else
			a = x ? 3 : 4;
		System.out.println(a);
	}
	static {
		int i, j = 0;
		for (i = 10; i < 0; i--) {
			j++;
		}
		switch (j) {
		case (0):
			j = j + 1;
		case (1):
			j = j + 2;
			break;
		case (2):
			j = j + 3;
			break;
		case (10):
			j = j + 10;
			break;
		default:
			break;
		}
		System.out.println("==="+j);

	}

	public static void main(String[] args) {
		int i = 1, j = 1;
		try {
			i++;
			j--;
			if (i / j > 1)
				i++;
		} catch (ArithmeticException e) {
			System.out.println(0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(1);
		} catch (Exception e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);

	}
}
