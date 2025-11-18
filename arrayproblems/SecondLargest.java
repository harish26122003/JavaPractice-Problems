package arrayproblems;
import java.util.Arrays;


public class SecondLargest {

	public static void main(String[] args) {
		 int[] arr = {20,30,12,45,16};
		 
//		 int n = arr.length;
//		    for (int i = 0; i < n - 1; i++) {
//		        for (int j = 0; j < n - i - 1; j++) {
//		            if (arr[j] > arr[j + 1]) {
//		                // Swap arr[j] and arr[j+1]
//		                int temp = arr[j];
//		                arr[j] = arr[j + 1];
//		                arr[j + 1] = temp;
//		            }
//		        }
//		    }
//		    System.out.println("Second Largest element is "+arr[n-2]);
	

			        int largest = Integer.MIN_VALUE;
			        int secondLargest = Integer.MIN_VALUE;

			        for (int num : arr) {
			            if (num > largest) { 
			                // Update both
			                secondLargest = largest;
			                largest = num;
			            }
			            else if (num > secondLargest && num != largest) { 
			                secondLargest = num; // Only update second largest
			            }
			        }

			        System.out.println("Largest element: " + largest);
			        System.out.println("Second Largest element: " + secondLargest);
			    }
			

	}


