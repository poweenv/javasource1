package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;





/*
 *  I/O (input/output)
 *  Input : 키보드
 *  Output : 화면
 *  
 *   스트림(Stream): 한쪽에서 다른 쪽으로 데이터를 전달하기 위해,
 *   			   두 대상을 연결하고 데이터를 전송할 수 있는
 *   1) 바이트 기반 스트림 : 바이트 단위로 데이터 전성
 *   					FileInputStream,FileOutpueStream....
 *   
 *   2) 문자 기반 스트림 : 문자 단위로 데이터 전성
 *   					fileReader, FileWriter....
 *   
 *   
 */

public class OutputStringEx1 {

	public static void main(String[] args) {
		// input : 키보드
		InputStream in= System.in;	

		// output : 화면
		OutputStream out = System.out;
		
		
		//입력이 들어오면 읽어오기
		try {
			//read() : 한 바이트만 읽어줌(읽어올 바이트가 없으면 -1 리턴), 한글(3byte)는 깨짐
			int input = 0;
			while((input =in.read())!=-1) {
				out.write(input);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}








