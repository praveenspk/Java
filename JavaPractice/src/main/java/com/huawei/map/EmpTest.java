package com.huawei.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmpTest {
	public static void main(String[] args) {
		Map<Integer, Employee> employee = new HashMap<>();
		employee.put(84119411, new Employee(84119411, "Praveen", "Bangalore"));
		employee.put(84129421, new Employee(84129421, "Vardhan", "Hyderabad"));
		employee.put(84329431, new Employee(84439431, "Thimothy", "Pune"));

		// Lambda
		employee.forEach((key, value) -> {
			System.out.println(key + "==> " + value);
		});

		Set entrySet = employee.entrySet();
		Iterator itr = entrySet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
