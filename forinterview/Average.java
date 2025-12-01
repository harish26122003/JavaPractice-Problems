package sample;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1=obj.nextInt();
		System.out.println("Enter number 2");
		int n2=obj.nextInt();
		System.out.println("Enter number 3");
		int n3=obj.nextInt();
		obj.close();
		
		 System.out.println("Average of five numbers is: " + (n1 + n2 + n3) /3);
		
	}
	
}