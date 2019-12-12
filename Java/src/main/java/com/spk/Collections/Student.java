package com.spk.Collections;
/**
 * @author Praveen
 *
 */

public class Student implements Comparable<Student>{

	private String name;
	private int rollNo;
	private String branch;
	private Long mobile;
	private String email;
	private String addrs;

	/*public Student() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	public Student(String name, int rollNo, String branch, Long mobile, String email, String addrs) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.mobile = mobile;
		this.email = email;
		this.addrs = addrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", branch=" + branch + ", mobile=" + mobile + ", email="
				+ email + ", addrs=" + addrs + "]";
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollNo - o.rollNo;
	}

}
