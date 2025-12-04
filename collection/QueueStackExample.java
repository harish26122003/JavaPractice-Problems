package collection;

import java.util.*;

public class QueueStackExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        // Remove first (FIFO)
        queue.poll();

        System.out.println("Remaining Tasks: " + queue);
        
        //STACK Example
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Remove last (LIFO)
        stack.pop();

        System.out.println("Stack after pop: " + stack);
    }
}

