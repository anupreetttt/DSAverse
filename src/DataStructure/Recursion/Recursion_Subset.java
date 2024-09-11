package DataStructure.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion_Subset {

    public static void main(String[] args) {
        int[] arr = {1};
        List<List<Integer>> ans = subset(arr);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = 1;
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
