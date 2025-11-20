package dsapack;

public class ArmstrongNumCheck{
    public static void main(String[] args) {
        int number = 9474;
        int numFin = number;  // keep a copy of original

        // Step 1: Count digits

//        length check without using toString and length method
//        int temp = number;
//        int length = 0;
//        while (temp > 0) {
//            temp /= 10;
//            length++;
        
        String strNumber = Integer.toString(number);		//Integer class--> toString() method-->parameter as number
        int length = strNumber.length();					//length() method

        int value = 0;

       
        // Step 2: Extract digits and compute power
        while (number > 0) {
            int digit = number % 10;
            value += Math.pow(digit, length);			//Math class--> pow() method(base,exponent).for power operation
            number /= 10;
        }

        
        // Step 3: Compare
        if (value == numFin) {
            System.out.println(numFin + " is an Armstrong number");
        } else {
            System.out.println(numFin + " is NOT an Armstrong number");
        }
    }
}

