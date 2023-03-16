package io;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputEx1 {

	public static void main(String[] args) {
		//키보드에서 입력을 받아들여 파일에 쓰기
		//조건 : 키보드에서 q가 입력되기 전까지 입력받기
		//      Scanner, FileWriter/BufferedWriter
		
		String content = null; // 사용자 입력 내용 변수 저장
		
		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("C:\\temp\\output3.txt");
				BufferedWriter bw = new BufferedWriter(fw)){
			
			System.out.println("파일에 저장할 데이터를 입력해주세요");
			System.out.println("입력을 중단하려면 q를 입력해주세요");
			// abc 입력시 q냐 아니냐를 비교해서 q면 프로그램 종료
			// 이므로  입력을 먼저받아야 한다
		do {
			System.out.println(">>");
			content = sc.nextLine(); // 사용자 입력 저장
			if(!content.equals("q")) {
			bw.write(content);
			bw.newLine();
			}
		} while (!content.equals("q"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}



















