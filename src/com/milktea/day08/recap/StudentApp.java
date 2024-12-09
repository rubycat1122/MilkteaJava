package com.milktea.day08.recap;

import java.util.Scanner;

//class Student{
//	String name = "";
//	int kor = 0;
//	int eng = 0;
//	int math = 0;	
//	// 배열이 할 수 없는 것들을 클래스를 이용하면 가능해진다.
//	// 실제로 메모리상에 값을 저장하고 그 값을 꺼내서 사용할 수 있어진다.(load)
//	public int total() {
//		return kor+eng+math;
//	}
//	public double avg() {
//		return (kor+eng+math) /3.0;
//	}
//}

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		end:  // 끝내는 위치를 지정해주고 종료하면 됨 (break 뒤에 세미콜론)
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("====== 성적 입력 ======"); 
				System.out.print("이름 : ");
				student.name = sc.next();
				System.out.print("국어 : ");
				student.kor = sc.nextInt();
				System.out.print("영어 : ");
				student.eng = sc.nextInt();
				System.out.print("수학 : ");
				student.math = sc.nextInt();				
				break;
			// 출력	
			case 2: 
				System.out.println("====== 성적 출력 ======"); 
				System.out.println("이름 : " + student.name);
				System.out.println("국어 : " + student.kor);
				System.out.println("영어 : " + student.eng);
				System.out.println("수학 : " + student.math);
				System.out.println("총점 : " +  student.total() ); //** 소괄호!!!!
				System.out.println("평균 : " +  student.avg() );
				break;
			// 종료
			case 3: 
				System.out.println("프로그램이 종료되었습니다."); 
				break end;
			default: 
				System.out.println("1 ~ 3 사이의 수를 입력해주세요");
				break;
			}
			
		}
	}
}
