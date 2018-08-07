package com.ab.autowiringByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingAutowiringByName {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.properties.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}// main

}// TestingAutowiringByName
