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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            return ans;
        }
        helper(root,targetSum,0);
        return ans;
    }

    public void helper(TreeNode root, int targetSum, int helperSum){
        if (root==null){
            return;
        }
        int currentSum=helperSum+=root.val;
        if(helperSum==targetSum & root.left==null & root.right==null){
            ans=true;
            return;
        }
        helper(root.left,targetSum,currentSum);
        helper(root.right,targetSum,currentSum);
    }
}