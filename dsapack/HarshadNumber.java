package dsapack;

public class HarshadNumber {

	public static void main(String[] args) {
		int n=18;
		int finNum=n;
		int total=0;
		
		 while (n > 0) {
	            int digit = n % 10;
	            total+=digit;
	            n /= 10;
	        }
		 if(finNum%total==0) {
			 System.out.println(finNum +" that is the Harshad number");
		 }else {
			 System.out.println(finNum +" that is the not a Harshad number");
		 }

	}

}
