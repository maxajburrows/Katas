package BinaryTreeMaximumPathSum;

import java.util.Arrays;

public class BinaryTreeMaximumPathSum {

    public int findMaxPath(TreeNode root) {

        // Traverse left hand side
        int leftTreeMax = 0;
        if (root.left != null) {
            leftTreeMax = findMaxPath(root.left);
        }

        // Traverse Right hand side
        int rightTreeMax = 0;
        if (root.left != null) {
            rightTreeMax = findMaxPath(root.right);
        }

        // Decide whether to add together
        int[] permutations = new int[] {leftTreeMax, rightTreeMax, leftTreeMax+ root.val, rightTreeMax+ root.val, leftTreeMax+ root.val+rightTreeMax};
        return Arrays.stream(permutations).max().orElseThrow();
    }

}
