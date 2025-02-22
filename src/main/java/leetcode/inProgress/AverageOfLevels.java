package leetcode.inProgress;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

public class AverageOfLevels {
    List<Double> levelAverages = new ArrayList<>();
    Queue<TreeNode> nodeQueue = new LinkedList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        nodeQueue.add(root);
        int level = 0;
        int levelNodesLeft = 1;
        int total = 0;
        int divisor = 0;
        int missing = 0;
        while (!nodeQueue.isEmpty()) {
            TreeNode nextNode = nodeQueue.poll();
            levelNodesLeft--;
            total += nextNode.val;
            divisor++;
            if (levelNodesLeft == 0 || nodeQueue.isEmpty()) {
                Double levelAverage = ((double) total) / divisor;
                levelAverages.add(levelAverage);
                level++;
                levelNodesLeft = (int) Math.pow(2, level) - missing;
                total = 0;
                divisor = 0;
                missing = 0;
            }
            if (nextNode.left != null) {
                nodeQueue.add(nextNode.left);
            } else {
                missing++;
            }
            if (nextNode.right != null) {
                nodeQueue.add(nextNode.right);
            } else {
                missing++;
            }
        }
        return levelAverages;
    }
}
