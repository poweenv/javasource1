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

public class InputStringEx3 {

	public static void main(String[] args) {
		// input : 키보드
//		InputStream in= System.in;	
//		OutputStream out = System.out;
//		//입력이 들어오면 읽어오기
//		try {
//			//read(byte[] b) : byte 배열만큼 읽어줌(읽어올 바이트가 없으면 -1 리턴)
//			//write(byte[] b): byte 배열만큼 쓰기
//			byte[] b = new byte[100];
//		
//			System.out.print("이름 : ");
//			int nameByte = in.read(b);
//			
//			//String 생성자를 이용해서 nameByte를 String 로 생성하기
//			//enter : carriage return + line feed = 2바이트 차감
//			String name= new String(b,0,nameByte-2);
//			
//			System.out.println("하고 싶은 말 : ");
//			int commentByte = in.read(b);
//			//String 생성자를 이용해서 commentByte를 String 으로 생성하기
//			String comment = new String(b);
//			
//			//생성한 String 출력
//			System.out.println("입력한 이름 : "+name);
//			System.out.println("입력한 하고 싶은 말 : "+comment);
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			//스트림 닫기
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	
		OutputStream out = System.out;
		try (InputStream in= System.in){
			byte[] b = new byte[100];
			
			System.out.print("이름 : ");
			int nameByte = in.read(b);
			
			//String 생성자를 이용해서 nameByte를 String 로 생성하기
			//enter : carriage return + line feed = 2바이트 차감
			String name= new String(b,0,nameByte-2);
			
			System.out.println("하고 싶은 말 : ");
			int commentByte = in.read(b);
			//String 생성자를 이용해서 commentByte를 String 으로 생성하기
			String comment = new String(b);
			
			//생성한 String 출력
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}








