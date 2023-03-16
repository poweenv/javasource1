package io;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		//자바에서 파일 다루기

		// \ => escape 문자(\t, \n, \b...)
		
		//File(String pathname)
		File file1 = new File( "c:\\ temp//test1.txt");
		//Fule(String parent,String child)
		File file2 = new File( "c:\\ temp","test1.txt");
		
		//File(File parent,String child)
		File dir = new File("c:\\ temp");
		File file3 = new File(dir,"test1.txt");
		
		//File(URI uri)
		
		//주요 메소드
		//file.getName() : 파일명 가져오기
		String fileName = file1.getName();
		//. 위치찾기, substring 써서 test1 추출
		int pos = fileName.indexOf(".");
		
		
		System.out.println("파일 명 : "+fileName);
		System.out.println("확장자를 제외한 파일명"+fileName.substring(0,pos));
		System.out.println("확장자"+ fileName.substring(pos+1));
		
		//getPath()
		System.out.println("파일명을 포함한 파일의 경로"+file1.getPath());
		//getAbsolutePath(): 파일의 절대 경로,getAbsolutePath(): 파일의 정규 경로
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath());
		
		//getParent()
		System.out.println("파일이 속해있는 디렉토리"+file1.getParent());
		
		
		// File.pathSeparator : 운영체제에서 사용하는 경로 구분좌(윈도우 : ; , 유닉스 : 콜론(:))
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		//File.separator : 운영체제에서 사용하는 이름 구분자(윈도우 : \ , 유닉스 : /)
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
	}

}


















