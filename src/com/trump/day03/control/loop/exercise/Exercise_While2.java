package com.trump.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	/*
	 * while문을 이용하여 -1이 입력될때까지
	 * 정수를 입력받고 -1이 입력되면
	 * 입력한 수의 합을 출력하시오.
	 * 값 : 1
	 * 값 : 2
	 * 값 : -1
	 * 합 : 3
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		// #4
		System.out.print("값 : ");
		int lastNum = sc.nextInt();
		while(lastNum != -1) {
			sum += lastNum;
			System.out.print("값 : ");
			lastNum = sc.nextInt();
		}
		System.out.println("합 : " + sum);
		
		// #3
		while(true) {
			System.out.print("값 : ");
			int num = sc.nextInt();
			if(num == -1) {
				break;
			}
			sum += num;
		}
		System.out.println("합 : " + (sum));
		// #2
		while(i < 1) {
			System.out.print("값 : ");
			int num = sc.nextInt();
			sum += num;
			if(num == -1) {
				System.out.println("합 : " + (sum +1));
				return;
			}
		}
		// #1
		System.out.print("값 : ");
		int input = sc.nextInt();
		while(input != -1) {
			// 실행문장;
			sum += input;
			System.out.print("값 : ");
			input = sc.nextInt();
			//int num = sc.nextInt();
			//sum += input;
			//i++;
		}
		System.out.println("합 : " + sum);
//		System.out.print("값 : ");
//		int num = sc.nextInt();
//		System.out.print("값 : ");
//		num = sc.nextInt();
//		System.out.print("값 : ");
//		num = sc.nextInt();
//		System.out.println("합 : 3");
	}
}
