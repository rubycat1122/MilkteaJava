package oop.ticketlist;

import java.util.List;
import java.util.Scanner;

public class TicketListView {
	Scanner sc = new Scanner(System.in);
	
	// 메인메뉴 mainMenu
	public int mainMenu() {
		System.out.println("******* Culture Ticket List *******");
		System.out.println("1. 데이터 등록");
		System.out.println("2. 전체 데이터 확인");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 수정");
		System.out.println("5. 데이터 삭제");
		System.out.println("0. 나가기");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	// 입력 inputData
	public TicketList inputData() {
		System.out.print("종류- 전시/영화/공연/여행 : ");
		sc.nextLine();
		String genre = sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("날짜 년(yyyy) :");
		int year  = sc.nextInt();
		System.out.print("날짜 월(mm) :");
		int month = sc.nextInt();
		System.out.print("날짜 일(dd) :");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.print("장소 : ");
		String place = sc.nextLine();
		System.out.print("한줄 메모 : ");
		String memo = sc.nextLine();
		TicketList ticket = new TicketList(genre, title, year, month, day, place, memo);
		return ticket;
	}
	
	// 검색/확인 searchData
	public String searchData(String category) {
		System.out.print(category + "할 제목 입력 : ");
		String title = sc.next();
		return title;
	}
	public void displayTicketData(List<TicketList> tckList) {
		System.out.println("▷▷▷▷▷ 티켓 전체 정보 출력 ◁◁◁◁◁");
		for(TicketList ticket: tckList) {
			System.out.printf("[%s] 제목 : %s, 날짜 : %d년 %d월 %d일, 장소 : %s, 한줄 메모 : %s \n", ticket.getGenre(), ticket.getTitle(), ticket.getYear(), 
					ticket.getMonth(), ticket.getDay(), ticket.getPlace(), ticket.getMemo());
		}
	}
	
	// 수정 modifyData
	public TicketList modifyData(TicketList ticket) {
		System.out.print("");
		
		return null;
	}
	
	// 나가기 기타
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	
	
}
