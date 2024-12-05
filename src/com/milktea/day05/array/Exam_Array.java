package com.milktea.day05.array;

public class Exam_Array {
	public static void main(String[]args) {
		/*
		 * 배열의 선언
		 * 배열의 생성
		 * 배열의 초기화
		 * 배열의 데이터 저장
		 *  : 값을 입력하기 전까지 기본값은 0임
		 * 배열의 데이터 출력
		 */
		int [] nums;
		nums = new int[10];
		nums[0]= 11;
		nums[1]= 18;
		
//		System.out.println(nums[10]);  ==>ArrayIndexOutOfBoundsException
//		10개의 공간일때 숫자는 9까지 가능 방번호 초과하면 예외(오류)가 생긴다.
		
		// for문으로 데이터 저장
		for(int i=0;i<10;i++)	
			nums[i] = (1+i);
		
		// for문으로 데이터 출력
		for(int i=0;i<10;i++)	
			System.out.println(nums[i]);
		
		
		
	}
}
