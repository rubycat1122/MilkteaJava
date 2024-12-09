package com.milktea.day09.oop;

public class Student{
	String name;
	int kor;
	int eng;
	int math;	

	public int total() {
		return kor+eng+math;
	}
	public double avg() {
		return this.total() / 3.0;
	}
}



