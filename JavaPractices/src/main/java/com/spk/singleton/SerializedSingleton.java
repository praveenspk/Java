package com.spk.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		System.out.println();
		return SingletonHelper.instance;
	}

	public static void main(String[] args) {
		SerializedSingleton.getInstance();

	}

}
