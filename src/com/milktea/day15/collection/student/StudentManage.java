package com.milktea.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{
	private List<Student> sList;
	
	public StudentManage() {
		this.sList = new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student); // 대체할 때 set메소드 이용
		
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index); // 이름으로 입력받지만 인덱스로 리턴해줘서 인덱스값을 삭제할 수 있게 함
		// 보통은 void대신에 boolean으로 여부를 판단
	}

	@Override
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>(); // 이대로 return하면 비어있는 값임
		if(name != null) { // 이름이 입력됐을 때만 동작하도록 함 
			for(Student std: sList) { // sList를 검색하여 name과 같은 값 찾기
				if(name.equals(std.getName())) { // 같은값을 찾으면
					searchList.add(std); // searchList에 추가
				}
			}
			return searchList;
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		if(name!=null) {
			for(Student std: sList) {
				if(name.equals(std.getName())) {
					return std;  // 찾으면 그때의 값을 리턴
				}
			}
		}
		return null; // 없으면 null 리턴
	}

	@Override
	public int searchIndexByName(String name) {
		// for-each문에서 int값이 필요하면 밖에서 따로 선언한다. 
		int count = 0;		// (forEach는 i가 없기 때문)
		if(name != null) {					// name을 입력했을 때 동작
			for(Student std: sList) {		// forEach문으로 동작
				if(name.equals(std.getName())) { // 이름이 같은지 확인
					return count; 			// 그때의 인덱스 리턴
				}
				count++;					// 이름이 다르면 인덱스 증가
			}
		}
		return -1;							// 없으면 -1 리턴
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList; //Student List 전제 정보 리턴 
	}

	public String searchFailResult(Student student) {   // 이름으로 찾은 학생 정보가 넘어옴
		if(student != null) {							// 정보가 있을 때 동작
			int firstScore, secondScore;
			// student에 이름으로 정보값을 찾는 메소드가 이미 있다. 
			firstScore = student.getFirstScore();		
			secondScore = student.getSecondScore();			// 1, 2차 점수 
			double avg = (firstScore + secondScore ) / 2.0; // 평균값
			StringBuffer sb = new StringBuffer();			// 결과값(String) 담을 객체
			if(avg >= 60) {
				if(firstScore< 40) {
					sb.append("1차 시험 재평가 대상");
//					System.out.println("1차 시험 재평가 대상");
				}else if (secondScore < 40) {
					sb.append("2차 시험 재평가 대상");
				}else {
					sb.append("모두 통과하셨습니다.");
				}											// 여기에서는 3가지 결과 중 1개만 담김
			}else {
				if(firstScore < 60) {
					sb.append("1차 시험 재평가 대상\n");	// 개행해서 출력하도록 역슬래시n을 붙여줌
				}
				if(secondScore < 60) {
					sb.append("2차 시험 재평가 대상");
				}											// 여기에서는 2가지 결과가 담길 수 있음
			}
			return sb.toString();
		}
		return null;
	}
	
	
}
