package collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		userTest();
		userWithSameHashCodeTest();

	}

	private static void userWithSameHashCodeTest() {
		Set<UserWithSameHashCode> users = new HashSet<UserWithSameHashCode>();
		for (int i = 0; i < 6; i++) {
			users.add(new UserWithSameHashCode("name" + i, i));
		}

		for (int i = 0; i < 2; i++) {
			users.add(new UserWithSameHashCode("name" + i, i));
		}
		for (UserWithSameHashCode user : users) {
			System.out.println(user);
		}
	}

	private static void userTest() {
		Set<User> users = new HashSet<User>();
		for (int i = 0; i < 6; i++) {
			users.add(new User("name" + i, i));
		}

		for (int i = 0; i < 2; i++) {
			users.add(new User("name" + i, i));
		}
		for (User user : users) {
			System.out.println(user);
		}
	}

}
