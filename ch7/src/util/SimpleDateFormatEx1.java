package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	형식화 클래스
 	java.text 패키지
 	소수점, 콤마...
 */
public class SimpleDateFormatEx1 {

	public static void main(String[] args) {		
		
		Date d= new Date();
//수정
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(d));
	
		SimpleDateFormat sdf2 = new SimpleDateFormat("y년 M월 d일 EEEE a HH:mm:ss SS");		
		System.out.println(sdf2.format(d));
		// y : 연도 , M : 월 , d : 일, h : 시, m : 분, s: 초, H(24시간제): 시, a : 오전/오후
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY/MM/dd");
		
		
		//예외상황 (exception-컴파일 예외)
		//parse() 날짜 데이터의 출력 형식을 변환
		try {
			Date d2 = sdf3.parse("2023년 03월 09일");
			System.out.println(sdf4.format(d2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
