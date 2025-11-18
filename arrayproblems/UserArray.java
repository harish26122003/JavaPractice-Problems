package arrayproblems;
import java.util.*;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the "+i+"th element");
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("your array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

	
}
