package collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> tasks = new LinkedList<>();

        // Add tasks
        tasks.add("Login Page");
        tasks.add("Dashboard");
        tasks.add("Profile Page");

        // Add at first & last
        tasks.addFirst("Setup Project");
        tasks.addLast("Logout Feature");

        // Remove first task
        tasks.removeFirst();

        // Print tasks
        System.out.println("Tasks: " + tasks);
    }
}
