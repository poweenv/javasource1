package lang;
/*
 	타입 
 	 1) 기본형 : byte,short,int,long,float,double,boolean,char
 	 2) 참조형 : 배열, 클래스, 인터페이스
 	 
 	 Wrapper class
 	  - 8개의 기본형을 객체로 다룰 때 사용
 	  int의 Wrapper class는 Integer 이다
 */
public class Wrapper {

	public static void main(String[] args) {
		
		// 정수형을 다룰 때
		// 1)기본형 
		int a = 3;
		char ch = 'a';
		byte b = 4;
		float f = 4.15f;
		double d = 4.5d;
		boolean b3 = true;
		long l = 3l;
		
		// 2) 참조형 : 클래스(interface) 만들어져 있다.(메소드 사용할 수 있다)
		//Integer i = new Integer(3); 9버전부터 제거됨
		Integer i2 = 3;
		Integer i3 = 3;
		Character ch2 = 'd';
		Byte b2 = 4;
		float f2 =4.15f;
		Double d2 = 4.5;
		Boolean b4 = false;
		long l2 = 12l;
		
		System.out.println(i2.equals(i3));
		System.out.println(i2!=i3);
		//문자형태의 숫자를 정수로 Integer.parseInt()
		Integer.parseInt("2");
		
		//기본형으로 선언된 변수를 참조형에 바로 대입 가능-Interger
		//Interger
		
		
	}

}













