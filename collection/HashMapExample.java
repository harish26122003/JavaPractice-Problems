package collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> users = new HashMap<>();

        users.put(101, "Harish");
        users.put(102, "Arun");
        users.put(103, "Kumar");

        // Fetch value by key
        System.out.println("User 102: " + users.get(102));

        // Remove entry
        users.remove(101);

        // Print all entries
        System.out.println("All Users: " + users);
    }
}

