package DataStructure.Grokking.Pattern3_SlidingWindow;

public class MinimumSized_SubArray {

    public static int minSize(int[] nums, int target) {

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum >= target) {
                    minSum = Math.min(minSum, j - i + 1);
                    break;
                }
            }
        }
        return minSum == Integer.MAX_VALUE ? 0 : minSum;
    }

    public static int optimized(int[] nums, int target) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLength;
    }
    public static void main(String[] args) {

        int[] nums = {1,4,4};
        int target = 4;

        System.out.println(optimized(nums, target));
    }
}
