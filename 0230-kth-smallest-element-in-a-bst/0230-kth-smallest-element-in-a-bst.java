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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> numbers=new ArrayList<>();
        inOrder(root, numbers);

        return numbers.get(k-1);
    }

    public void inOrder(TreeNode root, ArrayList<Integer> numbers){
        if(root==null){
            return;
        }
        inOrder(root.left,numbers);
        numbers.add(root.val);
        inOrder(root.right,numbers);
    }
}