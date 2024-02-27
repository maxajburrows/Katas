package DiameterOfBinaryTree;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftTreePathLength = 0;
        int rightTreePathLength = 0;
        if (root.left != null) {
            leftTreePathLength = diameterOfBinaryTree(root.left) + 1;
        }
        if (root.right != null) {
            rightTreePathLength = diameterOfBinaryTree(root.right) + 1;
        }
        return leftTreePathLength+rightTreePathLength;
    }
}