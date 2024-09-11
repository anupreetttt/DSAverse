package DataStructure.Grokking.WarmUpProblems;

import java.util.Scanner;

public class Valid_palindrome {

    public static boolean isPalindrome(String s) {

        char[] chars = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        int a = 0;
        int b = chars.length - 1;

        while (a < b) {
            if (chars[a] != chars[b]) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}
