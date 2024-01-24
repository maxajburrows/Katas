package BinaryTreeMaximumPathSum;

import java.util.Arrays;

public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (root.left != null && root.right != null) {
            int leftTreeMax = maxPathSum(root.left);
            int rightTreeMax = maxPathSum(root.right);
            int[] permutations = new int[] {leftTreeMax, rightTreeMax, leftTreeMax + root.val, rightTreeMax + root.val, leftTreeMax+ root.val + rightTreeMax, root.val};
            return Arrays.stream(permutations).max().orElseThrow();
        }
        if (root.left != null) {
            int leftTreeMax = maxPathSum(root.left);
            int[] permutations = new int[] {leftTreeMax, leftTreeMax + root.val, root.val};
            return Arrays.stream(permutations).max().orElseThrow();
        }
        int rightTreeMax = maxPathSum(root.right);
        int[] permutations = new int[] {rightTreeMax, rightTreeMax + root.val, root.val};
        return Arrays.stream(permutations).max().orElseThrow();
    }
}
