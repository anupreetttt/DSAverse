package DataStructure.Stacks;

import java.util.Stack;

public class CustomStacks {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;
    CustomStacks() {
        this(DEFAULT_SIZE);
    }
    CustomStacks(int size) {
        this.data = new int[size];
    }
    
    public void push(int val) {

        if(ptr == data.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
         ptr++;
         data[ptr] = val;

        System.out.println("Value: " + val + " is added into stack");
    }

    public int pop() {

        if (ptr == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int remove = data[ptr];
        ptr--;

        return remove;
    }

    public int peek() {

        return data[ptr];
    }
}
