package com.ab.autowiringByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingAutowiringByConstructor {

	@SuppressWarnings({  "resource" })
	public static void main(String[] args) {
		
		ApplicationContext   context  = new ClassPathXmlApplicationContext("application2.properties.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}//main
}//TestingAutowiringByConstructor
