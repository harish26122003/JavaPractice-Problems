package dsapack;

public class PerfectNumbercheck {

	public static void main(String[] args) {
		int n=28;
		
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println(n+" this number is a Perfect number");
		}else {
			System.out.println(n+" this number is not a Perfect number");
		}
	}

}
