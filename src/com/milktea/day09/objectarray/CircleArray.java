package com.milktea.day09.objectarray;

class Circle {
	int radius;
	// 기본 생성자
	public Circle() {
		radius = 0;
	}
	// 매개변수가 있는 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[]args) {
//		Circle circle = new Circle();
//		circle.radius = 10;
		Circle circle = new Circle(10);
		// 생성자를 이용해서 더 효율적으로 코드를 작성할 수 있다.
		// 위에 두 줄을 한 줄로 간결하게 쓸 수 있음.
		
		Circle [] circles = new Circle[5];
		circles[0] = new Circle();  // 반드시 () 한번 더 선언해 줘야 객체를 만들어줄 수 있다.
		circles[0].radius = 10;
		System.out.println( circles[0].getArea() );
		// 반드시 객체를 생성을 해 줘야 필드나 메인에서 사용이 가능해진다.
	}
}
