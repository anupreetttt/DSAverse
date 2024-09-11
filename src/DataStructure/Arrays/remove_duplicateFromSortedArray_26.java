package DataStructure.Arrays;

public class remove_duplicateFromSortedArray_26 {

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int index = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        for (int i = 0 ; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        return index;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,4};

        System.out.println(removeDuplicates(nums));
    }
}
