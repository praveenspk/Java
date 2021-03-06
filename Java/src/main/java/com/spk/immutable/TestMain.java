package com.spk.immutable;

import java.sql.Date;
/**
 * @author Praveen
 *
 */
class TestMain {
	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(100, "test", new Date(0));
		System.out.println(im);
		tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField());
		System.out.println(im);
	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(20);
	}
}