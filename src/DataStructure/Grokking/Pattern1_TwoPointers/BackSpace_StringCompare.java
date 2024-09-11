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

    public static void main(String[] args) {

        String str1 = "ab##";
        String str2 = "c#d#";

        System.out.println(stringCompare(str1, str2));
    }
}
