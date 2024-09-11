package DataStructure.Grokking.Pattern3_SlidingWindow;

import java.util.HashMap;

public class PermutationsInString {


    public static boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> checkMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        System.out.println(map);
        int end = 0;
        for (end = 0; end < s2.length(); end++) {

            checkMap.put(s2.charAt(end), checkMap.getOrDefault(s2.charAt(end), 0) + 1);

            if(end - start + 1 == k) {

                if (checkMap.equals(map)) {
                    return true;
                }
                if (checkMap.containsKey(s2.charAt(start))) {
                    int count = checkMap.get(s2.charAt(start));
                    if (count > 1) {
                        checkMap.put(s2.charAt(start), count - 1);
                    } else {
                        checkMap.remove(s2.charAt(start));
                    }
                }
                start++;
            }
        }
        System.out.println(checkMap);
        return false;
    }
    public static void main(String[] args) {

        String s1 = "abcdxabcde", s2 = "abcdeabcdx";

        System.out.println(checkInclusion(s1, s2));
    }
}
