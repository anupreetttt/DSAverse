package Problems;

public class first_last_postion_sortedArray {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
    }

    public static int searchRange(int[] nums, int target) {

        int low = 0;
        int top = nums.length;

        while (top >= low){

            int mid = (top + low)/2;

            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]){
                low = mid + 1;
            }
        }

        return -1;
    }


}
