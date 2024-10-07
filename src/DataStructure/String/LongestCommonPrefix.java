package DataStructure.String;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void longestCommonPrefix(String[] strs) {

//        if (strs.length == 0) {
//            return "";
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < strs.length; i++) {
//
//
//            for (int j = 0; j < strs[i].length(); j++) {
//
//                stringBuilder.append(strs[i].charAt(j));
//
//            }
//        }

        //String prefix = "fl";

        //System.out.println(strs[2].indexOf(prefix));


//        return "";
    }
    public static void main(String[] args) {

        String[] strs = {"flower","flowe","flight"};

        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));
//        longestCommonPrefix(strs);
    }
}
