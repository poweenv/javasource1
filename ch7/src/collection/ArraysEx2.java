package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * 정렬
 * 
 * Comparable interface : 기본 정렬 기준을 구현할 때 사용
 *   1)compareTable(Object o) ;
 *   
 * Comparator interface : 기본 정렬 기준외에 다른 기준으로 정렬하고자 할 때 사용
 *   1) compare(Object o) 
 */
public class ArraysEx2 {

	public static void main(String[] args) {
		int arr[] = {34,15,48,94,21,54,84,51};
		String strArr[]= {"cat","dog","lion","tiger"};
		
		//오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 사전 순으로 정렬, (공백, 숫자, 대묹,소문자 순으홎,;
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//내림차순 정렬
		//sort(T a[], Comparator<? super T> c)
		Arrays.sort(strArr, new DescComp());
		
		//Comparator.reversOrder() : 내림차순, Comparator.naturalOrder() : 오름차순
		Arrays.sort(strArr, Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(strArr));
		
		
	}
}
class DescComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2)*-1;
	}

	
}
























