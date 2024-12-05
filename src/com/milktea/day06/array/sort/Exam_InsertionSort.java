package com.milktea.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String[]args) {
		/*
		 * 삽입정렬 
		 */
		int arrs[] = {2, 5, 4, 1, 3};
		for(int i=1; i <arrs.length; i++) {
			for(int j=i; j>0; j--) {
				if (arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}
			}			
		}
		System.out.print("정렬된 결과 : ");
		for(int num: arrs) {
			System.out.print(num+ " ");
		}
		
		// j에 들어가는 값이 변하므로 i로 대체해줌(1씩 증가)
//		for(int j=1; j>0; j--) {
//			if (arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
//		for(int j=2; j>0; j--) {
//			if (arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
//		for(int j=3; j>0; j--) {
//			if (arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
//		for(int j=4; j>0; j--) {
//			if (arrs[j-1] > arrs[j]) {
//				int temp = arrs[j];
//				arrs[j] = arrs[j-1];
//				arrs[j-1] = temp;
//			}
//		}
		
//		↑↑↑↑↑↑↑↑↑반복문으로 정리
//		// 첫번째 비교    :여기서  1을 j로 두고 0을 j-1로 생각해서 정리
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		// 두번째 비교
//		if(arrs[1]> arrs[2] ) {
//			int temp= arrs[2];
//			arrs[2]= arrs[1];
//			arrs[1]= temp;
//		}
//		if(arrs[0]> arrs[1] ) {
//			int temp= arrs[1];
//			arrs[1]= arrs[0];
//			arrs[0]= temp;
//		}
//		// 3번째 비교
//		if(arrs[2]> arrs[3]) {
//			int temp = arrs[3];
//			arrs[3]=arrs[2];
//			arrs[2]=temp;
//		}
//		if(arrs[1]> arrs[2]) {
//			int temp = arrs[2];
//			arrs[2]=arrs[1];
//			arrs[1]=temp;
//		}
//		if(arrs[0]> arrs[1]) {
//			int temp = arrs[1];
//			arrs[1]=arrs[0];
//			arrs[0]=temp;
//		}
//		// 4번째 비교
//		if(arrs[3]> arrs[4]) {
//			int temp = arrs[4];
//			arrs[4]=arrs[3];
//			arrs[3]=temp;
//		}
//		if(arrs[2]> arrs[3]) {
//			int temp = arrs[3];
//			arrs[3]=arrs[2];
//			arrs[2]=temp;
//		}
//		if(arrs[1]> arrs[2]) {
//			int temp = arrs[2];
//			arrs[2]=arrs[1];
//			arrs[1]=temp;
//		}
//		if(arrs[0]> arrs[1]) {
//			int temp = arrs[1];
//			arrs[1]=arrs[0];
//			arrs[0]=temp;
//		}
		
	}
}
