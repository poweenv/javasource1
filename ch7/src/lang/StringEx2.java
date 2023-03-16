package lang;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {
		
		//String 생성자
		
		//String str1 = char value[];
		char c[]= {'a','b','v','l','g'};
		String str1 = new String(c);
		System.out.println(str1);
		
		String str2 = "Hello";
		System.out.println("length() : 문자열 길이 "+str1.length());
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
	//	str1.charAt(int index) : char => char 호출 시 int 매개변수를 넣어서 호출하고 return값은 char받는다
		
		String str3 = "자바 프로그래밍";
		//str3 문자열에 '프' 문자가 들어있는지 확인 : length(), for , charAt()
		
		for (int i = 0; i < str3.length(); i++) {
			System.out.println(str3.charAt(i));
			if(str3.charAt(i)=='프') {
				System.out.println("프가 들어있음");
				break;
			}
		}
		int cnt=0; //프 문자 갯수를 세는 변수
		for (int i = 0; i < str3.length(); i++) {
			System.out.println(str3.charAt(i));
			if(str3.charAt(i)=='프') {
				
				cnt++;
			}
//			System.out.println(cnt>0?"프가 들어있음":"");
		}
		//indexOf(int ch) : 주어진 문자 ch 가 문자열에 들어있는지 위치를 리턴(못찾으면 -1 리턴)            
		str2.indexOf('H');
		System.out.println("indexOf(int ch) : "+str2.indexOf('l'));
		str2.indexOf("H");
		System.out.println("indexOf(String str) : "+str2.indexOf("l"));
		System.out.println("indexOf(String str) : "+str2.indexOf("llo"));
		System.out.println("indexOf(int ch,int fromIndex) : "+str2.indexOf('e',0));//1
		System.out.println("indexOf(int ch,int fromIndex) : "+str2.indexOf('e',2));//-1
		
		
		//lastIndexOf : 위치를 찾을 때 오른쪽 끝 부터 찾음 
		System.out.println("lastIndexOf(int ch) : "+str2.lastIndexOf('o'));
		
		//str3 문자열에 '프' 문자가 들어있는지 확인 : indexOf()
		System.out.println(str3.indexOf('프'));
		System.out.println(str3.lastIndexOf('프'));
		
		//subString() : 범위에 해당하는 문자열 얻기
		String ssn = "980331-1254887";
		//subString(int begineIndex)
		String result = ssn.substring(3);	
		System.out.println(result);
		//subString(int begineIndex,endIndex) : endIndex 미 포함
		System.out.println(ssn.subSequence(3, 8));
		
		
		
		//concat(): +와 같은 역할
		String result2 = str2.concat("안녕하세요");
		System.out.println(result2);
		

		
		//startWith(String prefix) : prefix로 시작하니?라고 물어보는것 
		//startWith(String prefix,int toOffset) : 지정한 자리에서 prefix로 시작하니?라고 물어보는것
		String str4 = "java.lang.Object";
		str4.startsWith("java");
		System.out.println(str4.startsWith("ja"));
		System.out.println(str4.startsWith("ja",0));
		
		//endWith(String suffix) : suffix로 끝나느냐?
		System.out.println(str4.endsWith("ct"));
		
		//contains(CharSequence s): s 문자열이 포함되어있는지 검사 
		System.out.println("contians : "+str2.contains("Hello"));
		
		
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다";
		
		//replace() =(원본문자열, 변경문자열)
		str5.replace("자바", "JAVA");
		System.out.println("replace : "+str5.replace("자바", "JAVA"));
		System.out.println(str5);
		// String 클래스의 변경불가능한 속성때문에 replace를 쓸 때에만 바뀌지만 기본값은 그대로이다.
		// 원본 문자열을 변경하길 원한다면 새로운 문자열로 리턴되는 값을 다시 담아줘야 한다.

		System.out.println(str2.replace('H', 'h'));
		System.out.println(str2);
		
		System.out.println(str5.replaceFirst("자바","JAVA"));

		//공백도 문자다
		//trim() : 양쪽 공백 제거(중간 공백 제거 x)
		String str6 = " Hello World ";
		System.out.println(str6.trim());
		System.out.println(str6.equals("Hello World"));
		System.out.println(str6.length());
	
		//static ==> 클래스이름.메소드명, 클래스이름.상수
		//static String valueOf() : 지정된 값을 문자열로 변환하여 반환
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf('c'));
		System.out.println(String.valueOf(125)); //"100" ==> Interger.parseInt("100")
	
		//a를 문자열로 변경
		int a = 100;
		String str7 = a+"100";
		
		//toLowercase(): 모든 문자열을 소문자로 변경 / toUpperCase(): 모든 문자열을 대문자로 변경
		
		System.out.println("toLowerCase() : "+str2.toLowerCase());
		System.out.println("toUpperCase() : "+str2.toUpperCase());
		
		
		//split()
		String animals = "dog,cat,bear";
		//regex : reguar expression(정규 표현식) - 특정한 규칙을 가진 문자열의 집합
		String[] arr = animals.split(",");
		System.out.println(arr);
		//배열을 찍엇는데 안나오면 toString 이 오버라이딩이 안되어있어서 그렇고 
		//아래처럼 for문을 돌려주면 나온다
		//for문을 돌리면 다양한 작업을 할 수 있다.
		
		//for 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// split(String regex, int limit): regex로 나누되, limit로 개수로 나누기
		arr = animals.split(",", 0);
		System.out.println(Arrays.toString(arr));
		
		
		//compareTo(String str) : str과 문자열 비교(사전 순서)
		//같으면 0 사전순으로 이전이면 음수, 이후면 양수
		System.out.println("compareTo : "+"aaa".compareTo("aaa"));
		System.out.println("compareTo : "+"aaa".compareTo("bbb"));
		System.out.println("compareTo : "+"bbb".compareTo("aaa"));
		System.out.println("compareTo : "+"aaa".compareTo("aaa"));

		//split() <==>join() 서로 반대 개념
		//join(): 특정 문자열(구분자)로 결합
		arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		String str8 =String.join("-", arr);
		System.out.println("join() : "+str8);
	}

	

}











