package arrayproblems;

import java.util.Arrays;

public class MergeNoSpace {

	public static void main(String[] args) {
		int [] a = {1, 4, 7, 8, 10};
		int [] b = {2, 3, 9};
		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<b.length;j++) {
//				if(a[i] >= b[j]) {
//					int temp =a[i];
//					a[i]=b[j];
//					b[j]=temp;
//				}
//		
//			}
//		}
//		
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b.length;j++) {
//				if(b[i] <= b[j]) {
//					int temp =b[i];
//					b[i]=b[j];
//					b[j]=temp;
//				}
//			}
//			
//				}
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//
		

		        merge(a, b);

		        System.out.println(Arrays.toString(a));
		        System.out.println(Arrays.toString(b));
		    }

		    static void merge(int[] a, int[] b) {
		        int n = a.length;
		        int m = b.length;

		        for (int i = 0; i < n; i++) {

		            // If element in a is greater than the smallest in b, swap
		            if (a[i] > b[0]) {
		                int temp = a[i];
		                a[i] = b[0];
		                b[0] = temp;

		                // Place b[0] in its correct sorted position in b
		                int first = b[0];
		                int k;
		                for (k = 1; k < m && b[k] < first; k++) {
		                    b[k - 1] = b[k];
		                }
		                b[k - 1] = first;
		            }
		        }
		    }
		

	}

		
		
		
		
		
		
		
		
		
