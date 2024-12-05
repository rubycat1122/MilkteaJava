package com.milktea.day04.recap;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한반복을 하기 위한 반복문
		// 1. for(;;) {}
		// 2. while(true) {}
		// 반복문 사용을 위해서는 중괄호 안에 넣을 코드(반복)와 밖에 있을 코드를 정해줘야 함
		int kor=0;  // 지역변수: 하나의 구역에서 선언한 변수는 그 안에서만 사용 가능 
		int eng=0; //원래는 중괄호{}안에서는 하나의 변수로 가능한데, 
		int math=0;	//switch는 특이하게 각 case 안에서 작용	그래서 변수를 switch 바깥에서 선언해준다.
	//(입력값 초기화가 반복될 필요는 없기 때문에 바깥에서 선언해줌)
		while(true) {			
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			// switch ~ case 활용			
			
			switch(choice) {
			case 1 :  
				System.out.println("===== 성적 입력 ====="); 
				System.out.print("국어 : ");  
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();								
				break;
			case 2 : 
				System.out.println("===== 성적 출력 ====="); 
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + (kor+eng+math) );
				System.out.println("평균 : " + (kor+eng+math)/(double)3 );
				break;
			case 3 : 
				System.out.println("프로그램이 종료되었습니다."); 
				return;		
			}
		}
		
		
		
		
		
		
	}
}
