package com.milktea.day10.oop.encapsulation;
// 캡슐화의 원칙을 이용한 메소드-필드
class CircleVO{
	private int radius;
	
	public CircleVO() {}
	
	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}	
}

public class Circle {
	
	public static void main(String[]args) {
		// 클래스 내에 private으로 변수 메소드를 설정해서 접근 불가
		// 동일 패키지 내에서 private이 아니면 접근이 가능하다
//		CircleVO circle = new CircleVO();
//		circle.radius = 10;
		CircleVO circle = new CircleVO(); // 생성자
		circle.setRadius(10);
		System.out.println("넓이 : " + circle.getArea() );
	}
}
