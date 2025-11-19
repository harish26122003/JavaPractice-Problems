package patterns;

public class FullNum {

	public static void main(String[] args) {
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(i);
//			}
//			System.out.println("");
//		}
//		pyramid
//		int n=5;
//		for(int row=1;row<=n;row++) {
//			for(int col=1;col<=row;col++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//pyramid number
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println("");
		}
	}

}
