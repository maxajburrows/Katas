package BinaryTreeMaximumPathSum;

import java.util.Arrays;

public class BinaryTreeMaximumPathSum {
    // Keep running count of max value, so it doesn't have to be passed down through methods
    private int currentMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return currentMax;
    }

    // Return unbroken paths at 0 index and broken paths at 1 index
    private int maxPathSumHelper(TreeNode root) {
        if (root.left == null && root.right == null) {
            currentMax = Math.max(currentMax, root.val);
            return root.val;
        }
        if (root.left != null && root.right != null) {
            // Recursively call left and right branches but eliminate negative branches
            int leftTreeMax = Math.max(maxPathSumHelper(root.left), 0);
            int rightTreeMax = Math.max(maxPathSumHelper(root.right), 0);
            // Update maximum tree path value
            currentMax = Math.max(currentMax, leftTreeMax + root.val + rightTreeMax);
            // Return unbroken tree path value which can be added to
            return Math.max(leftTreeMax + root.val, rightTreeMax + root.val);
        }
        if (root.left != null) {
            int leftTreeMax = Math.max(maxPathSumHelper(root.left), 0);
            currentMax = Math.max(currentMax, leftTreeMax + root.val);
            return leftTreeMax + root.val;
        }
        int rightTreeMax = Math.max(maxPathSumHelper(root.right), 0);
        currentMax = Math.max(currentMax, rightTreeMax + root.val);
        return rightTreeMax + root.val;
    }

}

