package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component ("stu")
public class Student {
	
	@Autowired
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display(); 
		System.out.println("Student reading book");
	}
	
	

}
