package com.milktea.day05.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs;
		arrs = new int[10];
		for (int i=0; i<10; i++) {
			arrs[i]=(i+1);
		}
		for(int i=0; i<10; i++) {
			System.out.print(arrs[i]+" ");
		}
	}
	
	public void practice2() {
		/*
		 * 길이가 10인 배열 선언
		 * 10부터 1까지 값
		 * 반복문을 이용하여 순서대로 배열에 저장 ---> 역순 출력
		 */
		int [] arrs = new int [10];
		for (int i=0, count=arrs.length; i<arrs.length; i++, count--) {
			arrs[i]=(count);
		}
		for(int i=0; i<arrs.length; i++)	{
			System.out.print(arrs[i]+" ");			
		}
	}
	
	public void practice3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요
		 */
		Scanner sc= new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		int num=sc.nextInt();
		
		int [] arrs = new int [num];
		// 배열에 데이터 저장 ( 1~ num까지)
		for(int i=0; i<num; i++) {
			arrs[i]= i+1;		
			System.out.print(arrs[i]+" ");
		}		
	}
	
	public void practice4() {
		/*
		 * 길이가 5인 String 배열을 선언
		 * "사과" "귤" "포도" "복숭아" "참외" 순서대로 저장
		 * 배열 인덱스를 이용해서 귤 출력
		 */		
		String fruits [];
		fruits = new String[5];
		fruits[0]="사과";
		fruits[1]="귤";
		fruits[2]="포도";
		fruits[3]="복숭아";
		fruits[4]="참외";
		System.out.println(fruits[1]);		
	}
	
	public void practice5() {
		/*
		 * 문자열을 입력 받아 배열에 넣고
		 * 검색할 문자가 몇개(갯수), 몇번째 인덱스에 위치하는지 출력
		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String abc =sc.next();
		
		System.out.print("검색할 문자 입력: ");
		String ab = sc.next();
		
		System.out.println(ab+"가 존재하는 위치(인덱스): ");
		System.out.println(ab+" 개수 : ");
	}
		
	public void practice6() {
		/*
		 * "월"~"일" 요일 문자열 배열입력
		 * 0~6까지 숫자를 입력 받아 요일 출력
		 * 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다" 출력
		 */
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num= sc.nextInt();		
		
		String day [] = {"월", "화", "수", "목", "금", "토", "일"};	
		if(num<0|| num>6) {
			System.out.println("잘못 입력하셨습니다.");
		}else
			System.out.println(day[num]);				
	}
	
	public void practice7() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 
		 * 그 값만큼 정수형 배열을 선언, 생성 및 초기화 
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.	
		 */
		// 1. 입력받기
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input= sc.nextInt();		
		// 2. 배열의 크기만큼 인덱스에 직접 값을 넣기: 반복문 이용		
		int [] arrs = new int [input];				
		int sum=0;
		for(int i=0; i<arrs.length; i++) {
			System.out.print("배열 "+i+"번 째 인덱스에 넣을 값: ");		
			arrs[i] = sc.nextInt();		// input=sc.nextInt(); arrs[i]=input; 을 한줄로	
		}		
		for(int num : arrs) {
			System.out.print(num+" ");
		}
		// 3. 누적합
		for(int num: arrs) {
			sum += num;
		}
		System.out.println();		
		System.out.println("합: "+sum);			
	}
	
	public void practice8() {
		/*
		 * 3이상인 홀수 자연수를 입력 받아
		 * 배열 중간까지는 1씩 증가(오름차순) 이후부터는 1씩 감소(내림차순)
		 * 홀수가 아니거나 3 미만일 경우 "다시 입력하세요" 정수 다시 받기
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();			
		if(input >= 3 && input % 2 != 0) {
			
		}else {
			System.out.print("다시 입력하세요");
		}
		
		
		
	}
	
	public void practice9() {
		/*
		 * 입력-배열 -> 검색
		 * 있으면 "ㅁㅁㅁ치킨 배달 가능", 없으면 "ㅁㅁㅁ치킨은 없는 메뉴입니다" 출력
		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("치킨 이름을 입력하세요: ");
		String menu = sc.next();
		
		String chick [];
		chick = new String [5];
		chick[0]="후라이드";
		chick[1]="양념";
		chick[2]="마늘";
		chick[3]="간장";
		chick[4]="오븐구이";
		
		
//		if(menu) {
//			System.out.println(menu+"치킨 배달 가능");
//		}else {
//			System.out.println(menu+"치킨은 없는 메뉴입니다.");
//		}
		
	}
	
	public void practice10() {
		/*
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력
		 */
		
	}
	
	public void practice11() {
		/*
		 * 로또 번호 자동 생성기 프로그램
		 * 중복값 없이 오름차순 정렬하여 출력
		 */
		int [] lottos = new int [6];
		Random rand = new Random();
		for(int i = 0; i < lottos.length; i++) {
			// 1 ~ 45 사이의 숫자가 랜덤하게 나와야 함.
//			System.out.print( (rand.nextInt(45)+1) + " ");
			lottos[i] = rand.nextInt(45)+1;
			
			// 배열 안에 넣어보기(오름차순 정렬)
			// 배열의 중복값- 없애기
			// 비교하는 작업(비교횟수)이 하나씩 늘어난다.
			// 비교하는 값이 같으면 반복을 통해 다시 숫자를 뽑게끔 설계
			for(int j=0; j<i; j++) {
				if(lottos[i]==lottos[j]) {
					i--;
				}	// i의 값은 비교고정값, 범위는 i의 값까지
			}
		}		
		// 선택, 삽입, 버블, 퀵, 머지, ...
		for(int j=0; j< (lottos.length-1); j++) {
			for(int i=0; i< (lottos.length-1)-j; i++) {
				if(lottos[i] > lottos[i+1]) {
					int temp = lottos[i];
					lottos[i] = lottos[i+1];
					lottos[i+1] = temp;
				}
			}
		}
		for(int lotto: lottos) {
			System.out.print(lotto+ " ");
		}
	}
	/*
	 * 중복값 없애기
	 * 총 5번 반복해야 함 (6개의 번호를 비교하므로)
	 * #1
	 * if(lottos[1]== lottos[0]{
	 * 		i--;
	 * }
	 * #2
	 * if(lottos[2]== lottos[0]{ i--; }
	 * if(lottos[2]== lottos[1]{ i--; }
	 * #3
	 * if(lottos[3]== lottos[0]{i--;}
	 * if(lottos[3]== lottos[1]{i--;}
	 * if(lottos[3]== lottos[2]{i--;}
	 * #4
	 * if(lottos[4]== lottos[0]{i--;}
	 * if(lottos[4]== lottos[1]{i--;}
	 * if(lottos[4]== lottos[2]{i--;}
	 * if(lottos[4]== lottos[3]{i--;}
	 * #5
	 * if(lottos[5]== lottos[0]{i--;}
	 * if(lottos[5]== lottos[1]{i--;}
	 * if(lottos[5]== lottos[2]{i--;}
	 * if(lottos[5]== lottos[3]{i--;}
	 * if(lottos[5]== lottos[4]{i--;}
	 * ↓↓↓↓↓↓↓for문으로 표현하기↓↓↓↓↓↓↓
	 * 
	 * for(int j=0; j<i; j++) {
				if(lottos[i]==lottos[j]) {
					i--;
				}
			}
	 * 
	 */

}
