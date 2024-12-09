package com.milktea.day09.recap;

import java.util.Scanner;
// static: 객체의 생성없이도 바로 사용할 수 있다. /new(유틸성 메소드)를 쓰지 않아도 공간을 사용할 수 있게 도와주는 예약어
class Student{
	static String name = "";  // static 메소드 안에서는 static 변수만 사용 가능하므로 모두 static으로 변경필요
	static int kor = 0;
	static int eng = 0;
	static int math = 0;	
	// 배열이 할 수 없는 것들을 클래스를 이용하면 가능해진다.
	// 실제로 메모리상에 값을 저장하고 그 값을 꺼내서 사용할 수 있어진다.(load)
	public static int total() {
		return kor+eng+math;
	}
	public static double avg() {
		return total() /3.0;
	}
}

public class StudentAppGuJo { 
	static Scanner sc = new Scanner(System.in);
//	Student student = new Student();  // static으로 변경해줬기 때문에 다시 선언 필요 없음
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
