package com.milktea.day13.oop;

// 저장하고 로드하는 기능 클래스
public class StudentManage {
	private Student [] students;
	private int		   index;
	
	public StudentManage() {
		students = new Student[3];
		index = 0;
	}
	
	public void insertStudent(Student student) {
		
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
	public Student [] getStudents() {
		return students; // 모든 정보를 다 리턴;
	}

}
