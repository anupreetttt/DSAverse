package staticExample;

import java.util.Stack;

public class Reverse_String {

    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};

        reverseString(s);
    }


    public static void reverseString(char[] s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
            System.out.println(s[i]);
        }
        System.out.println("Peek "+ stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]