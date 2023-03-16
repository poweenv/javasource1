package lang;

public class StringEx1 {

	public static void main(String[] args) {

/* 		String 클래스
 * 		-변경 불가능한(Immutable) 클래스
  		-equalsIgnoreCase(): 대소문자 구별하지 않고 값 비교
 		String 클래스의 동작 구현
		문자열을 다루는 일이 많기 때문에 new를 사용하지 않고도 객체를 인스턴스를 생성할 수 있도록 되어 있다
		문자열 만들기 1) 문자열 리터럴 지정
				   2) new 사용하는 방식
				    */
		String str= new String("Hi");	 //1)문자열 리터럴 지정 : 문자열 재사용 함
		String str3= new String("Hi");   //2)new 사용하는 방식
		String str2= "hellO";
		String str4= "hellO";
		
		//문자열 비교 무조건 equals로 하자
		//String 클래스에 equals 가 오버라이딩(값 비교) 되어 있음 
		System.out.println(str2.equals(str));
		System.out.println(str==str3); // 문자열 비교시 ==사용하지 말것
		System.out.println(str2==str4); // 문자열 비교시 ==사용하지 말걸
	}

}
