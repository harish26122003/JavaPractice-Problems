package dsapack;

public class StrongNumberCheck {

    // factorial method inside main class
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 2;
        int numCheck = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit); // directly call method
            number /= 10;
        }

        if (numCheck == sum) {
            System.out.println(numCheck + " is a Strong Number");
        } else {
            System.out.println(numCheck + " is not a Strong Number");
        }
    }
}
