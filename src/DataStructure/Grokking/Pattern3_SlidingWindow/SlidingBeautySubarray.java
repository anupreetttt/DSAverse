package DataStructure.Grokking.Pattern3_SlidingWindow;

import java.util.Arrays;

public class SlidingBeautySubarray {

    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
//
//        if (nums.length == 0 || k > nums.length || x > nums.length) {
//            return new int[0];
//        }
        
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            int[] newNums = new int[k];

            for (int j = 0; j < k; j++) {
                newNums[j] = nums[i + j];
            }
            Arrays.sort(newNums);
//            System.out.println(Arrays.toString(newNums));
//            System.out.println(newNums[x - 1]);
//            break;

            if (newNums[x - 1] < 0){
                ans[i] = newNums[x - 1];
            } else{
                ans[i] = 0;
            }

        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {


        int[] nums = {1,-1,-3,-2,3};

        getSubarrayBeauty(nums, 3, 2);

    }
}
