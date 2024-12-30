package com.milktea.day2x.enumex;

interface University{
	int SEOUL = 1;
	int YONSEI = 2; 
	int KOREA = 3;
}

enum Major{
	KOREAN, MATH, ENGLISH, SCIENCE
}
// enum을 이용하면 다른 값이 들어가지 못하도록 해준다. => 타입안정성이 보장됨

//interface Major{
//	int KOREAN = 1;
//	int MATH = 2;
//	int ENGLISH = 3;
//	int SCIENCE = 4;
//}

public class Exam_Enum2 {
	public static void main(String[] args) {
		Major major = Major.MATH;
//		int major = Major.MATH;			// 원래는 Major 값이 아니면 들어가지 못하도록 체크해줘야 함.
		// major = University.SEOUL; => interface를 이용한 코드 활용 시 출력값이 "국어전공"이 됨. 
		//								동일값에 대해서 똑같이 동작하는 문제가 생긴다.
		
		switch(major) {
		case KOREAN : 
			System.out.println("국어전공");
			break;
		case MATH : 
			System.out.println("수학전공");
			break;
		case ENGLISH : 
			System.out.println("영어전공");
			break;
		case SCIENCE : 
			System.out.println("과학전공");
			break;
		}
	}
}
