package com.spk.test;

import javafx.application.Application;
/**
 * @author Praveen
 *
 */
public abstract class WithoutMain extends Application {

	static {
		int arr=10;
		System.out.println(arr*arr);
		System.exit(0);

	}
}
