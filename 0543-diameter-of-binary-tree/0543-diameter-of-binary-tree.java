/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Global variable to keep track of the maximum diameter found so far
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0; // Reset for each independent LeetCode test case
        calculateHeight(root);
        return maxDiameter;
    }

    private int calculateHeight(TreeNode node) {
        // Base Case: An empty node contributes 0 to the height
        if (node == null) {
            return 0;
        }

        // 1. Get the maximum height of the left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // 2. The longest path passing THROUGH this node is leftHeight + rightHeight.
        // Update the global maximum if this path is longer than what we found earlier.
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // 3. Return the overall height of this node to its parent
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
