package com.milktea.day10.oop.encapsulation;
// 캡슐화하기
// 클래스의 필드는 private(공개를 의도하지 않는 경우 모두 보안화)
public class Member {
	// 필드	
	private String name;
	private int age;
	private String job;
	private String education;
	private long salary;
	private boolean divorceYN;
	private boolean talmoYN;
	
	public Member() {}
	
	// 메소드
	// 필드가 보안화 됐기 때문에 메소드에서 접근이 가능하게 해줘야한다.
	// setter(set 메소드: 값을 세팅해 줌, 리턴타입이 void)
	// 변수에 어떤 값을 넣는 메소드를 만들고 싶을때 set을 적고 뒤에 대문자로 시작
	public void setName(String name) {		
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public void setSalary(int salary) {
		this.salary = salary;		
	}
	public void setDivorceYN(boolean divorceYN) {
		this.divorceYN = divorceYN;
	}
	public void setTalmoYN(boolean talmoYN) {
		this.divorceYN = talmoYN;
	}
	// getter(get메소드)
	public String getName() {
		return this.name;   // return 뒤에 값이 있으면 void와 함께 쓸 수 없다.
	}
	public int getAge() {
		return this.age;
	}
	public String getJob() {
		return this.job;
	}
	public String getEducation() {
		return this.education;
	}
	public long getSalary() {
		return this.salary;
	}
	public boolean getDivorceYN() {
		return this.divorceYN;
	}
	public boolean getTalmoYN() {
		return this.talmoYN;
	}
	
	public void work() {}
	public void eat() {}
}
