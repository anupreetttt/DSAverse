package DataStructure.String;

public class SkipACharacter {


    private static void skipACharater(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {

        String s = "bacca";

        skipACharater(s);
    }
}
