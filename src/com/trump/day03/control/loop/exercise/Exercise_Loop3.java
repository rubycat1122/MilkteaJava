package com.trump.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {
	/*
	 * 문제3
	 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
	 * 더해지는 숫자를 표시해주세요.
	 * 정수 하나 입력 : 5
	 * 1+2+3+4+5=15
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i != input)
				System.out.print(i+"+");
			else
				System.out.print(i+"=");	
		}
		System.out.print(sum);
	}
}
