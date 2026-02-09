package week2.day1;

public class FindFibonaaciSeries {

	public static void main(String[] args) {
		int number = 8;
		int x = 0;
		int y = 1;
		System.out.print(x + ", " + y);

		for (int i = 2; i <= number; i++) {
		    int z = x + y;
		    System.out.print(", " + z);
		    x = y;
		    y = z;
		}
    }
} 