package com.milktea.day10.oop.encapsulation;

public class Book {
	// 제목과 저자의 필드 생성
	private String title;
	private String author;
	// 생성자 생성
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// getter/ setter 생성
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public void setTite(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public static void main(String[]args) {
		Book book = new Book();
		book = new Book("춘향뎐", "작자미상");
		book.setTite("어린왕자");
		book.setAuthor("생떽쥐페리");
		
		System.out.println("책제목 : " +book.getTitle() );
		System.out.println("저자 : " +book.getAuthor() );
	}
	
	
}

