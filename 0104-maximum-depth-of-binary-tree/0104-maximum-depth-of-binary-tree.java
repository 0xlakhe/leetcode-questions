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
    public int maxDepth(TreeNode root) {
        // if(root==null){
        //     return 0;
        // }
        // Queue<TreeNode> queue=new LinkedList<>();
        // queue.add(root);
        // int count=0;
        
        // while(!queue.isEmpty()){
        //     int size=queue.size();
        //     count+=1;
        //     for(int i=0; i<size;i++){
        //         TreeNode current=queue.poll();
        //         if(current.left!=null){
        //             queue.add(current.left);
        //         }
        //         if(current.right!=null){
        //             queue.add(current.right);
        //         }
        //     }
        // }
        // return count;
        
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        return 1+Math.max(left,right);
    }
}