package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.*;

public class threeSum_closest {

    public static int threeSumCloset(int[] nums, int target) {

        Arrays.sort(nums);

        int closetNum = nums[0] + nums[1] + nums[2];
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }

                int diff = Math.abs(sum - target);
                if (diff < minDistance) {
                    closetNum = sum;
                    minDistance = diff;
                }
            }
        }
        return closetNum;
    }


    //int[] num = {-1,0,1,2,-1,-4};
    public static void main(String[] args) {

        int[] num = {-1,2,1,-4};
        int target = 1;
//        System.out.println(threeSumCloset(num, target));

    }
}
