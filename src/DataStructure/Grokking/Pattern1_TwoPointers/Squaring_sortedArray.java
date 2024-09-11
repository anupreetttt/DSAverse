package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.Arrays;

public class Squaring_sortedArray {

    public static int[] squaringSortedArray(int[] num) {

        int n = num.length;
        int[] newArray = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * num[i];
            newArray[i] = num[i];
        }
        Arrays.sort(newArray);

        return newArray;

    }

    public static int[] withoutSortingAlgo(int[] nums) {

        int[] result = new int[nums.length];
        int left=0;
        int right=nums.length - 1;

        int leftsq, rightsq;

        for(int i = 0; i < nums.length; i++){
            leftsq = nums[left] * nums[left];
            rightsq = nums[right] * nums[right];
            if (leftsq < rightsq ){
                result[i]=leftsq;
                left++;
            }
            else{
                result[i] = rightsq;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] num = {-4,-1,0,3,1};

        System.out.println(Arrays.toString(withoutSortingAlgo(num)));

    }
}
