package arrayproblems;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,9};
//		int count=1;
//		System.out.println("missing number is: ");
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=count) {
//				System.out.print(count);
//				count++;
//			}
//			count++;
//		}
		
		
		       
		        int n = arr.length + 1; // since one number is missing

		        int totalSum = n * (n + 1) / 2;
		        int arraySum = 0;

		        for (int num : arr) {
		            arraySum += num;
		        }

		        int missing = totalSum - arraySum;
		        System.out.println("Missing number is: " + missing);
		    }
		

	

}
