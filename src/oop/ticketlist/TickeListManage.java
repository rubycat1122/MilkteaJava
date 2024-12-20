package oop.ticketlist;

import java.util.ArrayList;
import java.util.List;

public class TickeListManage {
	private List<TicketList> tList;
	
	public TickeListManage() {
		tList = new ArrayList<TicketList>();
	}
	
	public void registerData(TicketList ticket) {
		tList.add(ticket);
	}
	
	public List<TicketList> searchListByTitle(String title) {
		if(title != null) {
			List<TicketList>searchList = new ArrayList<TicketList>();
			for(TicketList tckl: tList) {
				if(title.equals(tckl.getTitle())) {
					searchList.add(tckl);
				}
			}
			return searchList;
		}
		return null;
	}
	
	public TicketList searchOneByTitle(String title) {
		if(title !=null) {
			for(TicketList ticket: tList) {
				if(title.equals(ticket.getTitle())) {
					return ticket;
				}
			}
		}
		return null;
	}
	
	public int searchIndexByTitle(String title) {
		if(title != null) {
			for(int i =0; i<tList.size(); i++) {
				if(title.equals(tList.get(i).getTitle())) {
					return i;
				}
			}
		}
		return -1;
	}
	public List<TicketList> selectAllData(){
		return tList;
	}
	
	public void modifyData(int index, TicketList ticket) { }
	
	public void deleteData(int index) {
		if(index >0)
			tList.remove(index);
	}
	
}
