package patterns;

public class RightAlignedTriangle {
    public static void main(String[] args) {
//        int n = 5;
//        for(int i = 1; i <= n; i++) {
//            // print spaces
//            for(int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // print stars
//            for(int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    	
    	int n=5;
    	for(int i=1;i<=n;i++) {
    		for(int j=0;j<=n-i;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}


