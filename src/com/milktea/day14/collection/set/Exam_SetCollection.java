package com.milktea.day14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {
	public static void main(String[]args) {
		// Collection -> 저장소의 역할을 함.
		// 자료구조의 특성에 따라서 선택해서 사용
		// List, Set, Map, Stack, Queue, ...
		// Set은 순서가 없고 중복이 되지 않음.
		// -> 중복을 제거할 수 있음.
		
		Set<String> fruitsSet = new HashSet<String>();
		// 인터페이스<클래스> 변수 =  
		// 꺽쇠부분 제너릭 
		// 인터페이스 자체로는 메소드를 못 만든다. 객체로 만들어야 함 그래서 해시셋이라는 클래스 써줌
		String[] fruitsArrs = {"체리", "딸기", "포도", "사과", "딸기", "체리"};
		for(String fruits : fruitsArrs) {
			fruitsSet.add(fruits);
		}
		
//		fruitsSet.add("체리");
//		fruitsSet.add("딸기");
//		fruitsSet.add("포도");
//		fruitsSet.add("사과");
//		fruitsSet.add("체리");
//		fruitsSet.add("딸기");
		System.out.println("크기 : " + fruitsSet.size()); // 중복을 제거
		/*
		 * 수학의 집합 : 순서가 중요하지 않음. 중복을 허용하지 않음.
		 * 중복이 있는 데이터들을 Set에 넣으면 중복이 제거됨
		 * ---> 만약에 저장소에서 데이터를 꺼내서 쓰려면
		 * 순서가 있는 경우에는 Index를 활용하지만
		 * set처럼 순서가 없으면 지시자를 사용해야 함.
		 */
		Iterator<String>it = fruitsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
