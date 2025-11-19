package patterns;

public class ZeroOncePyramid {

    public static void main(String[] args) {
        
        int n = 5;
        int printValue;
        
        for (int row = 1; row <= n; row++) {
            printValue = (row % 2 == 0) ? 0 : 1;  // start with 1 for odd row, 0 for even row
            for (int col = 1; col <= row; col++) {
                System.out.print(printValue + " ");
                printValue = (printValue == 0) ? 1 : 0;  // toggle value
            }
            System.out.println();
        }
    }
}
