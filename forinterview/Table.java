package sample;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("what table you want");
		int b=obj.nextInt();
		obj.close();
		int i;
		for(i=1;i<=10;i++) {
			
			System.out.println(i+"*"+b+" = "+(i*b));
		}
		
	}
	
}