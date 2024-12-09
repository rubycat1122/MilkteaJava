package com.milktea.day09.objectarray;

class Student{
	String name;
	int kor;
	int eng;
	int math;	
	// 기본 생성자(생략가능): JVM이 알아서 생성해줌
	public Student(String name) {
		this.name = name;
	}
	// return타입을 지정할 수 없음! void 쓰지마! 그냥 없는것
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	
//	public void total() {  // 먼저 void로 작성한 후에 자료형을 변경하기
	public int total() {
		return kor+eng+math;
	}
	public double avg() {
		return (kor+eng+math) / 3.0;
	}
}

public class StudentArray {
	public static void main(String[] args) {
		Student [] students = new Student[3];
		students[0] = new Student("일용자", 99, 88, 77); // 생성자를 이용하면 한줄로 처리 가능!
		students[1] = new Student("이용자", 99, 88, 77); 
		students[2] = new Student("삼용자", 99, 88, 77); 
		
//		students[0] = new Student();
//		students[0].name = "일용자";
//		students[0].kor = 99;
//		students[0].eng = 88;
//		students[0].math = 77;		
//		students[1] = new Student();
//		students[1].name = "이용자";
//		students[1].kor = 99;
//		students[1].eng = 88;
//		students[1].math = 77;		
//		students[2] = new Student();
//		students[2].name = "삼용자";
//		students[2].kor = 99;
//		students[2].eng = 88;
//		students[2].math = 77;
		
		// 반복문을 이용하여 객체배열의 객체가 가지고 있는
		// 이름, 점수, 총점, 평균을 출력해보아라.
		
		for(int i=0; i<students.length ; i++) {
			System.out.println("이름 : "+students[i].name);
			System.out.println("국어 : "+students[i].kor);
			System.out.println("영어 : "+students[i].eng);
			System.out.println("수학 : "+students[i].math);
			System.out.println("총점 : "+students[i].total() ); // 메소드로 사용하는 거기 때문에
			System.out.println("평균 : "+students[i].avg() );   // 소괄호 꼭 사용해야 함			
		}
			
	}
}
