package com.milktea.day06.array.sort;

public class Exam_SelectionSort {
	/*
	 * 선택정렬이란?
	 * 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
	 * 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬,
	 * 데이터의 양이 많을 때 급격한 성능 저하를 보임.
	 */
	
	public static void main(String[]args) {
		// 버블 소트처럼 단순 반복해서 코드를 증가시켜서는 값이 안 나옴
		// 비교대상인 인덱스 자리는 고정이고 계속 최소값의 위치가 바뀌기 때문
				
		int [] arrs = {2, 5, 4, 1, 3}; // 최소값 찾기
//		int min = 0;  ----> 0을 i로 바꿔서 넣어야 함 그리고 선언을 위해 for문 안으로
		for(int i = 0; i < arrs.length; i++) {
			int min = i;
			for(int j = i+1; j < arrs.length; j++) {
			if(arrs[min] > arrs[j]) {    
				min = j;			 
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		
		// 값출력 ↓↓↓↓↓↓
		for(int num: arrs) {
			System.out.print(num+" ");
		}
		
//		for(int j = 1; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) { // ***arrs[min]**** 가장 작은 값으로 구해야하기 때문에 
//				min = j;			  // 인덱스 0으로 고정하면 안되고 최소값으로 설정해줌
//			}
//		}
//		int temp = arrs[0];
//		arrs[0] = arrs[min];
//		arrs[min] = temp;
//		// 두번째 사이클
//		for(int j = 2; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {    
//				min = j;			 
//			}
//		}
//		temp = arrs[1];
//		arrs[1] = arrs[min];
//		arrs[min] = temp;
//		// 세번째 사이클 
//		for(int j = 3; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {    
//				min = j;			 
//			}
//		}
//		temp = arrs[2];
//		arrs[2] = arrs[min];
//		arrs[min] = temp;		
//		// 네번째 사이클 
//		for(int j = 4; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {    
//				min = j;			 
//			}
//		}
//		temp = arrs[3];
//		arrs[3] = arrs[min];
//		arrs[min] = temp;				
		
//		if(arrs[0] > arrs[1]) {
//			// 인덱스값(대괄호 안의 숫자)을 기억하는 코드로 작성 (여기서는 min)
//			min = 1;
//		}
//		if(arrs[0] > arrs[2]) {
//			min = 2;
//		}
//		if(arrs[0] > arrs[3]) {
//			min = 3;
//		}
//		if(arrs[0] > arrs[4]) {
//			min = 4;
//		}		
	}
}
