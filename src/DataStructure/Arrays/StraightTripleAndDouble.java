package DataStructure.Arrays;

public class StraightTripleAndDouble {

    public static int SearchingChallenge(int num1, int num2) {
        // Convert both numbers to strings to easily check patterns
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);

        // Loop through digits 0-9 to check for triples in num1 and doubles in num2
        for (int i = 0; i <= 9; i++) {
            String triple = String.valueOf(i) + i + i;  // e.g., "999"
            System.out.println(triple);
            String doubleStr = String.valueOf(i) + i;    // e.g., "99"

            // Check if num1 contains the triple and num2 contains the double
            if (strNum1.contains(triple) && strNum2.contains(doubleStr)) {
                return 1;
            }
        }

        // Return 0 if no matching triple-double pattern is found
        return 0;
    }
    public static void main(String[] args) {

        System.out.println(SearchingChallenge(465555, 5579));
    }
}

