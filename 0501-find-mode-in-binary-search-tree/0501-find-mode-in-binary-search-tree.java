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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        helper(root, map);
        List<Integer> nums=new ArrayList<>();
        int ans=0;
        for(Map.Entry<Integer,Integer> num: map.entrySet()){
            if (num.getValue()>=ans){
                ans=num.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> num: map.entrySet()){
            if (num.getValue()==ans){
                nums.add(num.getKey());
            }
        }
        int[] res = nums.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    public void helper(TreeNode root, HashMap<Integer,Integer>map){
        if(root==null){
            return;
        }
        map.putIfAbsent(root.val,0);
        map.put(root.val,map.get(root.val)+1);
        helper(root.left,map);
        helper(root.right,map);
    }
}