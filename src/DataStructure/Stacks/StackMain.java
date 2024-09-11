package DataStructure.Stacks;

public class StackMain {

    public static void main(String[] args) {

        CustomStacks stacks = new CustomStacks();

        stacks.push(12);
        stacks.push(14);
        stacks.push(15);
        stacks.push(13);
        stacks.push(17);

        System.out.println(stacks.peek());

        stacks.pop();
        System.out.println(stacks.peek());
    }
}
