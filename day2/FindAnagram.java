package week2.day2;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()!=text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		}
		else {
			System.out.println("It is a Anagram");
		}
		
		char[] charArray = text1.toCharArray();
		char[] charArray1 = text2.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray1);
	
		if (Arrays.equals(charArray,charArray1)) {
			System.out.println("The given strings are Anagram.");
		}
		else {
			System.out.println("The given strings are not an Anagram.");
		}

	}

}