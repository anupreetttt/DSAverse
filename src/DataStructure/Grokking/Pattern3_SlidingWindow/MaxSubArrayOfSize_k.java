package DataStructure.Grokking.Pattern3_SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaxSubArrayOfSize_k {

    public static int bruteForce(int[] arr, int k) {

        if(arr.length == 0 || k <= 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    public static int solution(int[] arr, int k) {

        if (arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        int max = 0;

        int start = 0;

        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            max = sum;
            if(end - start + 1 == k) {
                sum -= arr[start++];

                max = Math.max(max ,sum);
            }
        }

        return max;
    }

    public static int slidingWindow(int[] arr, int k) {

        if(arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        int start = 0;
        int end = 0;
//        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(end = 0; end < k; end++) {
            sum += arr[end];
        }

        int max = sum;

        for(end = k; end < arr.length; end++) {

            sum += arr[end];
            sum -= arr[start++];

            max = Math.max(max, sum);
        }
        return max;
    }

    public static int sW2(int[] arr, int k) {

        if(arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        int start = 0;
        int end;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(end = 0; end < arr.length; end++) {
            sum += arr[end];
            max = sum;
            if(end - start + 1 == k) {
                sum -= arr[start++];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    //Leetcode : https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
    public static int maxSumSubarrayOfSizeKWithDistinctElement(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0; // Return 0 for invalid input
        }

        int maxSum = 0;
        int windowSum = 0;
        int start = 0;
        Set<Integer> windowElements = new HashSet<>();

        for (int end = 0; end < nums.length; end++) {
            // If element is already in the set, move the start pointer to the right
            while (windowElements.contains(nums[end])) {
                windowSum -= nums[start];
                windowElements.remove(nums[start]);
                start++;
            }

            // Add the current element to the window
            windowElements.add(nums[end]);
            windowSum += nums[end];

            // Check if the window size is exactly k
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);

                // Prepare to slide the window by removing the start element
                windowSum -= nums[start];
                windowElements.remove(nums[start]);
                start++;
            }
        }

        return maxSum;
    }

    public static int solTry(int[] arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;

        for(int i = 0; i < arr.length - k; i++) {

            sum -= arr[i];
            sum += arr[i + k];

            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7};
        System.out.println(bruteForce(arr, 3));
    }
}
