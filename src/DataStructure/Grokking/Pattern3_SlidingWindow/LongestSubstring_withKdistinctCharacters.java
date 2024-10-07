package DataStructure.Grokking.Pattern3_SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring_withKdistinctCharacters {

    public static int bruteForce(String s, int k) {

        if (s == null || s.isEmpty() || k ==0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            map.clear();
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                if (map.size() <= k) {

                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public static int optimized(String s, int k) {

        int max = Integer.MIN_VALUE;

        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int end = 0; end < s.length(); end++) {

            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);

            if (map.size() <= k) {
                max = Math.max(max, end - start + 1);
            }

            while (map.size() > k) {
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);

                if (map.get(s.charAt(start)) == 0) {
                    map.remove(s.charAt(start));
                }
                start++;
            }
        }

        return max;
    }
    public static void main(String[] args) {

        String str = "abbccc";
        int k = 2;

//        System.out.println(bruteForce(str, k));
        System.out.println(optimized(str, k));


    }
}
