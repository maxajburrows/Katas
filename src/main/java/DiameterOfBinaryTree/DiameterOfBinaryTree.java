package DiameterOfBinaryTree;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftTreePathLength = diameterOfBinaryTree(root.left);
        int rightTreePathLength = diameterOfBinaryTree(root.right);
        return leftTreePathLength+rightTreePathLength+1;
    }
}
