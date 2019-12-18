package com.spk.abstractClasses;

public class AbstractDemo extends AbDemo {

	int l;
	int k;

	public AbstractDemo(int i, int j, int l, int k) {
		super();
		this.l = l;
		this.k = k;
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {
		AbstractDemo demo = new AbstractDemo(10, 20, 30, 40);

	}

}
