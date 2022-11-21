package com.pankajlearn.FirstSpringAppwithoutmaven;

public class Employee {
	private String empName;

	//generate getters and setter
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void displayEmpInfo()
	{
		System.out.println("Employee Name= "+empName);
	}
	
}
