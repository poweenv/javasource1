package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx2 {

	public static void main(String[] args) {
		//copy (c:\\temp\\file1.txt=> C:\\temp\\file2.txt)
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		try {
//		//원본 파일 읽기
//		//읽어온 내용을 새로운 파일에 쓰기
////			fis =new FileInputStream("C:\\temp\\file1.txt");
////			fos = new FileOutputStream("C:\\temp\\file2.txt");
//			
//			fis =new FileInputStream("C:\\temp\\iu.mp4");
//			fos = new FileOutputStream("C:\\temp\\copy.mp4");
//			
//			int data=0;
//			while ((data=fis.read())!=-1) {
//				fos.write(data);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//				fos.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		try(FileInputStream fis=new FileInputStream("C:\\temp\\iu.mp4")) {
			FileOutputStream fos= new FileOutputStream("C:\\temp\\file2.txt");
			int data=0;
			while ((data=fis.read())!=-1) {
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


















