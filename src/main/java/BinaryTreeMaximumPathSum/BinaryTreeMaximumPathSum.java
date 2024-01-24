package BinaryTreeMaximumPathSum;

import java.util.Arrays;

public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        return Arrays.stream(maxPathSumHelper(root)).max().orElseThrow();
    }

    // Return unbroken paths at 0 index and broken paths at 1 index
    private int[] maxPathSumHelper(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new int[]{root.val, root.val};
        }
        if (root.left != null && root.right != null) {
            int[] leftTreeMax = maxPathSumHelper(root.left);
            int[] rightTreeMax = maxPathSumHelper(root.right);
            int[] maxUnbrokenPathPermutations = new int[] {leftTreeMax[0] + root.val, rightTreeMax[0] + root.val, root.val};
            int[] maxBrokenPathPermutations = new int[] {leftTreeMax[0], rightTreeMax[0], leftTreeMax[0] + root.val, rightTreeMax[0] + root.val, leftTreeMax[0] + root.val + rightTreeMax[0], root.val, leftTreeMax[1], rightTreeMax[1]};
            return new int[] {Arrays.stream(maxUnbrokenPathPermutations).max().orElseThrow(), Arrays.stream(maxBrokenPathPermutations).max().orElseThrow()};
        }
        if (root.left != null) {
            int[] leftTreeMax = maxPathSumHelper(root.left);
            int[] maxUnbrokenPathPermutations = new int[] {leftTreeMax[0] + root.val, root.val};
            int[] maxBrokenPathPermutations = new int[] {leftTreeMax[0], leftTreeMax[0] + root.val, root.val, leftTreeMax[1]};
            return new int[] {Arrays.stream(maxUnbrokenPathPermutations).max().orElseThrow(), Arrays.stream(maxBrokenPathPermutations).max().orElseThrow()};
        }
        int[] rightTreeMax = maxPathSumHelper(root.right);
        int[] maxUnbrokenPathPermutations = new int[] {rightTreeMax[0] + root.val, root.val};
        int[] maxBrokenPathPermutations = new int[] {rightTreeMax[0], rightTreeMax[0] + root.val, root.val, rightTreeMax[1]};
        return new int[] {Arrays.stream(maxUnbrokenPathPermutations).max().orElseThrow(), Arrays.stream(maxBrokenPathPermutations).max().orElseThrow()};
    }

}

