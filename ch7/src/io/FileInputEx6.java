package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {

	public static void main(String[] args) {


//			fis =new FileInputStream("C:\\temp\\iu.mp4");
//			fos = new FileOutputStream("C:\\temp\\copy.mp4");


		try(FileInputStream fis=new FileInputStream("C:\\temp\\iu.mp4")) {
			FileOutputStream fos= new FileOutputStream("C:\\temp\\iucopy.mp4");
			int data=0;
			long start = System.currentTimeMillis();// 시작시간
			while ((data=fis.read())!=-1) {
				fos.write(data);
			}
			
			long end = System.currentTimeMillis(); // 종료시간
			System.out.println("InputStream / OutPutStream 걸린 시간 : "+(end-start)+"ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		try(FileInputStream fis=new FileInputStream("C:\\temp\\iu.mp4");
			BufferedInputStream bf= new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("C:\\temp\\iucopy.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			int data=0;
			byte b[] = new byte[8192];
			
			long start = System.currentTimeMillis();// 시작시간
			while ((data=fis.read())!=-1) {
				bos.write(data);
			}
			
			long end = System.currentTimeMillis(); // 종료시간
			System.out.println("InputStream+BufferedInputStream+byte / OutPutStream+BufferedOutputStream+byte 걸린 시간 : "+(end-start)+"ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}


















