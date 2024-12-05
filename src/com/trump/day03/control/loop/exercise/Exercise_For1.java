package com.trump.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	/*
	 * 2단을 출력해보겠습니다.
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * 2 * 3 = 6
	 * 2 * 4 = 8
	 * ...
	 * 
	 */
	/*
	 * 문제1
	 * 정수 하나를 입력받아서 그 수가 1~9사이의 수일때만
	 * 그 수의 구구단을 출력하세요.
	 * 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다"를 출력하세요
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		if(dan < 1 || dan > 9) { // OR연산자 이용하여 dan이 1 ~ 9사이의 수가 아니면 메시지 출력
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}else {
			// 구구단 출력
			for(int i = 1;i<10;i++) {
				System.out.println(dan+" * "+i+" = "+dan*i); // 입력받은 정수가 출력하고자 하는 단이므로 2 대신 dan으로 대체
			}
		}
//		sysout
//		for(int i = 1;i<10;i++)
//			System.out.println("2 * "+i+" = "+2*i);
		
//		System.out.println("2 * 1 = 2"); // 2 = 2*1
//		System.out.println("2 * 2 = 4"); // 4 = 2*2
//		System.out.println("2 * 3 = 6"); // 6 = 2*3
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18"); // 18 = 2*9
	}
}
