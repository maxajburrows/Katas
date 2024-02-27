package DiameterOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    @Test
    void test1() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        int expectedResult = 3;
        int actualResult = diameterOfBinaryTree.diameterOfBinaryTree(node1);
        assertEquals(expectedResult, actualResult);
    }

}