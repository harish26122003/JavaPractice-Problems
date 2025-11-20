package dsapack;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n = 11;
        boolean isPrime = true;

        // 1. Handle numbers less than or equal to 1
        if (n <= 1) {
            isPrime = false;
        } else {
            // 2. Check divisibility from 2 up to √n
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // 3. Final result
        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
    }
}
