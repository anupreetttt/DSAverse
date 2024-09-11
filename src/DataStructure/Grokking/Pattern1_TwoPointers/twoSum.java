package DataStructure.Grokking.Pattern1_TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class twoSum {

    public static int[] usingMap(int[] num, int target) {
        //      element, index
        int[] result = new int[2];

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (myMap.containsKey(target - num[i])) {
              result[0] = myMap.get(target - num[i]);
              result[1] = i;
            }
            myMap.put(num[i], i);
        }
        return result;
    }
    public static boolean twoSum(int[] num, int target) {

        int size = num.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] + num[j] == target)
                    return true;
            }
        }
        return false;
    }

    public static int[] twoSum1(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        int[] num = new int[2];
        while (i < j) {
            int sum = a[i] + a[j];
            num = new int[]{i, j};
            if (sum == target)
                return num;
            else if (sum > target)
                j--;
            else
                i++;
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 6, 8, 12};
        int target = 10;

        List<Integer> myList = new ArrayList<>();

        System.out.println(Arrays.toString(twoSum1(num, target)));
    }
}
