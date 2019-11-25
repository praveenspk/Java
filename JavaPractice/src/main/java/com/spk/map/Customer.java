package com.spk.map;

public class Customer {

	private Integer custId;
	private String custName;
	private String custAdd;
	public Customer(Integer custId, String custName, String custAdd) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAdd = custAdd;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAdd=" + custAdd + "]";
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAdd() {
		return custAdd;
	}
	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	
}

