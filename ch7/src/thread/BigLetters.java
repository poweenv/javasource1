package thread;

public class BigLetters extends Thread {

	
	@Override
	public void run() {
	
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
		}
		
	}
}

