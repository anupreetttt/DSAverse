package DataStructure.Arrays;

public class array_sorted_rotated_1752 {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        boolean a = check(nums);
        System.out.println(a);
    }
    public static boolean check(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
