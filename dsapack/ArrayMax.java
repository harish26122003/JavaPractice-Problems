package dsapack;

public class ArrayMax {

	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 7};
		int max = arr[0];
		for (int num : arr) {
		    if (num > max) max = num;
		}
		System.out.println(max);


	}

}
