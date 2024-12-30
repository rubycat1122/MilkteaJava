package com.milktea.day2x.enumex;

public enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	// 다른 메소드가 없으면 }로 그냥 닫으면 되고 다른 메소드가 추가되면 ;를 붙여줘야 함
	
	// 주중, 주말 체크하는 메소드
	public boolean isWeekEnd() {
		return this == SATURDAY || this == SUNDAY;
	}
}
