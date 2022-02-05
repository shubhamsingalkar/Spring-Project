package com.springcore.constructor_Inj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Con_Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("constructor_injConfig.xml");

		Person person = Context.getBean("person",Person.class);
		
		System.out.println(person);


	}

}
