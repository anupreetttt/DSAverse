package Problems;

public class N114_FlattenBTreeToLL {

    public void flatten(N103_BInarytreeZigZagTraversal.TreeNode root) {

        N103_BInarytreeZigZagTraversal.TreeNode currentNode = root; //ignore


        // just look at the diagram, do what questions says and solve!!
        while(currentNode != null) {
            if(currentNode.left != null) {
                N103_BInarytreeZigZagTraversal.TreeNode temp = currentNode.left;

                while(temp.right != null) {
                    temp = temp.right;
                }

                temp.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }
}
