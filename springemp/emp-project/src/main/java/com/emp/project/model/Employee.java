package com.emp.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empFirstName;
	private String empLastName;
	private int empMobile;
	private String empAddress;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public int getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(int empMobile) {
		this.empMobile = empMobile;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empFirstName, String empLastName, int empMobile, String empAddress) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empMobile = empMobile;
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empMobile=" + empMobile + ", empAddress=" + empAddress + "]";
	}
	
	
	
	

}
