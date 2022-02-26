package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<User, Integer> users = new HashMap<User, Integer>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Adding new: " + users.put(new User("name" + i, i), i));
        }

        for (int i = 1; i <= 2; i++) {
            System.out.println("Duplicating: " + users.put(new User("name" + i, i), i));
        }

        System.out.println("======== adding user with unique but same id");
        users.put(new User("unique", 1), 1);
        users.put(new User("unique 2", 1), 1);


        System.out.println("Null Key: " + users.put(null, null));

        System.out.println("\n\n%%%%%%%%%%%%%%%%%% print keys %%%%%%%%%%%%%%%%%%%%%%%");
        for (User user : users.keySet()) {
            System.out.println(user);
        }

        System.out.println("\n\n%%%%%%%%%%%%%%%%%% print key-value %%%%%%%%%%%%%%%%%%%%%%%");
        for (User user : users.keySet()) {
            System.out.println(user + " " + users.get(user));
        }


    }
}
