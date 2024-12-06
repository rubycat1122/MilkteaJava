package com.milktea.day08.method;

public class Run_Method {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Exam_Method em = new Exam_Method();
		
		// 리턴형 X, 매개변수 X 
		em.noReturnNoParm();
		// 리턴형 X, 매개변수 O
		em.noReturnYesParam(20250502);		
		// 리턴형 O, 매개변수 X
		System.out.println( em.yesReturnNoParam() ); 
		// return 값을 정해줬기 때문에 괄호 안이 비어있어도 그대로 그 값이 됨
		
		// 리턴형 O, 매개변수 O
		int result = em.yesReturnYesParam(1000);
		System.out.println(result);
		
		result = em.sum(1, 2, 3, 4, 5); // ...을 써줬기 때문에 결과창에서 한번에 여러개를 직접 기입가능
		System.out.println("result : "+result);
		
	}
}
