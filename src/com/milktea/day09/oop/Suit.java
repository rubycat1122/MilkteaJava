package com.milktea.day09.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) 호출!!");
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int, String) 호출!!");
	}
	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출!!");
	}
	public static void main(String [] args) {
		Suit s = new Suit(100);
	}
	
	// 동작은 1, 2, 3 위에서 아래의 순으로 작동하지만
	// 출력 실행은 역순으로 진행됨.
	
}
