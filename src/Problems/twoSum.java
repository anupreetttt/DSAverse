package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    public static int[] getSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target)
                    return  new int[] {i, j};
            }
        }
        return new int[]{};
    }

    public static int maxSubArray(int[] nums) {
        int max = 0;
        int left = 0;
        int right = 0;
        for(int i =0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum>max){
                    max = sum;
                    left = i;
                    right = j;
                }
            }
        }
        System.out.println(left + " " + right);
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {-1,3,2,-6,-7,-1,2};
        System.out.println(maxSubArray(nums));
    }
}
