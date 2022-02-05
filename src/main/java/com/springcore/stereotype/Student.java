package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@ Component OR*/ @Component("obj") // If we did not specify the object variable then by default it will take "student"
public class Student {

	@Value("Shubham") // to initiate variable // otherwise we can set this variable through setter method
	private String  name;
	
	@Value("Pune")
	private String city;
	
	@Value("#{add}") // to get collection values from xml; //this is called expression (expression language)
	List<String> address;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
}
