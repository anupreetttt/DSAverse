package Problems;

import DataStructure.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class N118_FlattenTheBinaryTreeTo_LL {

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

    }

    public void flatten(TreeNode root) {

        Queue<TreeNode> queue = fillQueue(root);


        System.out.println(queue.peek());
    }

    public static Queue fillQueue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) {
            return null;
        }

        TreeNode temp = root;

        queue.offer(temp);

        fillQueue(temp.left);
        fillQueue(temp.right);

        return queue;

    }

}
