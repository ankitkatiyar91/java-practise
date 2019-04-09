package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<User, Integer> users = new HashMap<User, Integer>();

		for (int i = 0; i < 6; i++) {
			users.put(new User("name" + i, i), i);
		}

		for (int i = 0; i < 2; i++) {
			users.put(new User("name" + i, i), i);
		}
		System.out.println("adding user with unique but same id");
		users.put(new User("unique", 1), 1);
		users.put(new User("unique 2", 1), 1);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("%%%%%%%%%%%%%%%%%% print %%%%%%%%%%%%%%%%%%%%%%%");
		for (User user : users.keySet()) {
			System.out.println(user);
		}
	}
}
