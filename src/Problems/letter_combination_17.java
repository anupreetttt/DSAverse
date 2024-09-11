package Problems;

import java.util.ArrayList;

public class letter_combination_17 {
    public static void main(String[] args) {

        System.out.println(numPadArrayList("", "12"));
    }

    static void numPad(String p , String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';   // will convert '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            numPad(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> numPadArrayList(String p , String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';   // will convert '2' to 2

        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            list.addAll(numPadArrayList(p+ch, up.substring(1)));
        }
        return list;
    }
 }
