package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 	Arrays
 * - 배열을 다루는 데 유용한 메서드가 정의되어 있다
 * - 모든 메소드는 static 이다. 
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		
		//toString : 배열의 요소를 문자열로 출력
		System.out.println(arr);  
		System.out.println(Arrays.toString(arr));

		
		int arr2[][] = {{11,22},{12,23}};
		
		//deepToString(): 2차원 배열의 요소를 문자열로 출력
		System.out.println(arr2);
		System.out.println(Arrays.deepToString(arr2));
		
		//equals() : 값비교(두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false)
		String[] str1 = {"aaa","bbb"};
		String[] str2 = {"aaa","bbb"};
		System.out.println(Arrays.equals(str1,str2));
		
		//deepEquals() : 2차원 배열 값 비교
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int arr3[]=new int[5];
		//arr 배열을 arr3로 복사를 하고 싶다면?
		
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		//copyOf(원본배열, 복사할 요소 개수). copyOfRange() 
		int arr4[] = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr4));
		
		int arr5[] = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr5));
		
		//4는 포함하지 않음
		int arr6[] = Arrays.copyOfRange(arr, 2,4);
		System.out.println(Arrays.toString(arr6));
		
		//fill() : 배열의 모든 요소를 지정한 값으로 채우기
		int arr7[]= new int[5];
		Arrays.fill(arr7, 2); // void 가 return 일때 메소드 호출만 함
		System.out.println(Arrays.toString(arr7));
		
		//sort() : 정렬(오름차순이 기본임)
		int arr8[]= {3,5,1,4,2};
		Arrays.sort(arr8);
		System.out.println(Arrays.toString(arr8));
		
		//binarySearch() : 이진검색
		/* 검색
		 * 순차검색 - 차례대로 검색하는 방식
		 * 이진검색 - 검색할 범위를 반복적으로 절반씩 줄여나가는 검색 방식
		 * 이진검색은 일차적으로 무조건 정렬(필수)이 되어있어야 된다
		 */
		
		//요소의 위치를 돌려 줌
		System.out.println( Arrays.binarySearch(arr8,0));
		System.out.println( Arrays.binarySearch(arr8,3));
		
		//asList(T... a): 배열을 List로 변환
		// T... : 가변인수
		// T : 기본타입이 아니어야 함
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> list=Arrays.asList(arr8);
		
		Integer[] arr9 = {15,14,21,23};
		List<Integer> list = Arrays.asList(arr9);
		System.out.println(list);
		
		//list 크기 변경을 원할 때
		list = new ArrayList<>(Arrays.asList(arr9));
		
		
	}

}
























