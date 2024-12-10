package com.milktea.day10.oop.inheritance;

import com.milktea.day10.oop.inheritance.point.Point;

class Super{
	public int pub; 	// public : 모두 공개
	int def;		    // default : 같은 패키지 내에서
	protected int pro;  // protected : 같은 패키지 + 상속한 자식클래스에만
	private int pri; 	// private : 외부로부터 차단 
						// (예외가 없다. 무조건 밖으로 나갈 수 없음)
}

class Sub extends Super{
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
//		super.pri = 4;	
		Super sup = new Super();
		sup.pub = 502;
		sup.def = 1118;
		sup.pro = 1225;
//		sup.pri = 101;
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 114;
//		p.def = 119; // 같은 패키지 아니므로 소환불가
//		p.pri = 113; // private이므로 불가
//		p.pro = 111; // 같은 패키지 아니기 때문에 불가
		super.pub = 111;
//		super.def = 110; // 같은 패키지 아니므로 불가
		super.pro = 112; // 상속을 했으므로 가능
//		super.pri = 120;
	}
}

public class Exam_Protected {
	
}
