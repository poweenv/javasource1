package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 	Map
 *	키(key) : 유일값
 *	값(value) : 중복가능 
 * 
 */
public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//put(key, value) : 요소 추가(key 값이 동일하다면 나중에 추가한 요소만 남게 됨)
		map.put("myId", "1234");
		map.put("myId1", "1233");
		map.put("myId2", "1232");
		map.put("myId3", "1231");
		map.put("myId4", "1230");
		
		System.out.println(map);

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해 주세요");
			//key에 해당하는 id 입력받기
			System.out.println("Id : ");
			
			String id = sc.nextLine().trim();
			//value에 해당하는 password 입력받기
			System.out.println("password : ");
			
			String pwd = sc.nextLine().trim();
			//map에 입력받은 id가 존재하지 않는경우 - "입력받은 아이디는 존재하지 않습니다. 다시 입력해주세요"
			// 메세지 출력 후 다시 id 입력받기
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지 않습니다 다시 입력해주세요");
				continue;
			}
			//containsKey() : HashMap에 키를 포함하고 있느냐?
			//containsValue() : HashMap에 value를 포함하고 있느냐?
			//get(Object key) : key의 값을 반환, 못찾으면 null
			
			//map에 입력받은 id가 존재하는경우 비밀번호를 입력받기
			// 입력받은 비밀번호가 일치하는지 확인한 후
			// 비밀번호가 일치하면 프로그램 종료, 일치하지 않는 경우 "다시 입력해 주세요"
			if(!map.get(id).equals(pwd)) {
				System.out.println("다시 입력해주세요");
				
			}else {
				System.out.println("id와 password가 일치합니다.");
				break;
			}
		}
	}

}
