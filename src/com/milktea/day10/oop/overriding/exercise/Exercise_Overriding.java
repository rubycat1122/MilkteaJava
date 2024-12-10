package com.milktea.day10.oop.overriding.exercise;

class SuperClass{
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object"); 
	}
}

class SubClass extends SuperClass{
	void paint() {
		super.paint(); // 동적 바인딩에 의해서 Sub Object가 실행됨
		super.draw();  // 부모가 가지고 있는 값을 그대로 출력=>Super Object 가 실행됨
	}
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint(); // ---> SubClass에 있는 void paint의 값이고  
					// super.paint의 값은 새로 덧씌워졌기 때문에 "Sub Object"로 출력
	}
}