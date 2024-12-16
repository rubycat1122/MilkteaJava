package com.milktea.day14.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_MapCollection {
	public static void main(String[]args) {
		/*
		 * 전화번호부에서 지역번호를 입력하면 지역을 출력해주는 프로그램을 작성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		Map<String, String> phoneMap = new HashMap<String, String>();
		
		phoneMap.put("02", "서울");
		phoneMap.put("031", "경기");
		phoneMap.put("032", "인천");
		phoneMap.put("033", "강원");
		phoneMap.put("041", "충남");
		phoneMap.put("042", "대전");
		phoneMap.put("043", "충북");
		phoneMap.put("044", "세종");
		phoneMap.put("051", "부산");
		phoneMap.put("052", "울산");
		phoneMap.put("053", "대구");
		phoneMap.put("054", "경북");
		phoneMap.put("055", "경남");
		phoneMap.put("061", "전남");
		phoneMap.put("062", "광주");
		phoneMap.put("063", "전북");
		phoneMap.put("064", "제주");
		
		String localNumber = "";
		do {
			System.out.print("지역번호 입력 : ");
			localNumber = sc.next();
//		System.out.println("저장된 데이터 수 : "+phoneMap.size()); // 저장한 값 확인용
//		System.out.println("02를 누르면 : " + phoneMap.get("02"));
//		System.out.println("031를 누르면 : " + phoneMap.get("031"));
			
			//저장소 활용
			String result = phoneMap.get(localNumber);
			if(result != null) {
				System.out.println("검색하신 지역은 : " + result +"입니다.");			
			}else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
		}while(!"exit".equals(localNumber));
		
//		// 방법 #2	
//		switch(localNumber) {
//		case "02" : System.out.println("서울입니다."); break;
//		case "031" : System.out.println("경기도입니다." ); break;
//		}
//		// 방법 #1 		
//		if("02".equals(localNumber)) {
//			System.out.println("서울입니다.");
//		}else if("031".equals(localNumber)) {
//			System.out.println("경기도입니다.");
//			
//		}
				
	}
}
