package com.milktea.day08.oop;

import java.util.Scanner;

/*
 * 너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
 * 너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
 * Rectangle 클래스를 만들어 활용하라.
 * 
 * >> 4 5
 * 사각형의 면적은 20
 */
public class Rectangle {
	double width;
	double height;
	
	public double getArea() {
		return width * height;
	}
	
	public static void main(String []args) {
		Rectangle square = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		
		square.width = sc.nextDouble();
		square.height = sc.nextDouble();
		System.out.println("사각형의 면적은 : " + square.getArea() );
		
	}
}
