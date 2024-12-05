package com.trump.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop6 {
	/*
	 * 문제6
	 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	 * 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	 * 단을 입력하세요 : 5
	 * 5단부터 9단까지 출력
	 * 단을 입력하세요 : 10
	 * 9 이하의 숫자만 입력해주세요.
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		if(dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}else {
			for(int k = dan; k <= 9 ;k++) {
				for(int i = 1; i < 10; i++) {
					System.out.println(k + " * " + i + " = " + k*i);
				}
			}
//			for(int i = 1; i < 10; i++) {
//				System.out.println(dan+1 + " * " + i + " = " + (dan+1)*i);
//			}
//			for(int i = 1; i < 10; i++) {
//				System.out.println(dan+2 + " * " + i + " = " + (dan+2)*i);
//			}
//			for(int i = 1; i < 10; i++) {
//				System.out.println(dan+3 + " * " + i + " = " + (dan+3)*i);
//			}
//			for(int i = 1; i < 10; i++) {
//				System.out.println(dan+4 + " * " + i + " = " + (dan+4)*i);
//			}
		}
	}
}







