package com.springcore.auto.wire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/Autowireconfig.xml");

		Employee emp= context.getBean("emp1",Employee.class);
		System.out.println(emp);
		
	}

}
