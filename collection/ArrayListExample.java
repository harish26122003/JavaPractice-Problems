package collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add elements
        students.add("Harish");
        students.add("Arun");
        students.add("Kumar");

        // Remove element
        students.remove("Arun");

        // Access element
        System.out.println("First Student: " + students.get(0));

        // Print all
        System.out.println("Final List: " + students);
    }
}
