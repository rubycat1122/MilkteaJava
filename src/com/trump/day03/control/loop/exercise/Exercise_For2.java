package com.trump.day03.control.loop.exercise;

public class Exercise_For2 {
	/*
	 * 문제2-1
	 * 1부터 10까지의 덧셈을 구하는 프로그램을 작성하여라.
	 * 55
	 * 문제2-1
	 * 1부터 10까지 덧셈을 표시하고 합도 구하는 프로그램을 작성하여라.
	 *  1+2+3+4+5+6+7+8+9+10=55
	 */
	/*
	 * sum = 1;
	 * sum = 1+2; -> sum = sum + 2;
	 * sum = 1+2+3; -> sum = sum + 3;
	 * sum = 1+2+3+4; -> sum = sum + 4;
	 *
	 * sum = 1+2+3+4+5+6+7+8+9+10 -> sum = sum + 10;
	 */
//			System.out.print(i);
	public static void main(String [] args) {
		int sum = 0; // 연산은 두개의 항이 필요하므로 sum을 선언하여 i와 더해줌, 
		for(int i = 1;i<=10;i++) {
			sum = sum + i; // sum += i // 누적합,
			// a = a + b -> a += b;
			if(i != 10) System.out.print(i+"+");
			else System.out.print(i+"=");
		}
		System.out.println(sum);
		//System.out.println(1+2+3+4+5+6+7+8+9+10);
	}
}
