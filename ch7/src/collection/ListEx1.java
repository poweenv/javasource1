package collection;import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 컬렉션 프레임웍
 * 컬력션 : 여러 데이터를 모아 놓은 것
 * framework : 표준화,정형화된 프로그래밍 방식
 * 
 * 라이브러리 : 공통으로 사용될만한 유용한 기능을 모듈화
 * 
 * Collection
 * 
 * List    Set
 * 
 * Map
 * 
 * 외우기 3개의 인터페이스의 특징- 파이썬에서도 동일하다
 *  List interface : 순서가 존재함, 데이터 중복 허용
 * 	 구현 클래스 :  ArrayList, LinekedList, Stack, Vector...
 * 
 *  Set interface : 순서를 유지하지 않음, 데이터 중복 허용하지 않음
 *   구현 클래스 : HashSet, TreeSet...
 *   
 *  Map interface : key, value 의 쌍으로 이루어진 데이터 집합
 *     				순서를 유지하지 않음, key는 중복안되고 value는 중복 허용
 *   구현 클래스 : HashMap, TreeMap, Hashtable, Properties...
 *   
 *   <E> or <T>, <K,V> : 지네릭스 개념 ==> 타입 지정
 *   E: element type 지정
 *   <>안에 참조 타입만 지정가능
 */
public class ListEx1 {

	public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			ArrayList<String> list2 = new ArrayList<>();
			
			System.out.println("size() : "+list.size());		//배열의 rangth와 같은 개념
			System.out.println("IsEmpty() : "+list.isEmpty());
			
			//add() : 요소를 추가하려면
			list.add(7);
			list.add(2);
			list.add(6);
			list.add(5);
			list.add(4);
			list.add(3);
			
			list2.add("java");
			list2.add("py");
			list2.add("c");
			list2.add("c++");
			
			System.out.println(list);
			System.out.println(list2);
			
			String fruits[]= {"apple","melon","banana","strawberry","orange"};
			//배열 => 리스트로 전환(추가할 내용이 없다면)
			List<String> list3= Arrays.asList(fruits);
			System.out.println(list3);
//			list3.add("grape");
			
			// 배열=> 리스트로 전환(추가할 내용이 있다면)
			List<String> list4 =new ArrayList<>(Arrays.asList(fruits));
			list4.add("grape");
			System.out.println(list4);
			
			// add(int index, 요소)
			list.add(3, 6);
			System.out.println("특정 위치에 추가 후 "+list);
			
			//set(int index, 변경할 요소): 
			list.set(3, 7);
			System.out.println("특정 위치에 요소 변경 "+list);
			
			//remove(int index)
			list2.remove(2);
			System.out.println("특정 위치 요소 제거 후 :"+list2);
			//remove(Object o)
			list4.remove("banana");
			System.out.println("특정 요소 제거 후 :"+list4);
			
			//get(int index)
			
			System.out.println("특정 위치 요소 가져오기 :"+list2.get(0));
			
			//indexOf()
			System.out.println("특정 요소 위치 가져오기 : "+list2.indexOf("py"));
			
			//Collections.sort() : 오름차순 기본 , 내림차순을 원할 때는 기준 제공
			Collections.sort(list4); //리턴타입이 void라서 호출만 한다
			System.out.println("정렬 후 : "+list4);
			
			
			//Comparator.naturalOrder() : 오름차순 , Comparator.reverseOrder() : 내림차순
			list.sort(Comparator.reverseOrder());
			System.out.println("정렬 후 : "+list);

			
			
			
			
			
}
}


























