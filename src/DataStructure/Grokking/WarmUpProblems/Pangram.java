package DataStructure.Grokking.WarmUpProblems;
import java.util.HashSet;

public class Pangram {


    public static boolean pangram(String s) {

        HashSet<Character> mySet = new HashSet<>();
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++){
            if (Character.isLetter(chars[i])) {
                mySet.add(chars[i]);
            }
        }
        return mySet.size() == 26;
    }
    public static void main(String[] args) {

        String s = "TheQuickBrownFoxJumpsOverTheLazyDog";

        System.out.println(pangram(s));
    }
}
