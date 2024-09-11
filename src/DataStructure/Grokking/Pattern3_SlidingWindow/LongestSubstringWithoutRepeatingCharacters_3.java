package DataStructure.Grokking.Pattern3_SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {


    public static int longestSubstring(String s) {

        int max = Integer.MIN_VALUE;

        if(s.isEmpty()) return 0;

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {


                str = str + s.charAt(j);
                System.out.println(str);



            }
        }
        return max;
    }
    public static void main(String[] args) {

        longestSubstring("abcabcbba");
    }
}
