package com.milktea.day11.oop.objectpkg.exercise;

public class Point {
	private int x, y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//toString + Ctrl + 스페이스바 (오버라이딩)
	@Override
	public boolean equals (Object obj) {
		Point p = (Point)obj; // 다운캐스팅
		return this.x == p.x && this.y == p.y; 
//		return super.equals(obj);
	}
}
