package patterns;

public class NumPyramid {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
