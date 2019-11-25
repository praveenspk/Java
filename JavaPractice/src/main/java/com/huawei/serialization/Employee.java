package com.huawei.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private String empId;
	private String name;
	private String dept;
	private Long mobile;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String name, String dept, Long mobile) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.mobile = mobile;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", mobile=" + mobile + "]";
	}

}
