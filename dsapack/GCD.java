package dsapack;

public class GCD {

	public static void main(String[] args) {
		int a=18;
		int b=27;
		int remain=0;
		
		while(b!=0) {
			remain=a%b;
			a=b;
			b=remain;
		}
		System.out.println("GCD of this two number is "+a);
	}

}
