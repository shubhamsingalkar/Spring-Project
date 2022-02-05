package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Samosa getsamosa() {
		return new Samosa();
	}

	//@Bean(name="student1")
	//OR for more name 
	@Bean (name={"student1","stu"}) //we can use any one name for this bean
	public Student getstu() {
		Student student =new Student(getsamosa());
		return student;
	}

}
