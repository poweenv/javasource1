package thread;

public class User extends Thread{
	private Calcurator cal;
	
	@Override
	public void run() {
		cal.setMemory(100);
	
	}

	public User(Calcurator cal) {
		super();
		this.cal = cal;
		setName("User1");
	}
}