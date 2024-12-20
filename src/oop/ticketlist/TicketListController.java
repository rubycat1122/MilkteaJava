package oop.ticketlist;

import java.util.List;

public class TicketListController {
	public static void main(String[] args) {
		TicketListView view = new TicketListView();
		TickeListManage manage = new TickeListManage();
		
		String title;
		int index;
		List<TicketList> tList;
		
		// 1. 등록  2. 전체확인  3. 하나 검색  4. 수정  5. 삭제  0. 나가기
		end:
		while(true) {
			int choice = view.mainMenu();
			switch(choice){
			case 1	:
				TicketList ticket = view.inputData();
				manage.registerData(ticket);
				break;
			case 2 : 
				tList= manage.selectAllData();
				view.displayTicketData(tList);
				break;	
			case 3	: 
				title = view.searchData("검색");
				List<TicketList> searchList = manage.searchListByTitle(title);
				view.displayTicketData(searchList);
				break;
			case 4	: 
				title = view.searchData("수정");
				index = manage.searchIndexByTitle(title);
				if(index != -1) {
					ticket = manage.searchOneByTitle(title);
					ticket = view.modifyData(ticket);
					manage.modifyData(index, ticket);
				}
				break;
			case 5	: 
				title = view.searchData("삭제");
				index = manage.searchIndexByTitle(title);
				manage.deleteData(index);
				break;
			case 0	: 
				view.displayMsg("프로그램이 종료되었습니다.");
				break end;
			default:
				view.displayMsg("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
