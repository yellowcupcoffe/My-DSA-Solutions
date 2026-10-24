class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        // Start processing at the root (which is Level 0)
        fillTreeLevels(root, 0, result);
        return result;
    }

    private void fillTreeLevels(TreeNode node, int level, List<List<Integer>> result) {
        // Base case: If the node doesn't exist, stop
        if (node == null) {
            return;
        }

        // Trick: If we are entering a brand new level, create a new row in our grid
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }

        // Add the current node's value to its specific row index
        result.get(level).add(node.val);

        // Go to the next level down (level + 1)
        fillTreeLevels(node.left, level + 1, result);
        fillTreeLevels(node.right, level + 1, result);
    }
}
