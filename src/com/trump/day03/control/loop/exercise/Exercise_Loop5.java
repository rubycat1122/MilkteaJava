package com.trump.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {
	/*
	 * 문제5
	 * 사용자로부터 입력 받은 숫자의 구구단을 출력하세요.
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 구구단 출력 프로그램 ===");
		System.out.print("출력하고 싶은 숫자를 입력 : ");
		int dan = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
}
