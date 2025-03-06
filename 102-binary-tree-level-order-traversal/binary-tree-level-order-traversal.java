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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // BFS - Queue
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) {
            return levels;
        }

        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()) {
            levels.add(new ArrayList<Integer>());
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode node = queue.removeFirst();
                levels.get(level).add(node.val);
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
            }
            level++;
        }
        return levels;
    }
}