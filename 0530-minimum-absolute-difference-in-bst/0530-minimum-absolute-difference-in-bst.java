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
    int minDiff= Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root); 
        return minDiff;
    }
    public void helper(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            TreeNode maxLeft=root.left;
            while(maxLeft.right!=null){
                maxLeft=maxLeft.right;
            }
            int diffLeft= Math.abs(root.val-maxLeft.val);
            if(diffLeft<minDiff){
                minDiff=diffLeft;
            }
        }
        if(root.right!=null){
            TreeNode minRight=root.right;
            while(minRight.left!=null){
                minRight=minRight.left;
            }
            int diffRight=Math.abs(root.val-minRight.val);
            if(diffRight<minDiff){
                minDiff=diffRight;
            }
        }
        helper(root.left);
        helper(root.right);
    }

}