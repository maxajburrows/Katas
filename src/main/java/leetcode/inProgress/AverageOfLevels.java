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
        while (!nodeQueue.isEmpty()) {
            TreeNode nextNode = nodeQueue.poll();
            levelNodesLeft--;
            if (nextNode == null) {
                continue;
            }
            total += nextNode.val;
            divisor++;
            if (levelNodesLeft == 0) {
                Double levelAverage = ((double) total) / divisor;
                levelAverages.add(levelAverage);
                level++;
                levelNodesLeft = (int) Math.pow(level, 2);
            }
            nodeQueue.add(nextNode.left);
            nodeQueue.add(nextNode.right);
        }
        return levelAverages;
    }
}
