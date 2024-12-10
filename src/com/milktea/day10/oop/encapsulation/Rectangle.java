package com.milktea.day10.oop.encapsulation;

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
	private int width;
	private int height;
	
	// setter
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// getter
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	public int getArea() {
		return width * height;
	}
	public static void main(String []args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		
		// 직접 접근이 아니라 우회접근을 통해 작동하도록 하는 것
		int width = sc.nextInt();
		rect.setWidth(width);
		int height = sc.nextInt();
		rect.setHeight(height);
		System.out.println("사각형의 면적은 : " + rect.getArea() );	
	}
}
	
