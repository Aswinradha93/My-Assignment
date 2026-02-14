package week2.day3;


public class FindIntersection {

    public static void main(String[] args) {

        // Declare first array
        int a[] = {3, 2, 11, 4, 6, 7};

        // Declare second array
        int b[] = {1, 2, 8, 4, 9, 7};

        // Outer loop for array a
        for (int i = 0; i < a.length; i++) {

            // Inner loop for array b
            for (int j = 0; j < b.length; j++) {

                // Compare elements
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}