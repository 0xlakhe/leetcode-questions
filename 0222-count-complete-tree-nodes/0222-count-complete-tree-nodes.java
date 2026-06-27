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
    public int countNodes(TreeNode root) { 
        int[] ans= new int[1];
        helper(root,ans);
        return ans[0];
    }
    public void helper(TreeNode root, int[] ans){
        if(root==null){
            return;
        }
        helper(root.left,ans);
        helper(root.right,ans);
        ans[0]+=1;
    }
}