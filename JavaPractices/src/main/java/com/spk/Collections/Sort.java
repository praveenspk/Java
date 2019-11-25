package com.spk.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
	int i[]={104,523,895,253,102,356,10,2};
		List<Integer> list=new ArrayList(Arrays.asList(i));
		System.out.println();
		Collections.sort(list);
	}

}
