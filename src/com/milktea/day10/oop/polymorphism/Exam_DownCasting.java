package com.milktea.day10.oop.polymorphism;



public class Exam_DownCasting {
	public static void main(String[] args) {
		// 부모 타입의 참조변수로 자식 객체를 다루는 것
		// --> 업캐스팅
		// 부모 타입의 변수이기 때문에 부모의 필드만 접근 가능
		Person p = new Student();
		p.name = "이용자";
		p.id = "khuser02";
		Student s = (Student)p;
		// 다운캐스팅 (상속일때만 가능하다)
		((Student)p).grade = "A";
		((Student)p).department = "컴퓨터공학과";
	}
}
