package com.springcore.standalone.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
                 
		Person person = context.getBean("person1",Person.class);
		//System.out.println(person); // to print all (toString method)
		
		System.out.println(person.getFriends());
		
		System.out.println(person.getFriends().getClass());// we will get implementation class name
		                /* OR*/
	System.out.println(person.getFriends().getClass().getName());
	
	System.out.println("===============");
	System.out.println(person.getFees_structure());
	System.out.println(person.getFees_structure().getClass().getName());
	
	System.out.println("=============");
	System.out.println(person.getProperties());
	System.out.println(person.getProperties().getClass().getName());
	}

}
