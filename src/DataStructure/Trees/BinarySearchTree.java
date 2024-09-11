package DataStructure.Trees;

class treeNode {
    int data;
    treeNode left;
    treeNode right;

    treeNode(int data){
        this.data = data;
    }
}
public class BinarySearchTree {
    private static treeNode root;

    public static void main(String[] args) {

        root = insertNode(root, 12);
        root = insertNode(root, 142);
        root = insertNode(root, 14);
        root = insertNode(root, 1);

        System.out.println(root.data);

        BinarySearchTree bst = new BinarySearchTree();
        bst.inOrder(root);
    }

    public static treeNode insertNode(treeNode root, int val) {

        if (root == null) {
            root = new treeNode(val);
            return root;
        }

        if (val < root.data) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }

        return root;
    }
    public void inOrder(treeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}
