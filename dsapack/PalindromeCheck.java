package dsapack;

public class PalindromeCheck {

	public static void main(String[] args) {
		
//		String originalString="madam";
//		// Using StringBuilder
//        StringBuilder sb = new StringBuilder(originalString);
//        String reversedString = sb.reverse().toString();
//        
//        if(reversedString.equals(reversedString))
//        {
//        	System.out.println("that string is Palindrome");
//        }
//        else
//        {
//		System.out.println("that string is not Palindrome");
//        }

		        String str = "racecar";
		        boolean isPalindrome = true;

		        int left = 0;
		        int right = str.length() - 1;

		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                isPalindrome = false;
		                break;
		            }
		            left++;
		            right--;
		        }

		        if (isPalindrome) {
		            System.out.println("that string is Palindrome");
		        } else {
		            System.out.println("that string is not Palindrome");
		        }

		    }
		}
	