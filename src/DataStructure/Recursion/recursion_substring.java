package DataStructure.Recursion;

public class recursion_substring {

    public static void main(String[] args) {
        skip("","bacca");
//        System.out.println(skip3("bacca"));

    }

    static void skip(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip3(String up) {

        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip3(up.substring(1));
        } else {
            return ch + skip3(up.substring(1));
        }
    }

    static String skip2(String p, String up) {

        if (up.isEmpty()) {
//            System.out.println(p);
            return p;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(p, up.substring(1));
        } else {
            return skip2(p + ch, up.substring(1));
        }
    }
}
