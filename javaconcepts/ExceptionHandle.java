package javaconcepts;
import java.util.*;

public class ExceptionHandle {

	public static void main(String[] args) {
		System.out.println("Enter 1 to 10");
		Scanner s=new Scanner(System.in);
		int result = 0;
		
		try{
		int a=s.nextInt();
		s.close();
		result=10/a;
		}
		
		//multicatch
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("succesful you num is "+ result);
	}

}
