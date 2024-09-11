package DataStructure.Grokking.WarmUpProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Contains_duplicate {

    public static boolean containsDuplicate(int[] nums) {

        if (nums.length == 0) return false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateOptimized(int[] nums) {

        if (nums.length == 0) return false;

        HashSet<Integer> myMap = new HashSet<>();

        for (int num : nums) {
            if (myMap.contains(num)) {
                return true;
            }
            myMap.add(num);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,1};
        System.out.println(containsDuplicateOptimized(arr));


    }
}
