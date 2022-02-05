package com.springcore.constructor_Inj;

import java.util.List;

public class Person {
	
	private String name;
	private int Personid;
	private Certi certi;
	private List<String> phones;
	
	
	public Person(String name, int Personid,Certi certi, List<String> phones) {
		
		this.name=name;
		this.Personid=Personid;
		this.certi=certi;
		this.phones=phones;
		
	}
	
	

	@Override
	public String toString() {
		return this.name+": "+this.Personid+" "+"{ " +this.certi.name+" } "+"Phones: "+this.phones;
	}

	
	}


	
	
	
	


