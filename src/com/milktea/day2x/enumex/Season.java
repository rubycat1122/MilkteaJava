package com.milktea.day2x.enumex;

public enum Season {
	SPRING("봄"), SUMMER("여름"), AUTUMN("가을"), WINTER("겨울");
	
	// 열거형 상수에 대응하는 문자열 값을 저장할 변수
	// ex) 봄, 여름, 가을, 겨울
	private String season;

	// 생성자 : 생성자를 통하면 spring 값에 봄을 넣어서 세팅할 수 있다.
	// 상수(한글)
	private Season(String season) {
		this.season = season;
	}
	
	public String getSeason() {
		return season;
	}
}
