package com.trump.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) throws IOException {
		System.out.print("반지름 입력 : ");
		//int input = System.in.read();
		//System.out.println("출력 : " + (input-48));
		Scanner sc = new Scanner(System.in);	// 무조건 작성
		//int input = sc.nextInt();				// 정수 입력 nextInt
		double radius = sc.nextDouble();		// 실수 입력 nextDouble
		String msg = sc.next();					// 문자열 입력 next
		//System.out.println("입력 받은 값 : " + input);
		final double PI = 3.14;
		
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적 : " + circleArea);
	}
}
