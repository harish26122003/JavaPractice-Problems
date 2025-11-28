package javaconcepts;
import java.lang.reflect.Method;
import java.util.Arrays;


class HelperClass {
	String s="harish";
}


public class GetClassMethods {

	public static void main(String[] args) {
		 
		HelperClass obj = new HelperClass(); // ✅ Create object
        System.out.println(obj.s.getClass().getName());
        
        Method[] c=Arrays.class.getDeclaredMethods();

		for (Method m : c) {
	        System.out.println(m);
	    }
	 System.out.println("total Array class method is "+ c.length);
	}
}

