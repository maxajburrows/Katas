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
        System.out.println("Made it here 1");
        if (root.left != null) {
            leftTreePathLength = diameterOfBinaryTreeHelper(root.left) + 1;
        }
        if (root.right != null) {
            int rightFuncReturn = diameterOfBinaryTree(root.right);
            System.out.println("rightFuncReturn" + rightFuncReturn);
            rightTreePathLength = diameterOfBinaryTreeHelper(root.right) + 1;
            System.out.println("In here" + rightTreePathLength);
        }
        System.out.println("Left length" + leftTreePathLength);
        System.out.println("Right length" + leftTreePathLength);
        System.out.println("Node value" + root.val);
        currentMax = Math.max(leftTreePathLength + rightTreePathLength, currentMax);
        System.out.println("Current Max" + currentMax);
        System.out.println(Math.max(leftTreePathLength, rightTreePathLength));
        int returnValue = Math.max(leftTreePathLength, rightTreePathLength);
        System.out.println(returnValue);
        return returnValue;
    }

}