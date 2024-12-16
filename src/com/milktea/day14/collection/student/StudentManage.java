package com.milktea.day14.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{
	
	private List<Student> sList;
	
	// 저장소 생성
	public StudentManage() {
		sList = new ArrayList<Student>();
	}
	

	@Override
	public List<Student> searchListByName(String name) { // 이름 검색 (동명이인이 있을 수 있기 때문에 List로)
		if(name != null) {
			List<Student>searchList = new ArrayList<Student>();
			for(Student std: sList) {
				if(name.equals(std.getName())) {
					// 찾은 데이터
//					System.out.println("찾았다!!"); // view로 전달!
					searchList.add(std); // 저장
				}
			}
			return searchList;
		}
		return null;
	}

	@Override
	public Student searchOneByName(String name) { // 이름 검색
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int searchIndexByName(String name) {
		if(name != null) {
			for(int i = 0; i < sList.size(); i++) {
				if(name.equals(sList.get(i).getName())) { // sList.get(i) => Student 객체
					// 찾았다! => 출력은 view와 controller를 통해서
					return i;
				}
			}
		}
		return -1; // exception이 발생하도록 유도
	}


	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		sList.add(student);
	}


	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int index) {
		if(index > 0)
			sList.remove(index);
	}
}
