package com.milktea.day12.oop.wrapperpkg;

public class Exam_Wrapper {
	// 클래스化해서 객체로 만듦
	public static void main (String []args) {
		int num = 10;		// int 보라색 기본형 변수 Integer 빨간색 참조형 변수
		num = 1118;
		Integer su = null;
		//su = new Integer(10); //The constructor Integer(int) has been deprecated since version 9 and marked for removal
		su = Integer.valueOf(502); //원칙 // null체크가 가능한 변수가 됨
		if(su != null) {
			su = 1225; // 오토-박싱(auto-boxing)
		}
		num = su.intValue(); // 원칙 int에 Integer라는 객체를 넣을 때
		num = su; 			 // 오토-언박싱(auto-unboxing)
		Double du = Double.valueOf(11.18);
		du = 5.02;
		double dNum = du.doubleValue();
		dNum = du;
		// Wrapper 클래스를 쓰는 이유
		// 1. Null 체크가 가능해짐, int-> 0, double -> 0.0, String -> null => 모두 다 널로 체크 가능
		// 2. 형변환 가능, String->int, String-> boolean
		String openDate = "20241118"; // 문자형이기 때문에 연산이 동작하지 않는다.
		System.out.println(openDate+1);
		int openDateNum = Integer.parseInt(openDate);
		System.out.println(openDateNum+1); // 잠깐 숫자로 변환해서 사용할 수 있다!
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('b'));
		char c1 ='5', c2 ='F';
		if(Character.isDigit(c1))
			System.out.println("숫자입니다.");
		if(Character.isAlphabetic(c2))
			System.out.println("영문자입니다.");
		// =========== 문자열로 바꾸기 =============
		/*
		 * 1. String.valuOf(1);
		 * 2. + "" 붙이기
		 * 3. .toString()
		 */
		System.out.println(1);
		System.out.println(String.valueOf(1) instanceof String );
		System.out.println(1+"" instanceof String);
		System.out.println(Integer.valueOf(1).toString() instanceof String);
	}
}
