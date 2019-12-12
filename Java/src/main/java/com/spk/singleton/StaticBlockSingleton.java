package com.spk.singleton;
/**
 * @author Praveen
 *
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		System.out.println("Private Constructor ");
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

	// Lazy instatntiation
	public static StaticBlockSingleton getLazyInstance() {
		if (instance == null) {
			instance = new StaticBlockSingleton();
		}
		return instance;
	}

	public static synchronized StaticBlockSingleton getInstanceBySynch() {
		if (instance == null) {
			instance = new StaticBlockSingleton();
		}
		return instance;
	}

	public static StaticBlockSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (StaticBlockSingleton.class) {
				if (instance == null) {
					instance = new StaticBlockSingleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		StaticBlockSingleton obj = StaticBlockSingleton.instance;
		System.out.println(obj);

	}
}
