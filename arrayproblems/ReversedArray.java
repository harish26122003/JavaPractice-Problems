package arrayproblems;

import java.util.Arrays;

public class ReversedArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int length=arr.length;
		System.out.println("original array"+Arrays.toString(arr));
		
		int first=0;
		int last=length-1;
		
		while(first<last) {
//			int temp;
			
//			temp=arr[first];   
//			arr[first]=arr[last];
//			arr[last]=temp;
			arr[first]=arr[first]+arr[last];   //swap without using temp
			arr[last]=arr[first]-arr[last];
			arr[first]=arr[first]-arr[last];
			
			first++;
			last--;
		}
		System.out.println("the reversed array is"+Arrays.toString(arr));
		
	}

}
