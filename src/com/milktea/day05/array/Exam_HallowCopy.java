package com.milktea.day05.array;

public class Exam_HallowCopy {
	public static void main(String[]args) {
//		int [] arrs = new int [6];
//		arrs[0] =24;
//		arrs[1] =11;
//		arrs[2] =18;
//		arrs[3] =25;
//		arrs[4] =5;
//		arrs[5] =2;	
		int [] dates = {24, 11, 18, 25, 5, 2};
		int [] copied = dates;
		copied[0] = 17;
		dates[3] = 13;
		for(int i=0; i< copied.length; i++) {
			System.out.print(copied[i]+" ");			
		}
		System.out.println();
		for(int i=0; i< dates.length; i++) {
			System.out.print(dates[i]+" ");			
		}
		System.out.println();
		System.out.println(dates.hashCode());
		System.out.println(copied.hashCode());
		// 레퍼런스 치환= 얕은 복사
	}
}
