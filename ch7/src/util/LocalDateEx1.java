package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {

	public static void main(String[] args) {
		LocalDate today =LocalDate.now();
		System.out.println(today);
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonthValue()); // 월 1~12
		
		
	}

}
