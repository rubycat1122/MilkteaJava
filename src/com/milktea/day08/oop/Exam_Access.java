package com.milktea.day08.oop;
/*
 * 접근지정자(제한자)
 * 종류 : public, protected, default, private
 */

class Sample{
	public int everyone;
	private int onlyme;
	int onlyus;
}

public class Exam_Access {
	public static void main(String[]args) {
		Sample smp = new Sample();
		smp.everyone = 1118;
//		smp.onlyme = 0;   // 완벽 차단이기 때문에 불러오지 않아서 오류
		smp.onlyus = 502; // default: 같은 클래스 내에 있기 때문에 가능함		
	}
}
