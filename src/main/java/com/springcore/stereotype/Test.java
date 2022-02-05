package com.springcore.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		/*Student student = context.getBean("student",Student.class);*/
		Student stu = context.getBean("obj",Student.class);
		System.out.println(stu.getName());
		System.out.println(stu.getCity());
		System.out.println(stu.getAddress());
		
		System.out.println("===toString===");
		System.out.println(stu);
		
		System.out.println("\n");
	System.out.println("For Employee class");
	Employee emp = context.getBean("employee", Employee.class);
	    emp.setEmpname("Sachin");
	    emp.setDesignation("Software Engineer");
	    emp.setSalary(85000);
		System.out.println(emp);
		System.out.println(emp.hashCode());
		Employee emp2 = context.getBean("employee", Employee.class);
		System.out.println(emp2.hashCode());
	}

}
