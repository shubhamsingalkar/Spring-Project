package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("collections.xml");
		Emp emp = context.getBean("emp1",Emp.class);
		
		
		System.out.println(emp);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());

	}

}
