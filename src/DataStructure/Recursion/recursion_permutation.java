package DataStructure.Recursion;

public class recursion_permutation {

    public static void main(String[] args) {

        ASCII();
    }

    static void ASCII() {

        String s = "a";

        char q = s.charAt(0);
        System.out.println(q + 1);
    }
    static void permutation (String p, String up) {

        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
             String f = p.substring(0, i );
             String s = p.substring(i, p.length());
             permutation(f + ch + s, up.substring(1));
        }
    }
}
