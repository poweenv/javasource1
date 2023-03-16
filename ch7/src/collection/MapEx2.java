package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 50);
		map.put("kil", 51);
		map.put("kin", 32);
		map.put("kir", 70);
		map.put("kie", 98);
		map.put("kis", 80);
		map.put("kib", 65);
		map.put("kip", 86);
		map.put("kio", 23);
		map.put("kiz", 84);

		//HashMap 요소에 접근하기
		
		//entrySet() : map => set 구조로 변환 
		//Entry : 키와 값의 결합
		Set<Entry<String, Integer>> set = map.entrySet();
		
		//
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			System.out.println("name: "+entry.getKey()+"   point : "+entry.getValue());
		}
		
		
		//keySet(): map 에서 키값만 가져오기
		Set<String> keys=map.keySet();
		System.out.println("참가자 명단: "+keys);
		
		//values()
		Collection<Integer> values= map.values();
		System.out.println("point : "+values);
		//Collections: class, collection 에 사용할 유용한 메소드(sort,max,min 등)를 가지고 있음
		
		
		//총점, 평균, 최고점, 최저점
		int total = 0;
		Iterator<Integer> it2 = values.iterator();
		while (it2.hasNext()) {
			total += it2.next();
			
		}
		System.out.println("total : "+total);
		System.out.println("average : "+total/set.size());
		System.out.println("max point : "+Collections.max(values));
		System.out.println("max point : "+Collections.min(values));
		
		
		
	}
	

}

























