package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.Stack;

public class BackSpace_StringCompare {

    public static Boolean stringCompare(String s, String t) {

        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (result2.length() > 0) {
                    result2.deleteCharAt(result2.length() - 1);
                }
            } else {
                result2.append(c);
            }
        }
        return result.toString().equals(result2.toString());
    }

    public static boolean stringCompareTwoPointers(String s, String t) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        int end = s.length() - 1;

        while(end >= 0) {

            if (s.charAt(end) == '#') {
                if (str1.length() > 0) {
                    str1.deleteCharAt(str1.length() - 1);
                }
            } else {
                str1.insert(0,s.charAt(end));
            }
            end--;
        }
//        System.out.println(str1.toString());

        int end2 = t.length() - 1;
        while(end2 >= 0) {

            if (s.charAt(end2) == '#') {
                if (str1.length() > 0) {
                    str1.deleteCharAt(str1.length() - 1);
                }
            } else {
                str1.insert(0,s.charAt(end2));
            }
            end2--;
        }
        return str1.equals(str2);
    }
    public static void main(String[] args) {

        String str1 = "ab##";
        String str2 = "c#d#";

        System.out.println(stringCompare(str1, str2));
        System.out.println(stringCompareTwoPointers(str1, str2));
    }
}
