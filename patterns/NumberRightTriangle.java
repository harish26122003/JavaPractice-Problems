package patterns;

public class NumberRightTriangle {

	public static void main(String[] args) {
	        int n = 5;       // number of rows
	        int num = 1;     // starting number

	        for(int row = 1; row <= n; row++) {
	            for(int col = 1; col <= row; col++) {
	                System.out.print(num++ + " ");
//	                num++;   // increment the number
	            }
	            System.out.println(); // new line after each row
	        }
	    }
	}


