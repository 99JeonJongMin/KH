package chap05.exam01;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		switch(week) {
		case 1:
			today = Week.SUNDAY; 
			break;
		case 2:
			today = Week.MODAY; 
			break;
		case 3:
			today = Week.TUDDAY; 
			break;
		case 4:
			today = Week.WENDESDAY; 
			break;
		case 5:
			today = Week.THURSDAY; 
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATDAY; 
			break;
		}
		
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구 하는날");
		}
		else {
			System.out.println("오늘은 자바 공부하는날");
		}
	}

}
