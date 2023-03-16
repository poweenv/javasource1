package lang;

public class StringEx3 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12345AB","AB"));
		System.out.println(count("12345","AB"));
	}

	
	public static int count(String src, String target) {
		int count = 0; //찾은 횟수
		int pos = 0;   //찾기 시작할 위치

		//반복문을 사용해서 아래의 과정 반복하는 코드 작성
		
		//	1. src에서 target을 pos의 위치부터 찾는다
//		while(true) {
//			pos= src.indexOf(target,pos);
//			//  2. 찾으면 count의 값을 1 증가시키고, pos의 값을 target,length 만큼 증가시킨다.
//			if(pos!=-1) {
//				count++;
//				pos+= target.length();
//			}else {
//				//  3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
//				break;
//			}
//		}
//		return count;
		while((pos=src.indexOf(target,pos))!=-1) {
			count++;
			pos+=target.length();
		}
		return count;
		
//		for (int i = 0; i < src.charAt(i); i++) {
//			System.out.println(src.charAt(i));
//			if(src.indexOf(i)==target.indexOf(i)){
//				count++;
//				pos+=target.length();
//			}else{
//				return count;
//			}
//		}
//		return pos;
	}

}
