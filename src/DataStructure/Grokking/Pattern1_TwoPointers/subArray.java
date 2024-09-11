package DataStructure.Grokking.Pattern1_TwoPointers;

public class subArray {

    public static int kadameAlgo(int[] nums) {


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

    public static void printSubArrays(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                count++;
            }
        }
        System.out.println(count);
    }

    public static void sumSubArrays(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                System.out.println(sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max sum: " + maxSum);

    }

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        printSubArrays();
//        sumSubArrays(arr);
        System.out.println(kadameAlgo(arr));
    }
}
