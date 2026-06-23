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
    public int minDepth(TreeNode root) {
        // if(root==null){
        //     return 0;
        // }
        // Queue<TreeNode> queue= new LinkedList<>();
        // queue.add(root);
        // int depth=0;
        // while(!queue.isEmpty()){
        //     int size=queue.size();
        //     depth+=1;
        //     for(int i=0;i<size;i++){
        //         TreeNode curr= queue.poll();
        //         if(curr.left==null && curr.right==null){
        //             return depth;
        //         }
        //         if(curr.left!=null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right!=null){
        //             queue.add(curr.right);
        //         }
        //     }
        // }
        // return depth;
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if (root.left==null){
            return minDepth(root.right)+1;
        }else if(root.right==null){
            return minDepth(root.left)+1;
        }
        int left= minDepth(root.left);
        int right=minDepth(root.right);
        return Math.min(left,right)+1;
    }
}