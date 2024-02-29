package EvenOddTree;

import java.util.LinkedList;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);

        int treeLevel = 0;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i=0; i < queueLength; i++) {
                TreeNode newNode = queue.poll();
                if (treeLevel%2 == 0 && newNode.val%2 == 0) {
                    return false;
                }
                if (treeLevel%2 == 1 && newNode.val%2 == 1) {
                    return false;
                }
                if (newNode.left != null) {
                    queue.addLast(newNode.left);
                }
                if (newNode.right != null) {
                    queue.addLast(newNode.right);
                }
                treeLevel++;
            }
        }
        return true;
    }
}
