package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx1 {

	public static void main(String[] args) {
		//file에서 내용 읽기
		//text, music, image, 
		// text : byte 기반(FileInputStream), 문자기반(FileReader)
		// 음악, 동영상, 이미지 = byte 기반
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(".\\src\\io\\FileEx4.java");
//		
			int data = 0;
			while ((data=fis.read())!=-1) {
			System.out.print((char)data);
			}
		
//			byte[] b = new byte[100];
//			while (fis.read(b)!=-1) {
//				out.write(b);
//			}
		} catch (Exception e) {
			//FileInputStream() => FileNotFoundException
			//fit.read() => IOException
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
