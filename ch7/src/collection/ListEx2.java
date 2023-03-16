package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

	public static void main(String[] args) {
		//ArratList 에 Member 객체를 추가

		//Member2 담는 ArrayList 생성
		ArrayList<Member2> list2 = new ArrayList<>();
		list2.add(new Member2("james", "j123", "j1234"));
		list2.add(new Member2("jake", "k123", "k1234"));
		list2.add(new Member2("jay", "y123", "y1234"));
		list2.add(new Member2("jozi", "i123", "i1234"));
		list2.add(new Member2("daniel", "d123", "d1234"));
		list2.add(new Member2("dan", "n123", "n1234"));
		list2.add(new Member2("amy", "a123", "a1234"));
		System.out.println(list2); //오버라이딩된 toString() 출력 ==> 확인 용도

		System.out.println(list2.size());
		
		for (int i = 0; i < list2.size(); i++) {
			Member2 member = list2.get(i);
			System.out.println("id : "+member.getId()+" password : "
			+member.getPwd()+" name : "+member.getName());
		}
		
		// Iterater interface : List,Set,Map 구조에서 요소를 접근하는 방법에 대한 통일성 제공
		// hasNext() : 다음요소가 존재하는 경우 true
		// next() : 요소 가져오기
		System.out.println();
		System.out.println("id   password   name");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t"+member2.getPwd()+"\t"+member2.getName());
		}
		//향상된 for 문
		
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t"+member2.getPwd()+"\t"+member2.getName());
		}
	}

}






























