package DataStructure.Grokking.Pattern1_TwoPointers;

public class SubArray_productLessThanTarget {


    public static int subArray(int[] nums, int k) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; i++) {
                sum += nums[j];
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1};
        int k = 2;

        System.out.println(subArray(nums, k));
    }
}
