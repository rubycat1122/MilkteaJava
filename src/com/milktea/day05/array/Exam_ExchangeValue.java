package com.milktea.day05.array;

public class Exam_ExchangeValue {
	public static void main(String []args) {
		int [] spaces = {24, 25};
		System.out.println("배열로 교환하기");
		for(int val: spaces)
			System.out.println(val);
		System.out.println("exchanged!");
		// 교환 코드 작성
		int temp = spaces[0];
		spaces[0] = spaces[1];
		spaces[1] = temp;		
		// 출력코드 작성
		for(int val: spaces)
			System.out.println(val);
		
		
		System.out.println();		
		System.out.println("변수로 교환하기");		
		int space1 = 24;
		int space2 = 25;
		System.out.println(space1);
		System.out.println(space2);
		System.out.println("exchanged!");
		temp = space1; // 사라지는 값을 임시로 저장
		space1 = space2;
		space2 = temp;     // 저장한 값을 불러옴
		System.out.println(space1);
		System.out.println(space2);
		
	}
}
