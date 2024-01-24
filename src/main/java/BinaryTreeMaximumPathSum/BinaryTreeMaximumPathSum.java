package BinaryTreeMaximumPathSum;

import java.util.Arrays;

public class BinaryTreeMaximumPathSum {


    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }

        int leftTreeMax = 0;
        int rightTreeMax = 0;
        if (root.left != null) {
            leftTreeMax = maxPathSum(root.left);
        }
        if (root.right != null) {
            rightTreeMax = maxPathSum(root.right);
        }

        int[] permutations = new int[] {leftTreeMax, rightTreeMax, leftTreeMax+ root.val, rightTreeMax+ root.val, leftTreeMax+ root.val+rightTreeMax};
        return Arrays.stream(permutations).max().orElseThrow();
    }
}
