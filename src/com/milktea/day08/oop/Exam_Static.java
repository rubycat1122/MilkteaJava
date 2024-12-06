package com.milktea.day08.oop;

import java.util.Random;

class StaticSample{
	// non-static 메소드
	public int num;
	public void normalMethod() {}
	// static 메소드
	// 공유 메모리 효율성 등이 좋음, new로 새롭게 선언하지 않아도 바로 사용이 가능
	public static int input; 
	public static void staticMethod() {}
}

public class Exam_Static {
	public static void main (String []args) {
		StaticSample sample = new StaticSample();
		sample.num = 11;
		sample.normalMethod();		
		
		StaticSample.input = 10;
		StaticSample.staticMethod();
		
		Random rand = new Random();
		rand.nextInt(10);
		
		int num = (int)Math.random()*10+1;
		// math클래스가 바로 대표적인 static 메소드다. utility성 코드들.
	}
	
}
