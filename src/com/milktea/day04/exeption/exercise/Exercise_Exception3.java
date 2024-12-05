package com.milktea.day04.exeption.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception3 {
	public static void main(String[]args) {
		/*
		 * 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		 * 사용자가 정수가 아닌 문자를 입력할 때 발생하는 
		 * InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		 * 정수 3개를 입력하세요.
		 * 11 2 3
		 * 합은 16
		 * 
		 * 정수 3개를 입력.
		 * 11 a
		 * 정수를 입력해주세요
		 * 2 3
		 * 합은 16 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요: ");
		int sum=0; // 누적합을 위한 변수 sum
		//for문 i가 0부터 시작해서 3이 안될때까지 1씩 증가함
		for(int i=0; i<3; i++) {
			// try-catch 누적값에 잘못된 입력값이 들어가면 catch절이 시작하고
			// 다시 try를 실행하게 됨 (for문 안에 들어있는 코드이기 때문)
			
			try {
				int num = sc.nextInt();
				sum += num;
			}
			// 누적을 없애기 위해서 catch에서 i-- 로 만드는 것
			catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요");
				sc.next();
				i--; // i = i-1; //******************** 중요!
			}						
		}								
	System.out.println("합은 : "+sum);		

	}
}
