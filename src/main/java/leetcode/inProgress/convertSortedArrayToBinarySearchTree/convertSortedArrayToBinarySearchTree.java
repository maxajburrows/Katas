package leetcode.inProgress.convertSortedArrayToBinarySearchTree;

public class convertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int position = nums.length/2;
        TreeNode head = new TreeNode(nums[position]);
        head.left = buildTree(nums, position - 1);
        head.right = buildTree(nums, position + 1);
        return head;
    }

    private TreeNode buildTree(int[] nums, int position) {
        return null;
    }
}
