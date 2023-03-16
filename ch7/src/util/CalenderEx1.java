package util;
/* 날짜와 시간
    java.util.Calander class
    java.util.Data class
    java.time.LocalDate, java.time.LocalTime,java.time.LocalDateTime 클래스 
    ==> 버전 8에서 추가
 */
import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		//Calendar c = new Calender(); 추상클래스이기 때문에 new 를 못한다/
		// 추상클래스. interface는 new 를 찾지 못하기 때문에 자식 클래스 만들어서 사용
		
		//현재 시스템의 시간, 날짜 와 시간 정보 리턴
		Calendar today =Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.toString());
		
		//get(int field)-Calander 1버전에서부터 있던거라 복잡하지만 그만큼 오래되서 아직 쓰이긴한다
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		System.out.println("월 (0~11,0:1월): "+today.get(Calendar.MONTH));
		System.out.println("올해의 몇째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇 일 : "+today.get(Calendar.DATE));
		System.out.println("이달의 몇 일 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일 : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("이주의 몇 일 : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전_오후(0 : 오전, 1: 오후) : "+Calendar.AM_PM);
		System.out.println("시간(0~11) : "+Calendar.HOUR);
		System.out.println("시간(0~23) : "+Calendar.HOUR_OF_DAY);
		System.out.println("분(0~59) : "+Calendar.MINUTE);
		System.out.println("초(0~59) : "+Calendar.SECOND);
		System.out.println("1000분의 1초(0~999) : "+Calendar.MILLISECOND);
	}

}
