package stringUtilityClassImplementation;

import java.util.Objects;

public class StringUtil {
	
	public static int countOccurrences(String str ,char ch) {
		int count = 0;
		for(int i=0 ;i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	public static String reverseString(String str) {
		String reversed ="";
		for(int i=str.length() - 1;i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		return reversed;
	}
	
	public static boolean isPalindrome(String str) {
		String reversed = reverseString(str);
		return str.equals(reversed);
	}
	
	public static String capatalizeWords(String str) {
		String[] words =str.split(" ");
		String capitalized = " ";
		for (String word : words) {
			capitalized = capitalized + word.substring(0,1).toUpperCase() + word.substring(1) + " ";
		}
		return capitalized.trim();
	}

}
