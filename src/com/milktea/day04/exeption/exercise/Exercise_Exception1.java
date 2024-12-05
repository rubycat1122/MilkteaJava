package com.milktea.day04.exeption.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String []args) {
		/*
		 * 두 개의 정수를 입력받아 나눈 후 
		 * 그 결과를 출력하는 프로그램을 작성하여라.
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
			int result = 0;
			try {			
				System.out.print("첫번째 정수 입력 : ");
				int num1=sc.nextInt();
				System.out.print("두번째 정수 입력: ");
				int num2=sc.nextInt();
				result = num1/num2;
			//멀티 catch절이 가능함(중복으로 사용할 수 있음)
			} catch(ArithmeticException e) {
				//e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
				continue; // 처음으로 바로 돌아감(결과0 실행 안함)
			}catch (InputMismatchException e) {				
				System.out.println("정수를 입력해주세요.");
				sc.next(); // 문자 제거용
				continue;
			}
			System.out.println("결과 : " +result);
		}
	}
}
