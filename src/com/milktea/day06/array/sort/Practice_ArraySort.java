package com.milktea.day06.array.sort;

import java.util.Scanner;

public class Practice_ArraySort {
	public static void main(String[]args) {
//		문제
//		1. 구현
//		 주제 : 5개의 정수를 입력후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오 
//		 - 요구사항
//		     1) 입력은 반복문, Scanner 객체를 사용하여 5번 입력 받아야 함 
//				(정수 5개 입력받는 배열 사용)
//		     2) 정렬 기법은 버블정렬을 이용하여 오름차순 정렬 되어야 함
//		     3) 정렬된 결과 출력은 반복문을 이용하여 출력 되어야 함
//		     4) 마지막에 첫번째 수와 마지막수를 합한 값을 출력할 수 있어야 함
//		 
//		2. 실행 결과  
//
//		ex1)
//		1번째 정수 입력 : 7
//		2번째 정수 입력 : 4
//		3번째 정수 입력 : 8
//		4번째 정수 입력 : 5
//		5번째 정수 입력 : 1
//		정렬된 결과 : 1 4 5 7 8 
//		정렬 후 첫번째 수와 마지막수의 합 : 9
//
//		ex2)
//		1번째 정수 입력 : 5
//		2번째 정수 입력 : 4
//		3번째 정수 입력 : 3
//		4번째 정수 입력 : 2
//		5번째 정수 입력 : 1
//		정렬된 결과 : 1 2 3 4 5 
//		정렬 후 첫번째 수와 마지막수의 합 : 6		
		Scanner sc = new Scanner(System.in);
		
		int arrs[] = new int [5];
		
		for(int i=0; i<arrs.length; i++) {
			System.out.print( (i+1)+"번째 정수 입력: ");
			arrs[i] =sc.nextInt();			
		}
		for(int j=0; j< arrs.length-1; j++ ) {
			for(int i=0; i< (arrs.length-1)-j; i++) {
				if(arrs[i] > arrs[i+1]) {
					int temp = arrs[i+1];
					arrs[i+1]= arrs[i];
					arrs[i]= temp;
				}
			}
		}		
		System.out.print("정렬된 결과 : ");
		for(int num: arrs) {
			System.out.print(num+ " ");
		}		
		System.out.println();
		System.out.print("정렬 후 첫번째 수와 마지막수의 합: "+ (arrs[0]+arrs[arrs.length-1]) );		
		
	}
}
