package week2.day1;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// to store input number
		int input = 7227;
		// to store Reversed number
		int output = 0 ;    
		// Reverse the number using for loop
		for (int i = input; i > 0; i = i / 10) {
			int rem = i % 10;
			output = (output * 10) + rem;
		}

		// Check the given input number is palindrome or not 
		if (input == output) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is not a Palindrome");
		}

	}

}
