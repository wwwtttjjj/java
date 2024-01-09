public class _12_15 {
    public static void main(String[] args) {

    }
}
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
class Solution1215 {
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left, root.right,true);
        return root;


    }
    public void dfs(TreeNode root1, TreeNode root2, boolean isOdd){
        if (root1 == null){
            return;
        }
        if (isOdd){
            int temp = root2.val;
            root2.val = root1.val;
            root1.val = temp;
        }
        dfs(root1.right, root2.left, !isOdd);
        dfs(root2.right, root1.left, !isOdd);
    }
}
