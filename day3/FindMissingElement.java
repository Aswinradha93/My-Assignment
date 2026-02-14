package week2.day3;
import java.util.Arrays;

public class FindMissingElement {

    public static void main(String[] args) {

        // Given array
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Sort the array
        Arrays.sort(arr);

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {

            // Expected value should be i + 1
            if (arr[i] != i + 1) {
                System.out.println("Missing Number is: " + (i + 1));
                break; // Stop after finding first missing number
            }
        }
    }
}