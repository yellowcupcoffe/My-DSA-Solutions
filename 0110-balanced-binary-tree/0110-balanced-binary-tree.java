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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        // Base Case: An empty tree has a height of 0
        if (node == null) {
            return 0;
        }

        // 1. Get the height of the left subtree
        int leftHeight = checkHeight(node.left);
        // If the left subtree is already unbalanced, pass the error up
        if (leftHeight == -1) return -1;

        // 2. Get the height of the right subtree
        int rightHeight = checkHeight(node.right);
        // If the right subtree is already unbalanced, pass the error up
        if (rightHeight == -1) return -1;

        // 3. Check if the current node is unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Return -1 to signal an imbalance to the parent
        }

        // 4. If balanced, return its actual height (just like before!)
        return Math.max(leftHeight, rightHeight) + 1;
    }
}