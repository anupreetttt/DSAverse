package DataStructure.Grokking.Pattern3_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class findAllAnagramInAString {


    public static List<Integer> findAnagrams(String s, String p) {

        int k = p.length();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> checkMap = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }

        int end = 0;
        int start = 0;

        for(end = 0; end < s.length(); end++) {

            checkMap.put(s.charAt(end), checkMap.getOrDefault(s.charAt(end), 0) + 1);

//            System.out.println("End: "+ end + " Start: " + start);
            ;
            if (end - start + 1 == k) {
                if (checkMap.equals(map)) {
                    list.add(start);
                }
//                if (checkMap.containsKey(startChar)) {
                    int count = checkMap.get(s.charAt(start));
                    if (count > 1) {
                        checkMap.put( s.charAt(start++), count - 1);
                    } else {
                        checkMap.remove( s.charAt(start++));
                    }
//                }
//                start++;
            }
        }
        return list;
    }
    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}
