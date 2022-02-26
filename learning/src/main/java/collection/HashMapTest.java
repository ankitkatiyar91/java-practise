package collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        User user1a = new User(1, "a");
        HashMap<User, String> users = new HashMap<>();
        users.put(user1a, "1");
        users.put(new User(2, "b"), "2");
        users.put(new User(3, "c"), "3");
        users.put(null, "3");

        System.out.println("Map contains" + users);

        System.out.println("Find 1,a: " + users.get(new User(1, "a")));
        System.out.println("Find 2,b: " + users.get(new User(2, "b")));
        System.out.println("Find 3,c: " + users.get(new User(3, "c")));
        System.out.println("Find using existing object user1a: " + users.get(user1a));
    }

    static class User {
        private Integer id;
        private String name;

        public User(Integer id, String name) {
            super();
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", name=" + name + "]";
        }

       /* @Override
        public int hashCode()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }*/

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            User other = (User) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

    }
}
