package arrayproblems;

public class Rotation {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int first=num[0];
		
		for(int i=0;i<num.length-1;i++) {
			num[i]=num[i+1];
		}
		num[num.length-1]=first;
		for(int x:num) {
			System.out.print(x+" ");
		
	}
}

}
