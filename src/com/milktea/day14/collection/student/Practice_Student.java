package com.milktea.day14.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice_Student {
	public static void main(String[] args) {
	// <<<< view : 값을 입력받는 부분
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 : ");
		int secondScore = sc.nextInt();
		// 최종적으로는 Student 객체에 넣어야 함.
		// 1. 기본생성자 이용
		Student student = new Student();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		
	// <<<< mng : 
		// 2. 매개변수 있는 생성자 이용 (기본생성자보다 더 짧다)
		student = new Student(name, firstScore, secondScore);
		// 그 후에는 ArrayList 객체에 넣어야 함
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(student); 
		// 배열보다 향상된 기능이 있는 공간에 student 값이 생김
//		Student [] stds = new Student[3];
//		stds[0] = student;
//		System.out.println(stdList.get(0));
		Student std = stdList.get(0);  // 오버라이딩 한 형태대로 나온다.
		System.out.println(std.toString());   // 컨트롤러 view.displayStudents(sList);
	}
	
	// 이 내용을 기본으로 해서 클래스를 나눠서 작성할 줄 알아야 함
	// 어려울 때는 눈에 보이는 형태부터 작성해서 뼈대를 세우고 (구현되는 부분 view 부터)
	// 그 후에 로직대로 정리
	
}
