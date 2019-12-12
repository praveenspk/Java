package com.spk.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class Test {

	Integer id;
	Long phone;
	String name;
	String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		// result = prime * result + ((id == null) ? 0 : id.hashCode());
		// result = prime * result + ((name == null) ? 0 : name.hashCode());
		// result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		System.out.println(result + "address" + address);
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		// if (id == null) {
		// if (other.id != null)
		// return false;
		// } else if (!id.equals(other.id))
		// return false;
		// if (name == null) {
		// if (other.name != null)
		// return false;
		// } else if (!name.equals(other.name))
		// return false;
		// if (phone == null) {
		// if (other.phone != null)
		// return false;
		// } else if (!phone.equals(other.phone))
		// return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", phone=" + phone + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		String adr = "vgr";
		t1.setId(100);
		t1.setPhone(9999l);
		t1.setName("Praveen");
		t1.setAddress("plvd");

		t2.setId(100);
		t2.setPhone(9999l);
		t2.setName("pk");
		t2.setAddress("vgr");
		System.out.println(adr == t1.address);
		System.out.println(adr == t2.address);
		System.out.println(t1);
		System.out.println(t2);
		// System.out.println(t3);
		// System.out.println(t4);
		
	
		List<String> fruits = Arrays.asList("Banana", "Lemon", "Orange", "Apple");
		 
		fruits.forEach(fruit -> System.out.println(fruit));
	}

}
