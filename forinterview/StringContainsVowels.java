package forinterview;
public class StringContainsVowels {
//
 public static void main(String[] args) {
	White w=new White();
	System.out.println(w.removeWhiteSpaces("Harish Raj"));
 }}
 
//  System.out.println(stringContainsVowels("Hello")); // true
//  System.out.println(stringContainsVowels("TV")); // false
// }
//
// public static boolean stringContainsVowels(String input) {
//  return input.toLowerCase().matches(".*[aeiou].*");
// }
//
//}
class White{
String removeWhiteSpaces(String input) {
	 StringBuilder output = new StringBuilder();
	 
	 char[] charArray = input.toCharArray();
	 
	 for (char c : charArray) {
	  if (!Character.isWhitespace(c))
	   output.append(c);
	 }
	 
	 return output.toString();
}
}
