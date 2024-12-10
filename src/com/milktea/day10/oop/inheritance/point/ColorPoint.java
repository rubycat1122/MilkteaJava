package com.milktea.day10.oop.inheritance.point;
// 자식클래스
public class ColorPoint extends Point{
// 상속을 통한다면 굳이 같은 내용 반복 기재하지 않아도 됨
//	private int x, y;
	private String color;
	
	public ColorPoint() {
		super(); // 생성자를 불러와서 부모 클래스의 객체를 생성함. 생략이 가능함.
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void showColorPoint() {
		super.showPoint(); //super.는 부모클래스를 호출하는 기능. 생략이 가능하다.
		System.out.println(this.color + "색의 점입니다.");
	}
}
