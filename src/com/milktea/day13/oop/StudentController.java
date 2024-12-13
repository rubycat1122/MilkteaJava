package com.milktea.day13.oop;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView(); // view에 있는 메소드들을 controller 클래스에서 호출
		StudentManage manage = new StudentManage(); // 객체를 새롭게 생성
		exit:
		while(true) {
			int choice = view.mainMenu(); // view에 있는 메인메뉴에 있는 메소드를 이용하겠다
			switch(choice) {
			case 1: 
				Student student = view.inputStudentData(); // 호출한 코드가 너무 길어져서 변수명으로 지정하고 넣어줄것
				manage.insertStudent(student);
				break;
			case 2: 
				Student [] students = manage.getStudents();
//				for(int i = 0; i < 3; i++) {
//					view.printStudentData(students[i]);
//				}
				view.printStudentData(students[0]);
//				view.printStudentData(students[1]);
//				view.printStudentData(students[2]);
				break;
			case 3: 
				view.displayMessage("프로그램이 종료되었습니다.");
				break exit;
			default: view.displayMessage("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
}
