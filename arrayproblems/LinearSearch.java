package arrayproblems;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int element = 30;
        boolean found = false;  // flag to track

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index " + i);
                found = true;
                break; // stop loop when found
            }
        }

        if (!found) {
            System.out.println("Element not found in array");
        }
    }
}
