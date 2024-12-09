package com.milktea.day09.oop;

import java.util.Scanner;

// static을 없애고 작성하는 방법
public class StudentApp {
	Scanner sc = new Scanner(System.in);
//	Student student = new Student();  // 배열로 바꾸자!
	Student [] students = new Student[3];  
	
	public void startProgram() {
		end:
		while(true) {  // true 를 넣어서 무한반복 가능하게
			int choice = printMenu();		// ***** 리턴형을 정한 다음에 메소드 값을 선언해서 넣어줘야 함
			switch(choice) {
				case 1: 
					// 한번 시작하면 3명의 학생의 점수를 모두 입력하는 방식으로 작성하기
					for(int i=0; i< students.length; i++) 
						students[i] = inputStudentData();							
					break;
				case 2:
					for(Student student: students)
						printStudentData(student);					
//					for(int i=0; i< students.length; i++) 
//						printStudentData(students[i]);					
					break;
				case 3: 
					displayMessage("프로그램이 종료되었습니다.");					 
					break end; 
				default: 
					displayMessage("1 ~ 3 사이의 수를 입력해주세요");	
					break;
			}
		}
	}		
	private int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice=sc.nextInt();
		return choice;  
	}
//	private void inputStudentData() {
	private Student inputStudentData() {
		System.out.println("====== 성적 입력 ======"); 
		// 저장을 위해 객체 생성 new Student();
		Student student = new Student();
		System.out.print("이름 : ");
		student.name = sc.next();
		System.out.print("국어 : ");
		student.kor = sc.nextInt();
		System.out.print("영어 : ");
		student.eng = sc.nextInt();
		System.out.print("수학 : ");
		student.math = sc.nextInt();
		return student; // return은 void와 함께 쓸 수 없다. 자료형을 써줘야 한다.
	}
	private void printStudentData(Student student) {
		System.out.println("====== 성적 출력 ======"); 
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : " +  student.total() ); //** 소괄호!!!!
		System.out.println("평균 : " +  student.avg() );
	}
	private void displayMessage(String message) {
		System.out.println(message);
	}
}
