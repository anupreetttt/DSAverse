package DataStructure.Grokking.Pattern3_SlidingWindow;

public class MaximumAverageOfSubarrayI {

    public static double brutForce(int[] nums, int k) {

        double max = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i <= nums.length - k; i++) {
            sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            double average = sum/k;

            max = Math.max(max, average);
        }
        return max;
    }



    public static void average(int[] arr, int k) {

        double sum = 0.0;
        int windowStart = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (i >= k - 1) {
                double average = sum / k;
                System.out.println(average);
                sum -= arr[windowStart];
                windowStart++;
            }
        }
    }

    public static double maxAverage(int[] nums, int k) {


        int start = 0;
        int end = 0;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        for (end = 0; end < nums.length; end++) {

            sum += nums[end];
            double average = sum/k;
//            maxAvg = average;
            if(end - start + 1 == k) {
                sum -= nums[start++];
                maxAvg = Math.max(maxAvg, average);
                System.out.println("Max: " + maxAvg);
            }
        }
        return maxAvg;
    }
    public static double maxAverageTwoLoops(int[] nums, int k) {


        int start = 0;
        int end = 0;

        double sum = 0;
        double maxAvg = 0;

        for (end = 0; end < k; end++) {
            sum += nums[end];
        }

        double average = sum/k;
        maxAvg = average;

       for (end = k; end < nums.length; end++){

            sum += nums[end];
            sum -= nums[start++];

            average = sum/k;
            maxAvg = Math.max(maxAvg, average);
        }
        return maxAvg;
    }
    public static int maxSum(int[] arr, int k) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void maxSumOptimal(int[] arr, int k) {

        int max = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (i >= k - 1) {
                if (sum > max) {
                    max = sum;
                }
                sum -= arr[i];

            }
        }
    }

    // https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int start = 0;
        int end = 0;

        double sum = 0;
        int count = 0;
        for (end = 0; end < k; end++) {
            sum += arr[end];
        }

        double average = sum/k;

        if( average >= threshold) {
            count++;
        }
        for (end = k; end < arr.length; end++){

            sum += arr[end];
            sum -= arr[start++];

            average = sum/k;
            if( average >= threshold) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(maxAverage(nums, k));
    }
}
