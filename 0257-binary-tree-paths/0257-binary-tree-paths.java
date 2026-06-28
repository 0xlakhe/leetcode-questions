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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> currentPath = new ArrayList<>();
        helper(root, currentPath, result);
        return result;
    }

    private void helper(TreeNode node, List<Integer> currentPath, List<String> result) {
        if (node == null) {
            return;
        }

        currentPath.add(node.val);

        if (node.left == null && node.right == null) {
            result.add(convertToPathString(currentPath));
        } else {
            if (node.left != null) {
                helper(node.left, currentPath, result);
            }
            if (node.right != null) {
                helper(node.right, currentPath, result);
            }
        }

        currentPath.remove(currentPath.size() - 1);
    }

    private String convertToPathString(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            sb.append(path.get(i));
            if (i < path.size() - 1) {
                sb.append("->");
            }
        }
        return sb.toString();
    }
}