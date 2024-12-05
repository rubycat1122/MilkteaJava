package com.milktea.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String[]args) {
		 int [] arrs = {1, 3, 2};
		
		 int temp = arrs[1];
		 arrs[1] = arrs[2];
		 arrs[2] = temp;
			 
		for(int val : arrs)
			System.out.println(val);	
		
	}
}
