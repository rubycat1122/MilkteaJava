package com.milktea.day09.recap;

import java.util.Scanner;

public class StudentAppGuJo2 { 
	static Scanner sc = new Scanner(System.in);
//	Student [] students = new Student[3];
//	
//	students[0] = new Student();
//	students[0].name = "";
//	
	
	
	public static void main(String[] args) { //메인안에서 동작이 가능하게 해주려면 static을 부여
		while(true) {  // true 를 넣어서 무한반복 가능하게
			int choice = printMenu();		// ***** 리턴형을 정한 다음에 메소드 값을 선언해서 넣어줘야 함
			switch(choice) {
				case 1: 
					inputStudentData();					
					break;
				case 2: 
					printStudentData();					
					break;
				case 3: 
					displayMessage("프로그램이 종료되었습니다.");					 
					break;
				default: 
					displayMessage("1 ~ 3 사이의 수를 입력해주세요");	
//					System.out.println("1 ~ 3 사이의 수를 입력해주세요");	
					break;
			}
		}		
	}
//	void printMenu() // 시작할 때는 리턴이 없고 매개변수가 없는 형태로 작성해줌
	static int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice=sc.nextInt();
		return choice;  // printMenu 안에 choice값을 선언을 해줘야 함
	}
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
	static void printStudentData() {
		System.out.println("====== 성적 출력 ======"); 
		System.out.println("이름 : " + Student.name);
		System.out.println("국어 : " + Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math);
		System.out.println("총점 : " +  Student.total() ); //** 소괄호!!!!
		System.out.println("평균 : " +  Student.avg() );
	}
	static void displayMessage(String message) {
		System.out.println(message);
	}
}
