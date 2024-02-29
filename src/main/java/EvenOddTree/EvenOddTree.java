package EvenOddTree;

import java.util.LinkedList;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);

        int treeLevel = 0;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            int oldValue = (treeLevel%2 == 0) ? 0 : Integer.MAX_VALUE;
            for (int i=0; i < queueLength; i++) {
                TreeNode newNode = queue.poll();
                int newValue = newNode.val;
                if (treeLevel%2 == 0 && (newValue%2 == 0 || newValue <= oldValue)) {
                    return false;
                }
                if (treeLevel%2 == 1 && (newValue%2 == 1 || (newValue >= oldValue))) {
                    return false;
                }
                if (newNode.left != null) {
                    queue.addLast(newNode.left);
                }
                if (newNode.right != null) {
                    queue.addLast(newNode.right);
                }
                oldValue = newValue;
            }
            treeLevel++;
        }
        return true;
    }
}
