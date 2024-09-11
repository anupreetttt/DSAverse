package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);

        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    uniqueTriplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }


    //int[] num = {-1,0,1,2,-1,-4};
    public static void main(String[] args) {

        int[] num = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(num));
    }
}
