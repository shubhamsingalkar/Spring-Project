package com.springcore.stereotype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype") //Prototype will create different different object whenever we create object.
public class Employee {
	
	private String empname;
	private int salary;
	private String designation;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	

}
