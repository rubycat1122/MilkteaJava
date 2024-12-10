package com.milktea.day10.oop.inheritance.point;
// 부모클래스
public class Point {
	public int pub; 	// public : 모두 공개
	int def;		    //default : 같은 패키지 내에서
	protected int pro;  // protected : 같은 패키지 + 상속한 자식클래스에만
	private int pri; 	// private : 외부로부터 차단 (예외가 없다. 무조건 밖으로 나갈 수 없음)

	
	
	private int x, y;
	
	public Point() {} //생성자
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	// getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void showPoint() {
		System.out.println(x+", "+y);
	}
}
