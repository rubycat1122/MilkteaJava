package com.trump.day03.control.loop.exercise;

public class Exercise_While1 {
	/*
	 * 문제1-1
	 * While문을 이용하여 1 ~ 10까지의 수를 더한 값을 출력하시오.
	 * 문제1-2
	 * While문을 이용하여 1 ~ 100사이의 홀수의 합을 출력하시오.
	 */
	public static void main(String[] args) {
		// 문제 1-1
		int sum = 0;
		int i = 1; 
		// #2
		while(i <= 100) {
			sum += i;
			i+= 2; // i = i + 2; -> i += 2;
		}
		System.out.println(sum);
		// #1
		while(i <= 100) {
			// 문제 1-2
			if(i % 2 != 0) {
				sum += i; // sum = sum + i;
				if(i != 99)
					System.out.print(i+"+");
				else
					System.out.print(i+"=");
			}
			i++;
		}
		System.out.println(sum);
	}
}
