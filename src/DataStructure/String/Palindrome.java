package DataStructure.String;

public class Palindrome {

    public static void main(String[] args) {

        String a = "level";
        int start = 0;
        int end = a.length() - 1;

        System.out.println(isPalindrome(a, start, end));

    }

    public static boolean isPalindrome(String a, int start, int end) {

        while (start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
