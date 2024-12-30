package com.milktea.day2x.innerclass;

interface MyInterface{
	void doSomething();
}

class Outer{
	class InstatnceClass {}			// 인스턴스 클래스
	static class StaticClass {}		// 스태틱 클래스
	
	void sample() {
		class LocalClass {}			// 지역 클래스
	}
	
	MyInterface instance = new MyInterface() {
		// 인터페이스는 원래 new 선언이 안되는데, 새로 정의해서 쓰는 대신에 
		// 안의 내용을 오버라이딩 해서 사용할 수 있게 해 줌  => 익명 클래스
		@Override
		public void doSomething() {
			// 구현할 내용
		}
	};
}

public class Exam_InnerClass2 {
	/*
	 * 이너클래스의 종류
	 * 1. 인스턴스 클래스 : 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 사용됨
	 * 2. 스태틱 클래스 : 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 static 멤버처럼 사용됨
	 * 3. 지역 클래스 : 외부 클래스의 메서드나 초기화 블럭 안에 선언하며 선언된 메서드 블록 영역 내부에서만 사용됨
	 * 4. 익명 클래스 : 클래스의 선언과 개체의 생성을 동시에 하는 이름없는 클래스로 일회용으로 사용됨.
	 */
}
