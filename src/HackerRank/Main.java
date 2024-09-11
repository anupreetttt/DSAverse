package HackerRank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int[] arr = {12,2,12,235,123};

//        findMax(arr);
//        reverseString();

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Anu");
        map.put(2, "Sam");
        map.put(3, "Anu Sam");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("asd");
        hashSet.add("asd");
//
//        System.out.println(hashSet);
//
//        System.out.println(map.get(2));
//        System.out.println(map.isEmpty());

        Adder sum = new Adder();
        System.out.println(sum.add(5,3));
    }

    public static void findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void reverseString() {

        String a = "anupreet";
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        for (int i = a.length() - 1; i >= 0; i--) {
            builder.append(a.charAt(i));
        }
        System.out.println(builder);
    }
    public static void twoSum() {
        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

    }
}
