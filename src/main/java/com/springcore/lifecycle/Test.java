package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;// it is used to call life cycle methods of bean 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");*/
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
           Samosa samosa = context.getBean("s1",Samosa.class);
           System.out.println(samosa);
           
         context.registerShutdownHook();// to call destroy method of life cycle methods of bean OR to hook the life cycle method.
           
           
           Pepsi pepsi = context.getBean("p1",Pepsi.class);
           System.out.println(pepsi);
           
           
           Example example = context.getBean("e1",Example.class);
           System.out.println(example);
          
	}
 //AbstractApplicationContext is a parent interface of ClassPathXmlApplicationContext interface.
	// registerShutdownHook() method is from AbstractApplicationContext interface
	
	
	
	
	
}
