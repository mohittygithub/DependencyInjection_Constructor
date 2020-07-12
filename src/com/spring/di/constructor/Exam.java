package com.spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		Student onlyName = context.getBean("onlyName", Student.class);
		
		student.displayStudent();
		onlyName.displayStudent();
	}
}
