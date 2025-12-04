package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        // Sort list
        Collections.sort(list);

        System.out.println("Sorted List: " + list);

        // Reverse
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);

        // Max & Min
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}
