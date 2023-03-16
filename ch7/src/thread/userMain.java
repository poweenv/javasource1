package thread;

public class userMain {

	public static void main(String[] args) {

		Calcurator cal = new Calcurator();
		User user1 = new User(cal);
		User2 user2 = new User2(cal);

		
		user1.start();
		user2.start();
	}

}
