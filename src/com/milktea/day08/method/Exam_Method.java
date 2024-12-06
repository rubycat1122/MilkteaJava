package com.milktea.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 O, X
	 * 매개변수 O, X
	 * 
	 * 리턴형 X, 매개변수 X  parameter
	 * 리턴형 X, 매개변수 O
	 * 리턴형 O, 매개변수 X
	 * 리턴형 O, 매개변수 O
	 */
	public void noReturnNoParm() {
		System.out.println("noReturnNoParm");
		return; // void가 있으므로 return; 안 적어도 실행 가능하다 
	}
	public void noReturnYesParam(int num) {
//		int num = 20250502;  // 매개변수를 메소드에 선언했으므로 따로 실행문 안에서 안해도 됨  
		System.out.println("num : " + num);
	}
	
	public int yesReturnNoParam() {
		int date = 20241118;
		return date; // return을 생략할 수 없고 값을 꼭 정해줘야 함
		// 변수 값을 정해줬으면 변수명을 적어주고 변수가 없으면 값을 직접 입력
	}
	
	public int yesReturnYesParam(int num) {
		num += 10; 
		return num;
	}
	
	public int sum(int ...numbers) {
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		return sum;
	}
	
}
