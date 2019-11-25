package com.spk.Collections;

public class employees {
	
	private Integer empid;
	private String name;
	private String email;
	private Long mobile;
	private String addrs;
	
	
	public employees(Integer empid, String name, String email, Long mobile, String addrs) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.addrs = addrs;
	}
	
	
	public employees() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "employees [empid=" + empid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", addrs="
				+ addrs + "]";
	}
	
	

}
