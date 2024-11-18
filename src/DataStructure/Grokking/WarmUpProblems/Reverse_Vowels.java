package DataStructure.Grokking.WarmUpProblems;

public class Reverse_Vowels {

    public static String reverseVowel(String s) {

        char[] chars = s.toCharArray();
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

        return a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a =='I' || a == 'o' || a == 'O' || a == 'u' || a == 'U';
    }
    public static void main(String[] args) {

        String s = "IceCreAm";

        System.out.println(reverseVowel(s));
    }
}
