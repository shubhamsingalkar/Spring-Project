package com.springcore.Expession_Language;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Expession_Language/expl.xml");
		
		Student stu = context.getBean("student",Student.class);
		
		System.out.println(stu.getX());
		System.out.println(stu.getY());;
		System.out.println(stu.getZ());
		System.out.println(stu.getName());

	}

}
