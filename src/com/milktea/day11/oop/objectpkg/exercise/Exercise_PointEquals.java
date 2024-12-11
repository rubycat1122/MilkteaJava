package com.milktea.day11.oop.objectpkg.exercise;

public class Exercise_PointEquals {
	/*
	 * Point 클래스의 두 점의 좌표가 같으면
	 * true를 리턴하는 equals()를 작성하고
	 * 2, 3 포인트 객체와 다시 생성한 2, 3 포인트 객체가 
	 * 같도록 출력하는 프로그램을 작성하시오
	 */
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
//		if(p1 == p2) { // 주소값이 다르기 때문에 "다릅니다" 출력됨 
		if(p1.equals(p2)) { 
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}	// 오버라이딩하면 같습니다. 출력됨
	}	
}
