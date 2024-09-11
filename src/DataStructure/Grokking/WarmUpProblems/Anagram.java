package DataStructure.Grokking.WarmUpProblems;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);


//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != chars1[i]) return false;
//        }

        int i = 0;

        while (i < chars.length) {
            if (chars[i] != chars1[i]) {
                return false;
            }
            i++;
        }

        return true;


    }
    public static void main(String[] args) {

        String s = "rat";
        String t = "tar";

        System.out.println(isAnagram(s,t));
    }
}
