package thread;

public class User2 extends Thread{
	private Calcurator cal;
	
	@Override
	public void run() {
		
		cal.setMemory(50);
	
	}

	public User2(Calcurator cal) {
		super();
		this.cal = cal;
		setName("User2");
	}
}