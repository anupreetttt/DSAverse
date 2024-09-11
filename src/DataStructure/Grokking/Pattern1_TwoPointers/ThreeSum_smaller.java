package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_smaller {

    public static int threeSum_smaller(int[] nums, int target) {

        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {
//                                        uniqueTriplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 0, 1, 3};
        int target = 2;

        System.out.println(threeSum_smaller(nums, target));
    }
}
