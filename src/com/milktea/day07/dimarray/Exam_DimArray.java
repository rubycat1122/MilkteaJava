package com.milktea.day07.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		//기존에는 하나의 값에 하나의 변수를 입력해서 선언
		int num = 0;
		int [] nums = new int[10];		
		// 2차원 배열 : 공간 여러개를 한번에 선언 
		// => 하나의 공간에 여러개의 주소그룹 저장 가능 (큰공간은 도로명 작은공간은 건물명)
		int [][] dimNums = new int [5] [5];
		// 중괄호{}를 중복해서 사용하면 행과 열로 나타낼 수 있음
		// 정방형 => 영화관 좌석 (예매 프로그램)
		// 비정방형=> 계단식 (좌석배열이 불규칙할 때) 
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : "+ dimNums[0].length);		
		// 1  2  3  4  5
		// 6  7  8  9  10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		int k = 1;
		for(int i=0; i<dimNums.length; i++) {  // i<5는 행 ---> 인덱스의 길이로
			for(int j = 0; j < dimNums[i].length; j++) {  // j<5는 열---> 인덱스의 길이로 (행을 지정!)
				dimNums[i][j] = k;   //dimNums[0][j] <--- 0을 i로  j+1=k
				k++; // 1 ~ 25까지 증가
			}			
		}
		// 정렬 후 출력
		for(int i =0; i<5;  i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", dimNums[i][j]);
			}
			System.out.println();
		}
		
//		for(int j = 0; j < 5; j++) {
//			dimNums[0][j] = j+1;
//		}
//		1첫번째 행 ↑↑↑↑↑↑↑↑ for문
//		dimNums[0][0]=1;
//		dimNums[0][1]=2;
//		dimNums[0][2]=3;
//		dimNums[0][3]=4;
//		dimNums[0][4]=5;
//		2 두번째 행 
//		for(int j = 0; j < 5; j++) {
//			dimNums[1][j] = j+6;
//		}
////		dimNums[1][0] = 6;
////		dimNums[1][1] = 7;
////		dimNums[1][2] = 8;
////		dimNums[1][3] = 9;
////		dimNums[1][4] = 10;
////		3번째 행
//		for(int j = 0; j <5; j++) {
//			dimNums[2][j]= j+11;			
//		}
////		4번째 행
//		for(int j = 0; j <5; j++) {
//			dimNums[3][j]= j+16;			
//		}
////		5번째 행
//		for(int j = 0; j <5; j++) {
//			dimNums[4][j]= j+21;			
//		}
		
		
    }
}
