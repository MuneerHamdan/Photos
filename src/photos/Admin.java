package photos;

import java.util.Iterator;
import java.util.ArrayList;

public class Admin {

    private static ArrayList<User> users = new ArrayList<>();

    // list users
    public static Iterator<User> listUsers() {
        return users.iterator();
    }

    // create new user
    public static void createUser(String username) {
        users.add(new User(username));
    }

    // delete existing user
    public static void deleteUser(String username) {

        User u = users.getFirst();

        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username))
                u = user;
        }

        users.remove(u);
    }
}
