package com.milktea.day2x.music.medel.vo;

public class Music implements Comparable<Music>{
	// 곡명 : title, 가수명 : singer
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}
	// 객체의 불변성을 보장해주지 못하기 때문에 setter 생성을 권장하지 않음
	// setter는 나중에 필요하면 추가로 만드는 걸로 함

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle()); 
		// 리턴값이 int => -1, 0, 1
		// 문자값의 사전의 오름차순으로 비교해 줌
	}
}
