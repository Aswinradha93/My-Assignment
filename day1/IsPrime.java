package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		 // Given input number
		int input = 47;  
	        boolean isPrime = true;

	        // Check prime using loop
	        for (int i = 2; i < input; i++) {
	            if (input % i == 0) {
	                isPrime = false;
 
	            }
	        }

	        // Print result
	        if (isPrime) {
	            System.out.println(input + " is a Prime number");
	        } else {
	            System.out.println(input + " is not a Prime number");
	        }

	}

}
