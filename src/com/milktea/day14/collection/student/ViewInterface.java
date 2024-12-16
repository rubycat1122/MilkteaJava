package com.milktea.day14.collection.student;

import java.util.List;

public interface ViewInterface {
	// public 생략 가능
	public Student inputStudent();
	
	public void displayStudents(List<Student> stdList);
	
	public int printMenu();
	
	public void displayMsg(String msg);
	
	public String inputName(String category);
	
	public Student modifyStudent(Student student);

	
}
