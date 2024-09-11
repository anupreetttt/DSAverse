package HackerRank;

class UserMainCode {

    public static void main(String[] args) {
        System.out.println(difference("abac"));
    }
    public static int difference(String input1) {
        int longestPalindromeLength = findLongestPalindromeLength(input1);
        int shortestPalindromeLength = findShortestPalindromeLength(input1);

        return longestPalindromeLength - shortestPalindromeLength;
    }

    // Helper function to find the longest palindromic substring length
    private static int findLongestPalindromeLength(String str) {
        int maxLength = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(str, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    // Helper function to find the shortest palindromic substring length
    private static int findShortestPalindromeLength(String str) {
        return 1; // Shortest palindromic substring length is always 1 for any non-empty string.
    }

    // Helper function to check if a substring is palindrome
    private static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}