package DataStructure.Grokking.Pattern3_SlidingWindow;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {

            currSum += nums[i];

            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;

    }

    public static int maxSubArrayOfSizeK(int[] nums, int k) {

        int maxSum = Integer.MIN_VALUE;
        int currSum;

        for (int i = 0; i <= nums.length - k; i++) {
            currSum = 0;
            for (int j = i; j < i + k; j++) {

                currSum += nums[j];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static int maxSubArrayOfSizeKOptimized(int[] nums, int k) {

        int maxSum = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        int start = 0;
        int end = k;

        while (end < nums.length) {

            sum -= nums[start];
            start++;

            sum += nums[end];
            end++;

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 123};

        System.out.println(maxSubArrayOfSizeKOptimized(nums, 3));
    }
}
