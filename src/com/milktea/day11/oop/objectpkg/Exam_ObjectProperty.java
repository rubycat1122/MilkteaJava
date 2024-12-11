package com.milktea.day11.oop.objectpkg;

import com.milktea.day10.oop.encapsulation.Book;

class Member{
	// 필드 / private 캡슐화(접근불가)
	private String name; 
	private int age;
	private String email;
	private String phone;
	private String address;
	// 생성자
	public Member() {}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Member(String email, String phone, String address ) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}	
	
	public Member(String name, int age, String email, String phone, String address ) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	// 메소드 (private 으로 인한 접근불가로 우회접근을 위해서! get/set
	// gettter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// settter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {}
	public void sleep() {}
	
	//toString + Ctrl + 스페이스바 (오버라이딩)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 나이 : " + age + ", 이메일 : "
				+ email + ", 전화번호 : " +phone+", 주소 : "+ address;
	}
	
}

public class Exam_ObjectProperty {
	// 조상클래스에서 한번 코드를 사용하면 모든 하위 클래스의 값을 출력해줄 수 있음
	static void print(Object obj) { 
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());		
	}
	
//	static void print(Member member) {
//		System.out.println(member.getClass().getName());
//		System.out.println(member.hashCode());
//		System.out.println(member.toString());		
//	}
//	
//	static void print(Book book) {
//		System.out.println(book.getClass().getName());
//		System.out.println(book.hashCode());
//		System.out.println(book.toString());			
//	}
	
	public static void main(String[] args) {
		String data = "Java";  // 리터럴Java값이 heap> String Constatnt Pool에 입력
		data = new String("Java"); // heap영역에 새로운 객체의 주소로 만들어짐
		if("Java".equals(data)) {  // 리터럴 (똑같은 활자)값을 비교 하려면 equals 사용
//		if("Java" == data ) {  // Java 값이 constant pool 영역에서 같은 주소에서 불러와서 재사용됨
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		Member member = new Member("일용자", 22, "kh@kh.com", "01012341234", "서울시 중구");
		print(member);
		Book book = new Book();
		print(book);
//		System.out.println(member.getClass().getName());
//		System.out.println(member.hashCode());
//		System.out.println(member.toString());

	}
}
