package com.milktea.day14.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	// 가변길이가 늘어나려면 배열 복사가 일어나야 함
	
	public void add(int num) {
		nums[size] = num;
		size++; // ++를 안하면 값이 지정이 안되고 0값이 계속 저장이 됨		
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0; // 초기화를 통해 값을 지워주면 됨
//		for(int i = 0; i < nums.length; i++)
//			nums[i] =0;
//		size = 0;
//		nums[0] = 0;
//		nums[1] = 0;
//		nums[2] = 0;
	}
}
