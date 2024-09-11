package DataStructure.String;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String a = "tea";
        String b = "aet";

        char[] a_sorted = a.toCharArray();
        char[] b_sorted = b.toCharArray();

        Arrays.sort(a_sorted);
        Arrays.sort(b_sorted);

        String newA = new String(a_sorted);
        String newB = new String(b_sorted);

        System.out.println(newA.equals(newB));
    }
}
