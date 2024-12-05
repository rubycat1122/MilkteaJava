package com.trump.day02.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 * 삼항연산자
		 * (조건식) ? 참일때 : 거짓일때
		 * String result = (num % 2) == 0 ? "짝수" : "홀수";
		 * System.out.println(result+"입니다.");
		 */
		// 예제1. 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		// import -> import java.util.Scanner, ctrl + space bar를 단어의 끝에 커서를 두고 누름
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		String result = ((input % 2) == 0) ? "짝수" : "홀수";
		System.out.println(result + "입니다.");
	}
}
