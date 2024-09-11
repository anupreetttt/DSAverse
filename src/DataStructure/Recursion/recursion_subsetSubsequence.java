package DataStructure.Recursion;

import java.util.ArrayList;

public class recursion_subsetSubsequence {
    public static void main(String[] args) {
//        subseq("", "abc");
        System.out.println(subseqArrayList("", "abc"));
//        subseqArrayList("", "abc");
//        System.out.println(subseqArrayPass("", "abc", new ArrayList<>()));
    }
    static void subseq (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqArrayPass(String p, String up, ArrayList<String> list) {

        if(up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        subseqArrayPass(p + ch, up.substring(1), list);
        subseqArrayPass(p, up.substring(1), list);

        return list;
    }
    static ArrayList<String> subseqArrayList (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
//            System.out.println(list);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqArrayList(p+ ch, up.substring(1));

//        System.out.println("This is left ---->" + left);

        ArrayList<String> right = subseqArrayList(p, up.substring(1));

//        System.out.println("This is right ----->" + right);

        left.addAll(right);

        return left;
    }
}
