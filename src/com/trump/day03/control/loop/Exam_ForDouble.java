package com.trump.day03.control.loop;

public class Exam_ForDouble {
	public static void main(String [] args) {
		/*
		 * 2 ~ 9단 구구단을 출력하시오.
		 */
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10 ;j++)  {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		
		for(int j = 2; j < 10; j++) {
			for(int i = 1;i < 10;i++) {
				System.out.println(j+" * "+i+" = "+j*i);
			}
		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("2 * "+i+" = "+2*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("3 * "+i+" = "+3*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("4 * "+i+" = "+4*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("5 * "+i+" = "+5*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("6 * "+i+" = "+6*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("7 * "+i+" = "+7*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("8 * "+i+" = "+8*i);
//		}
//		for(int i = 1;i < 10;i++) {
//			System.out.println("9 * "+i+" = "+9*i);
//		}

	}
}
