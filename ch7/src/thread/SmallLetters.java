package thread;

public class SmallLetters extends Thread {

	@Override
	public void run() {
		//같이 수행할 코드를 작성
		//a~z 출력
		
		for (char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
	}
}
