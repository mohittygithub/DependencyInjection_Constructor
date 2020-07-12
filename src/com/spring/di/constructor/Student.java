package com.spring.di.constructor;

public class Student {

	private String studentName;
	private int age;
	private String subjectStream;
	
	
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	public Student(String studentName, int age, String subjectStream) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.subjectStream = subjectStream;
	}
	
	public void displayStudent() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Student age is : " + age);
		System.out.println("Student subjectStream is : " + subjectStream);
		System.out.println("===========================================");
	}
}
