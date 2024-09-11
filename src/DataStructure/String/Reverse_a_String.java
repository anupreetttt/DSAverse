package DataStructure.String;

import java.util.Stack;

public class Reverse_a_String {
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Stack<Character> stacks = new Stack<>();

        for(char c : s) {
            stacks.push(c);
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = stacks.pop();
            System.out.print(s[i]);
        }
    }
}
