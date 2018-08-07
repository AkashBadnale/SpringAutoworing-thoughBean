package com.ab.autowiringByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ab.autowiringByType.Student;

public class TestingAutowiringByType {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application1.properties.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
	}//main
}//TestingAutowiringByType
