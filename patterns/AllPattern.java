package patterns;


class SamplePyramids{
	public static void reversedPyramid(int n) {
	
	for(int row=1;row<=n;row++) {									
		
		for(int col=n;col>=row;col--)
		{							 
			System.out.print("* ");
		}	
		System.out.println();
	}
	}
	
	public static void numPyramid(int n) {
	for(int row=1;row<=n;row++) {									
		
		for(int col=row;col<=n;col++)
		{							 
			System.out.print(col+" ");
		}	
		System.out.println();
	}
	}
	
	
	public static void rectanglePyr(int n) {
	
	for(int row=1;row<=(n*2)-1;row++) {									
			int rowValue=row>n?(n*2)-row:row;
		
		for(int col=1;col<=rowValue;col++)
		{							 
			System.out.print("* ");
		}	
		System.out.println();
	}
	}
	
	
	public static void spacePyramid(int n) {
		
		for(int row=1;row<=n;row++) {									
	
				
			for(int space=1;space<=n-row+1;space++) {
					System.out.print("*");
			}
			for(int star=1;star<=row;star++){							 
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}	
		
		public static void cummulativePyramid(int n) {
			
			for(int row=1;row<=n;row++) {									
		
					
				for(int space=1;space<=n-row;space++) {
						System.out.print("  ");
				}
				for(int star=1;star<=(row*2)-1;star++){							 
					System.out.print("* ");
				}
				System.out.println();
			}
		}
			
			public static void innerSpacePyramid(int n) {
				
				for(int row=1;row<=n;row++) {									
			
						
					for(int space=1;space<=n-row;space++) {
							System.out.print(" ");
					}
					for(int star=1;star<=(row*2)-1;star++){							 
						
						
						if(star==1||star==(row*2)-1||row==n) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
			}
				public static void holloDiamondPyramid(int n) {
					for (int i = 1; i <= n; i++) {
			            for (int j = 1; j <= n-i; j++) {
			                System.out.print("  ");
			            }
			            for (int j = 1; j <= 2*i-1; j++) {
			                if (j == 1 || j ==2*i-1) {
			                    System.out.print("* ");
			                } else {
			                    System.out.print("  ");
			                }
			            }
			            System.out.println();
			        }

			        // Lower hollow inverted pyramid
			        for (int i = n-1; i >= 1; i--) {
			            for (int j = 1; j <= n-i; j++) {
			                System.out.print("  ");
			            }
			            for (int j = 1; j <= 2*i-1; j++) {
			                if (j == 1 || j == 2*i-1) {
			                    System.out.print("* ");
			                } else {
			                    System.out.print("  ");
			                }
			            }
			            System.out.println();
			        }
	
				
				
	}
}
		
	

public class AllPattern {

	public static void main(String[] args) {
//		SamplePyramids.reversedPyramid(5);
//		SamplePyramids.numPyramid(5);
//		SamplePyramids.rectanglePyr(5);
//		SamplePyramids.spacePyramid(5);
//		SamplePyramids.cummulativePyramid(5);
//		SamplePyramids.innerSpacePyramid(5);
		SamplePyramids.holloDiamondPyramid(4);
		SamplePyramids c=new SamplePyramids();
	}

}
