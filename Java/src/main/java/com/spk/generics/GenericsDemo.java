package com.spk.generics;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class GenericsDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Praveen");
		list.add(519);
		list.add('c');
		list.add("Java Developer");
		System.out.println(list);

		
		Container<Integer> con=new Container<>();
		con.value=10;
		con.show();
		
	}

}

class Container<T>{
	
	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println("Value is :" +value.getClass().getName());
	}
	
	public void demo(ArrayList<? extends T> list) {
		
	}
	
}
