package dsapack;

public class SplitArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int d=a.length;;
		int[] b=new int[d/2];
		int[] c=new int[d/2];
		int j=0;
		
		for(int i=0;i<d;i++) {
			if(i<d/2) {
				b[i]=a[i];
			}else {
				c[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
