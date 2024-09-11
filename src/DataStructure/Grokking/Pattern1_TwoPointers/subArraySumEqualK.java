package DataStructure.Grokking.Pattern1_TwoPointers;

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:
//
//Input: nums = [1,1,1], k = 2
//Output: 2

import java.util.HashMap;

public class subArraySumEqualK {

    public static int sumEqualKOptimized(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
             if (map.containsKey(sum - k)) {
                 count = count + map.get(sum - k);
             }
             map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static int sumEqualK(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                sum = sum + nums[j];

                if (sum == k){
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {3,9,8,1,4,6};
        int k = 11;
        System.out.println(sumEqualK(nums, k));
    }

}
