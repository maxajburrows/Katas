package DiameterOfBinaryTree;

public class DiameterOfBinaryTree {
    int currentMax = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeHelper(root);
        return currentMax;
    }
    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftTreePathLength = 0;
        int rightTreePathLength = 0;
        if (root.left != null) {
            leftTreePathLength = diameterOfBinaryTreeHelper(root.left) + 1;
        }
        if (root.right != null) {
            rightTreePathLength = diameterOfBinaryTreeHelper(root.right) + 1;
        }
        currentMax = Math.max(leftTreePathLength + rightTreePathLength, currentMax);
        return Math.max(leftTreePathLength, rightTreePathLength);
    }
}