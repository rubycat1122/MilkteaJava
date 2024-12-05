package com.milktea.day04.random;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);		
		Random rand = new Random();
//		Random 변수명 
//		rand.nextInt(n); //괄호 안에 범위 지정
		//n을 넘겨주면 rand.nextInt(n)의 결과값은 0 ~ n-1 사이의 랜덤한 수를 리턴함.
//		for (int i=0; i<10; i++)
//			System.out.println(rand.nextInt(10)); //10이면 0 ~ 9 사이의 랜덤한 수
		// 0 ~ 9 사이의 랜덤한 수를 출력하는 프로그램을 작성하여라. ==> 기준!기본!
		// 1 ~ 10 사이의 랜덤한 수를 출력하는 프로그램을 작성하여라.
//		for(int i = 0; i < 50; i++) {
//			System.out.print( (rand.nextInt(10)+1) + " "); 
//			}
		// 0 ~ n-1 + a
		// 25 ~ 35 사이의 랜덤한 수를 출력하는 프로그램을 작성하여라.
		// -25  -25
		// 0  ~  10
//		for(int i = 0; i < 30; i++) {
//			System.out.print( (rand.nextInt(11)+25) + " "); 
//		}
		// Math.random()*(최대-최소+1)-최소
		// 1 ~ 10 사이의 난수
		// Math.random()*( 10-1+1 )+1
		System.out.println( (int)( Math.random() *10)+1 ); 
		// int: 정수가 아니면 소수점이 나오므로 형변화를 위해 붙여줌.
		
		/*
		 * 1. 동전 앞 뒤 맞히기
		 * 숫자를 입력해주세요 (1. 앞면/ 2. 뒷면) :1
		 * 
		 * 2. 가위 바위 보 게임
		 * (1. 가위/ 2. 바위/ 3. 보) 1 ~3 사이의 난수를 이용해서 프로그램 작성
		 * 
		 * .... 배스킨라빈스(31)게임, up&down 게임 ...etc
		 */
		
		
		
	}
}
