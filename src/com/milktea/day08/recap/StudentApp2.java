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
//구조적 프로그래밍
public class StudentApp2 {
	// 필드(멤버변수) 클래스 내에 있는 모든 메소드에 접근이 가능해짐
	static Scanner sc = new Scanner(System.in);
	// static 메소드 안에서는 static끼리만 호출가능하기 때문에
	// 메인메소드 안에 있던 스캐너를 밖으로 꺼내고 static붙여줌
//	static Student student = new Student();
	public static void main(String[] args) {
		end:  // 끝내는 위치를 지정해주고 종료하면 됨 (break 뒤에 세미콜론)
		while(true) {
			int choice = printMenu();			
			switch(choice) {
			// choice는 지역변수> 메소드의 변형을 통해 해결
			case 1: 
				inputStudentData();
				break;
			// 출력	
			case 2: 
				printStudentData();
				break;
			// 종료
			case 3: 
				displayMessage();
//				System.out.println("프로그램이 종료되었습니다."); 
				break end;
			default: 
				displayMessage();
//				System.out.println("1 ~ 3 사이의 수를 입력해주세요");
				break;
			}			
		}
	}
	// printMenu() noReturnNoParam
	static int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice=sc.nextInt();
		return choice;
		// 반환형을 이용해서 구조를 만들고
		// 리턴형을 이용해서 실행을 가능케함
	}
	// inputData()
	static void inputStudentData() {
		System.out.println("====== 성적 입력 ======"); 
		System.out.print("이름 : ");
		Student.name = sc.next();
		System.out.print("국어 : ");
		Student.kor = sc.nextInt();
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		System.out.print("수학 : ");
		Student.math = sc.nextInt();				
	}	
	// printStudentData()
	static void printStudentData() {
		System.out.println("====== 성적 출력 ======"); 
		System.out.println("이름 : " + Student.name);
		System.out.println("국어 : " + Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math);
		System.out.println("총점 : " +  Student.total() ); //** 소괄호!!!!
		System.out.println("평균 : " +  Student.avg() );		
	}
	// displayMessage();
	static void displayMessage() {
		System.out.println("프로그램이 종료되었습니다."); 		
	}

	
}
