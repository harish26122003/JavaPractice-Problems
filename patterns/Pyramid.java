package patterns;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {									//no of rows--> 5
			
			for(int j=1;j<=n-i;j++) {							//this for print white space 1- (n-i(i icrease),5-1) 4,1-3,1-2,1-1 
				System.out.print(" ");
			}for(int k =1;k<=i;k++) {							// this for print star ("* ") i times 1,2,3,4,5
				System.out.print("* " );							
			}
			System.out.println();
		}
		
		}
			
	}




