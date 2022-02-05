package com.springcore.constructor_Ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

      ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/constructor_Ambiguity/constructor_Ambiguity.xml");
        Addition addition = con.getBean("ad",Addition.class);
        addition.show();
        
	}

}
