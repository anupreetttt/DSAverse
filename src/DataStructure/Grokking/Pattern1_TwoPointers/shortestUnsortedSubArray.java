package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.Arrays;

public class shortestUnsortedSubArray {

    public static int shortestUnsortedSubArray(int[] nums) {

        int start = 0, end = nums.length - 1;

        int[] arr = new int[nums.length];

        System.arraycopy(nums, 0 , arr, 0, nums.length);

        Arrays.sort(arr);
        while (start <= end) {

            if (nums[start] != arr[start]) {
                break;
            } else {
                start++;
            }
            if (nums[end] != arr[end]) {
                break;
            } else {
                end--;
            }
        }
        return end - start + 1;
    }

    public static void main(String[] args) {

        int[] nums = {2,6,4,8,10,9,15};

        System.out.println(shortestUnsortedSubArray(nums));
    }
}
