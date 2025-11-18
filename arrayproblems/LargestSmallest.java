package arrayproblems;

public class LargestSmallest {

	public static void main(String[] args) {
		int arr[]= {12,45,63,45,88};
		
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) { // i = 1 is enough since 0 is already taken
		    if (arr[i] > largest) {
		        largest = arr[i];
		    }
		    if (arr[i] < smallest) {
		        smallest = arr[i];
		    }
		}

		System.out.println("the largest element is " +largest);
		System.out.println("the smallest element is " +smallest);

	}

}
