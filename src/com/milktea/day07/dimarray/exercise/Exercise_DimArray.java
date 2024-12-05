package com.milktea.day07.dimarray.exercise;
// 기능용 클래스
public class Exercise_DimArray {
	public void practice1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int dn [][] = new int [5][5];
		int k = 1;
		for(int i=0; i<5; i++) {			
			for(int j=4; j>-1; j-- ) {
				dn[i][j]=k;
				k++;
			}
		}		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", dn[i][j]);
			}
			System.out.println();
		}
		
		/* i는 행 j는 열
		 * k(1~25)값이 행은 그대로 열의 주소가 커질수록 출력 값이 점점 줄어드는 숫자
		 * 그래서 j의 값은 4부터 시작해서 0이 될때까지
		 */		
		
	}
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21		
		
		int dn [][] = new int [5][5];
		int k = 1;
		for(int i=0; i<5; i++) {			
			for(int j=4; j>=0; j-- ) {
				dn[j][i]=k;
				k++;
			}
		}		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", dn[i][j]);
			}
			System.out.println();
		}		
		/* 
		 * 1행에서 2행 각 열마다 5씩 증가함을 기준으로 작성할 수도 있다.		
		 * 1행 5*1-0/ 2행 5*1-1/ 3행 5*1-2/ 4행 5*1-3/ 5행 5*1-4
		 *  int k = 1;
		 * for(int i = 0; i < 5; i++) {
		 *	for(int j = 0, k = 1; j < 5; j++, k++) {
		 *		arrs[i][j] = 5*k-i; } }		
		 */
		// 우클릭 로컬히스토리>비교(컴페어) ---저장했던 값을 타임라인에 남겨놓음
//		arrs[4][0] = 1;
//		arrs[3][0] = 2;
//		arrs[2][0] = 3;
//		arrs[1][0] = 4;
//		arrs[0][0] = 5;
//
//		arrs[4][1] = 6;
//		arrs[3][1] = 7;
//		arrs[2][1] = 8;
//		arrs[1][1] = 9;
//		arrs[0][1] = 10;
//
//		arrs[4][2] = 11;
//		arrs[3][2] = 12;
//		arrs[2][2] = 13;
//		arrs[1][2] = 14;
//		arrs[0][2] = 15;
//
//		arrs[4][3] = 16;
//		arrs[3][3] = 17;
//		arrs[2][3] = 18;
//		arrs[1][3] = 19;
//		arrs[0][3] = 20;
//
//		arrs[4][4] = 21;
//		arrs[3][4] = 22;
//		arrs[2][4] = 23;
//		arrs[1][4] = 24;
//		arrs[0][4] = 25;
		
	}
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		int dn [][] = new int [5][5];
		int k = 1;
		for(int i=0; i<5; i++) {			
			for(int j=0; j<5; j++ ) {
				dn[j][i]=k;
				k++;
			}
		}		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d\t", dn[i][j]);
			}
			System.out.println();
		}			
	}
	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int arrs [][] = new int[5][5];
		int k = 1;
		for( int i=0; i<arrs.length; i++) {  // i<5 --> 5자리에 인덱스 값으로 넣어주기
			if( i %2 == 0 ) {   // i값이 짝수일때 j값 증가
				for(int j=0; j<arrs[i].length; j++ ) { // j<5 ----> 인덱스 값 넣어주기
					arrs[i][j]=k;
					k++;
				}
			}else {				// i가 홀수일때 j값 감소
				for(int j=4; j>=0; j-- ) {
					arrs[i][j]=k;
					k++;
				}
			}
		}		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}	
		
		
//		for(int i=0; i<1; i++) {			
//			for(int j=0; j<5; j++ ) {
//				arrs[i][j]=k;
//				k++;
//			}
//		}
//		for(int i=1; i<2; i++) {			
//			for(int j=4; j>=0; j-- ) {
//				arrs[i][j]=k;
//				k++;
//			}
//		}
//		for(int i=2; i<3; i++) {			
//			for(int j=0; j<5; j++ ) {
//				arrs[i][j]=k;
//				k++;
//			}
//		}
//		for(int i=3; i<4; i++) {			
//			for(int j=4; j>=0; j-- ) {
//				arrs[i][j]=k;
//				k++;
//			}
//		}
//		for(int i=4; i<5; i++) {			
//			for(int j=0; j<5; j++ ) {
//				arrs[i][j]=k;
//				k++;
//			}
//		}
		
		
		/* 행 i가 홀수일때 역순정렬
		 * 
		 */
		
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[0][4] = 5;
//
//		arrs[1][4] = 6;
//		arrs[1][3] = 7;
//		arrs[1][2] = 8;
//		arrs[1][1] = 9;
//		arrs[1][0] = 10;
//
//		arrs[2][0] = 11;
//		arrs[2][1] = 12;
//		arrs[2][2] = 13;
//		arrs[2][3] = 14;
//		arrs[2][4] = 15;
//
//		arrs[3][4] = 16;
//		arrs[3][3] = 17;
//		arrs[3][2] = 18;
//		arrs[3][1] = 19;
//		arrs[3][0] = 20;
//
//		arrs[4][0] = 21;
//		arrs[4][1] = 22;
//		arrs[4][2] = 23;
//		arrs[4][3] = 24;
//		arrs[4][4] = 25;
		
		
	}
	
	
	
}
