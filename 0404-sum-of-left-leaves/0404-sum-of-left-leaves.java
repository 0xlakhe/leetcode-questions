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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] ans= new int[1];
        helper(root,ans,false);
        return ans[0];
    }

    public void helper(TreeNode root,int[] ans, boolean isLeft){
        if(root==null){
            return; 
        }
        if(root.left==null && root.right==null && isLeft){
            ans[0]+=root.val;
        }
        helper(root.left,ans,true);
        helper(root.right,ans,false);
    }
}