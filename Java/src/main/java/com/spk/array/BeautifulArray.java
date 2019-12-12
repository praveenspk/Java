package com.spk.array;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
/**
 * @author Praveen
 *
 */
public class BeautifulArray {
	private static Scanner sc;

	Boolean isBeautiful(int[] arr) {
		int len = arr.length;
		int count = 0;
		Set<Integer> s = new HashSet<>();
		if (len == 1) {
			return true;
		} else {
			for (int i = 0; i < len - 1; i++) {
				for (int j = i + 1; j < len; j++) {
					s.add(arr[i] * arr[j]);
				}
			}
		}
		for (int k : arr) {
			if (s.contains(k)) {
				count++;
			} else {
				break;
			}
		}
		if (count == arr.length) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		BeautifulArray o = new BeautifulArray();
		sc = new Scanner(System.in);
		int notc = Integer.parseInt(sc.next());
		while (notc-- > 0) {
			int noe = Integer.parseInt(sc.next());
			int[] arr = new int[noe];
			for (int i = 0; i < noe; i++) {
				arr[i] = sc.nextInt();
			}
			// o.isBeautiful(arr);
			System.out.println(o.isBeautiful(arr));
		}
	}
}
