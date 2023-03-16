package thread;

import java.net.MalformedURLException;
import java.net.URL;

/*
 URL(Uniform Resource Locator
   
 ex) https://www.msn.com/ko-kr/news/other
   
 프로토콜: https(차원에 접근하기 위해 서버와 통신하는데 필요한 통신규약)
 호스트명 : www.naver.com , search.naver.com(서버 이름)
 
 경로명 : 접근하려는 자원이 저장된 서버상의 위치
 파일명 : Scanner.html
 쿼리 : URL 에서 ? 이후의 부분
 */
public class UrlEx {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.msn.com/ko-kr/feed?ocid=msedgdhp");
			
			System.out.println("url.getAuthority : " +url.getAuthority());		
			System.out.println("url.getContent : " +url.getContent());		
			System.out.println("url.getDefaultPort : " +url.getDefaultPort());		
			System.out.println("url.getPort : " +url.getPort());		
			System.out.println("url.getFile : " +url.getFile());		
			System.out.println("url.getHost : " +url.getHost());		
			System.out.println("url.getPath : " +url.getPath());		
			System.out.println("url.getProtocol : " +url.getProtocol());		
			System.out.println("url.getQuery : " +url.getQuery());		
			System.out.println("url.getUserInfo : " +url.getUserInfo());		
			//toExternalForm() : URL 문자열로 반환
			System.out.println("url.toExternalForm : " +url.toExternalForm());		
			// toURI : URL ==?URI 
			//URI 가 URL을 포함하고 있는 개념
			System.out.println("url.toURI : " +url.toURI());		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}



















