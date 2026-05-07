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
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> nodes=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode head=q.poll();
                nodes.add(head.val);
                if(head.left!=null){
                    q.add(head.left);
                }
                if(head.right!=null){
                    q.add(head.right);
                }
            }
            ans.add(nodes);
        }
        return ans;
    }
}