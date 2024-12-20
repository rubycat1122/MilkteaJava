package oop.ticketlist;

public class TicketList {
	private String genre; 
	private Object title; 
	private int year;
	private int month;
	private int day;
	private String place; 
	private String memo;
	
	public TicketList() {}
	public TicketList(String genre, String title, int year, int month,int day, String place, String memo) {
		this.genre = genre;
		this.title = title;
		this.year = year;
		this.month =month;
		this.day = day;
		this.place = place;
		this.memo = memo;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Object getTitle() {
		return title;
	}
	public void setTitle(Object title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "[" + genre + "] 제목 : " + title + "/ 날짜 :" + year + "년 " + month + "월 "
				+ day + "일/ 장소 : " + place + "/ 한줄메모 : " + memo ;
	}
	
	
}
