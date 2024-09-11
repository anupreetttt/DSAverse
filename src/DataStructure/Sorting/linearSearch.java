package DataStructure.Sorting;

import java.util.Arrays;

public  class linearSearch {
    

    public static void main(String[] args) {


        int[] arr = {12,345,2,6,7896};
        int target = 623;


        String name = "Anupreet";
        char a = 'z';
//
//        System.out.println(findLargestNum(arr, target));
//        System.out.println(findMaxElement(arr));
//
//        System.out.println(findInString(name, a));

        int[][] two_d = {
                {12,234,567,1234},
                {5,623,5,3,1,5},
                {19,4,1},
                {17,6,7}
        };

//        System.out.println(Arrays.toString(printAll2d(two_d, target)));


    }

    public static int findLargestNum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findMaxElement(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean findInString(String name, char a) {
        if(name.isEmpty()) return false;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == a) {
                return true;
            }
        }
        return false;
    }

    public  static int[] printAll2d(int [][] two_d, int target) {

        for (int i = 0; i < two_d.length; i++) {
            for (int j = 0; j < two_d[i].length; j++) {
                if (two_d[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
    public static int evenNumberOfDigits(int[] arr) {
        if(arr.length == 0) return 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public int findNumbers(int[] nums) {

        int count = 0;
        for(int i = 0; i< nums.length; i++) {
            if(even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean even(int num) {
        int numOfDigits = digits(num);
        if(numOfDigits % 2 ==0 ) {
            return true;
        }
        return false;
    }

    public int digits(int num) {

        int count = 0;
        while(num > 0) {
            num = num/10;
            count++;
        }
        return count;
    }
    static void fun() {
        System.out.println("askhkasjgd");
    }

    void greeting() {
//        System.out.println("Hello");
        fun();
    }
}

