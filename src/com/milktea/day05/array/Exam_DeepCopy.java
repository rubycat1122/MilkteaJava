package com.milktea.day05.array;

public class Exam_DeepCopy {
	public static void main(String[]args) {
		int origins [] = {24, 11, 18, 25, 5, 2};
		// 깊은 복사하는 코드
		int copied [] = new int[6];
//		for(int i=0; i<copied.length; i++) {
//			copied[i] = origins[i];
//		}		
		int j=0;
		for(int value: origins) {
			copied[j] = value;
			j++;
		}
		
		copied[0]=25;
		origins[3]=26;
		for(int i = 0; i <copied.length; i++)
			System.out.print(copied[i]+" " );
		System.out.println();
		for(int num:copied) {
			System.out.print(num+" " );
		}		
		System.out.println("  for-each" );		
		for(int i = 0; i <origins.length; i++)
			System.out.print(origins[i]+" " );
		System.out.println( );
		for(int num:origins) {
			System.out.print(num+" ");
		}
		System.out.println("  for-each" );
		System.out.println( );
	}
}
