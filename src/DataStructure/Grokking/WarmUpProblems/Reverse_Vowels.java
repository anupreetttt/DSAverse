package DataStructure.Grokking.WarmUpProblems;

public class Reverse_Vowels {

    public static String reverseVowel(String s) {

        char[] chars = s.toLowerCase().toCharArray();
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
             if (isVowel(chars[p1]) && isVowel(chars[p2])){
                char temp = chars[p1];
                chars[p1] = chars[p2];
                chars[p2] = temp;
                p1++;
                p2--;
                System.out.println("444");
            } else if (isVowel(chars[p1])) {
                p2--;
                System.out.println("222");
            } else {
                 p1++;
             }
        }
        return new String(chars);
    }

    public static boolean isVowel(char a) {

        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }
    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverseVowel(s));
    }
}
