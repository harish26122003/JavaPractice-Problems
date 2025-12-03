package collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // Add numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate - ignored

        // Remove a number
        numbers.remove(10);

        // Print set
        System.out.println("Numbers in Set: " + numbers);
    }
}

