package com.trump.day03.control.loop;

import java.util.Scanner;

public class Exam_DoWhile {
	/*
	 * while문을 이용하여 -1이 입력될때까지
	 * 정수를 입력받고 -1이 입력되면
	 * 입력한 수의 합을 출력하시오.
	 * 값 : 1
	 * 값 : 2
	 * 값 : -1
	 * 합 : 3
	 */
	public static void main(String [] args) {
		/*
		 * 제어문 - 반복문
		 * 3. do ~ while
		 * do {
		 * 	실행문장; 
		 *  증감식;
		 * }while(조건식);
		 */
		int input = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("값 : ");
			input = sc.nextInt();
			if(input == -1) break;
			sum += input;
		}while(input != -1);
		System.out.println("합 : " + (sum));
	}
}
