package com.milktea.day10.oop.overriding;

public class Line extends Shape {
	@Override
	public void draw() {
//		// TODO Auto-generated method stub
//		super.draw();  // super. 지워주면 재정의 할 수 있다.
		System.out.println("Line");
	}
}
