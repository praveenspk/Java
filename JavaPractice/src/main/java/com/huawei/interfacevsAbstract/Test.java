package com.huawei.interfacevsAbstract;

public class Test extends anyAbstractClass implements anyInterface {

	@Override
	public void abstractMethod() {
		System.out.println("From Abstract Class");
	}

	@Override
	void abstractmethod() {

		System.out.println("From Interface");

	}

	public static void main(String[] args) {

		Test t = new Test();
		t.abstractmethod();
		t.abstractmethod();
		t.defaultMethod();
		t.displayDefaultMethod();
		t.finalMethod();
		t.nonStaticMethod();

	}
}
