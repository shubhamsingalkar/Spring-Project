package com.springcore.ref_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("refconfig.xml");
	        
	          A a= Context.getBean("aref",A.class);
	          
	             System.out.println(a.getX());
	             
	             System.out.println(a.getOb());
	             
	             System.out.println(a.getOb().getY());
	             
	             
	             System.out.println(a);
	
	}

}
