package DataStructure.Grokking.WarmUpProblems;

import java.util.HashMap;
import java.util.HashSet;

public class Number_of_goodPairs {

    public static int goodPairs(int[] nums) {

        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    public static int goodPairsOptimized(int[] nums) {

        int a = 0;
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.contains(nums[i])) {
                a++;
            }
            map.add(nums[i]);
        }

        return a;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,1,1};

        System.out.println(goodPairsOptimized(nums));
    }
}
