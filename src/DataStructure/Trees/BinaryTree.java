package DataStructure.Trees;

import Problems.N118_FlattenTheBinaryTreeTo_LL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTree {
    private static Node root;
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val) {
            data = val;
        }
    }

    public void createTree() {
        // Creating nodes based on the given root array
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node1 = new Node(1);
        Node node6 = new Node(6);
        Node node2 = new Node(2);
        Node node0 = new Node(0);
        Node node8 = new Node(8);
        Node node7 = new Node(7);
        Node node4 = new Node(4);

        // Constructing the tree according to the given structure
        root = node3;
        node3.left = node5;
        node3.right = node1;

        node5.left = node6;
        node5.right = node2;

        node1.left = node0;
        node1.right = node8;

        node2.left = node7;
        node2.right = node4;

        System.out.println(lowestCommonAncestor(root, node5, node8).data);
    }

    public static void preOrder(Node root) {
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void levelTraversal(Node root) {

        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.println(tempNode.data);

            if (tempNode.left != null){
                queue.offer(tempNode.left);
            }

            if (tempNode.right != null){
                queue.offer(tempNode.right);
            }
        }
    }

    public static int maxValInBinaryTree(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int result = root.data;
        int left = maxValInBinaryTree(root.left);
        int right = maxValInBinaryTree(root.right);

        if (left > result) result = left;

        if (right > result) result = right;

        return result;
    }
    public static int levelOrderSuccessor(Node root, int target) {

        if(root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if(currentNode.data == target) {
                break;
            }
        }
        return queue.peek().data;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createTree();
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);
//        levelTraversal(root);
//        System.out.println("Max val is: ");
//        System.out.println(maxValInBinaryTree(root));

//        flatten(root);


    }


    public static void flatten(Node root) {

        Queue<Node> queue = new LinkedList<>();
        fillQueue(root, queue);


        System.out.println("Queue peek: " + queue.peek().data);

        List<Node> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).data);
        }
    }

    public static Queue fillQueue(Node root, Queue<Node> queue) {

        if(root == null) {
            return null;
        }

        Node temp = root;

        queue.offer(temp);
        fillQueue(temp.left, queue);
        fillQueue(temp.right, queue);

        return queue;
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;

    }

}


