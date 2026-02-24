package week4.day1;
import java.util.HashSet;
import java.util.Set;
public class HappyNumber {
public static void main(String[] args) {
		int originalNum = 2;
		long num = originalNum;
		long sum = 0;
		Set<Long> seen  = new HashSet<>();
		while (sum != 1 && !seen.contains(num)) {
			seen.add(num);
			sum = 0;
			while (num > 0) {
				long digit = num % 10;
				num = num / 10;
				sum += (digit * digit);
			}
			num = sum;
		}
	    boolean isHappyNumber = sum == 1;
		System.out.println(isHappyNumber);
	}
	}