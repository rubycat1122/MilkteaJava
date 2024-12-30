package com.milktea.day13.oop;

import java.util.List;

// 저장하고 로드하는 기능 클래스

/*
 * 최종저장소를 가지고 있으면서
 * View에서 입력받은 데이터를 받아서
 * 저장하거나 필요할 때 로드해주는 클래스로 Manage클래스를 생성
 */
public class StudentManage {
	private List<Student> sList; 
	private Student [] students;
	private int		   index;
	
	public StudentManage() {
		students = new Student[3];
		index = 0;
	}
	/*
	 * insertStudent() 메소드는 Student객체를 전달받아서
	 * 최종저장소인 객체배열(리스트)에 저장하는 메소드임.
	 * Controller에서 호출함. 호출할 때 student 객체를 넘겨줌
	 * 넘겨주니까 받아야 되고 받아야 되니까 매개변수 작성(넘겨주는 값의 타입으로)
	 */
	public void insertStudent(Student student) {
//		sList.add(student);
		students[index] = student;
		index++;				
		
		// 입력받는 코드는 view클래스에서 정리했기 때문에 여기서는 필요없다.
//		String name = sc.next();
//		students[index].setName(name);
//		students[index].setKor(sc.nextInt() );
//		students[index].setEng(sc.nextInt() );
//		students[index].setMath(sc.nextInt() );
		
//		for (int i =0; i<students.length; i++) {
//			students[i] = new Student();
//			students[i].name = "일용자";
//			students[i].kor = 99;
//			students[i].eng = 88;
//			students[i].math = 77;			
//		}
	}
	/*
	 * 리턴형은 왜 Student []인가
	 * 이 메소드가 하는 역할은?
	 * 저장소(객체배열 또는 리스트)가 가지고 있는 
	 * 모든 데이터를 로드하는 역할
	 * Controller에서 호출되었을 때 모든 데이터가 넘어 올것을 기대함
	 * 그 데이터를 넘겨주어야 하고
	 * 넘겨주려면 return students; 또는 return sList; 를 써야함
	 * students의 타입이 Student[] 이므로 void 대신 배열 Student []로 변경 
	 */
	public Student [] getStudents() {
		return students; // 모든 정보를 다 리턴;
	}
}




