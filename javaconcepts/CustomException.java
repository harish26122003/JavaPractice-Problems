package javaconcepts;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message, Throwable cause) {
        super(message, cause); 
	 }
	}

public class CustomException {

	 public static void validate(int age) throws InvalidAgeException {
		 		
			     if (age < 18) {
			         throw new InvalidAgeException("Age must be 18 or above", null);
			     }
			     System.out.println("Valid age: " + age);
			 }

			 public static void main(String[] args) {
			     try {
			         validate(12);
			     } catch (InvalidAgeException e) {
			         System.out.println("Caught Exception: " + e.getMessage());
			     }
	}

}
//Custom Checked Exception


