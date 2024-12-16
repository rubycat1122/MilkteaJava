package com.milktea.day14.collection.student;

// Value Object => VO  : 값을 저장하기 위한 객체
public class Student {
	// 필드
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 생성자
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// 메소드
	// getter / setter
	// public void getName() {}  -> 가져오는 값이므로 리턴이 있어야 함
	 public String getName() {
		 return name;
	 }  
	 // public void setName() {}  -> 값을 저장해야 하니까 매개변수가 있어야 함
	 public void setName(String name) {
		 this.name = name;
	 }
	// Alt Shift s  => getter setter 자동생성

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

	// Alt Shift s  => toString(); overriding 자동생성
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	// getter setter  toString overriding 까지 해야 기본 셋팅
	
}
