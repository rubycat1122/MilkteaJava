package com.milktea.day08.oop;
// 기존 day01에 있던 클래스 만들어서 다시 정리해보기 (day01.basic)
public class Circle {
	final double PI = 3.14;
	double radius;
	
	public double getArea() {
		return PI * radius * radius ;
	}	 
	
	public static void main(String []  args) {
		Circle pizza = new Circle();
		pizza.radius = 10; // radius가 어디에 있는 변수인지를 지정해 줘야함.(주소값)
		System.out.println( pizza.getArea() );  
		// 위에 있는 필드를 메인 메소드를 만들어서 출력할 수 있음.
		// main이 없는 클래스는 실행(화면출력 sysout)이 불가능하다.
		// 출력을 위해서 소괄호 안에 pizza.getArea() 를 넣어줘야 함
		
		Circle donut = new Circle();
		donut.radius = 2;
		System.out.println(donut.getArea() );
	}
	
}
