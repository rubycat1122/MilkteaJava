package com.milktea.day08.recap;

public class Student{
	static String name = "";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;	
	// 배열이 할 수 없는 것들을 클래스를 이용하면 가능해진다.
	// 실제로 메모리상에 값을 저장하고 그 값을 꺼내서 사용할 수 있어진다.(load)
	public static int total() {
		return kor+eng+math;
	}
	public static double avg() {
		return (kor+eng+math) /3.0;
	}
}
