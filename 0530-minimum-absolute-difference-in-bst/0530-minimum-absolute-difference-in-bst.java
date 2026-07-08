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
     int min = Integer.MAX_VALUE;
     TreeNode temp = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return min;
       
        getMinimumDifference(root.left);
         if(temp != null){
            min = Math.min(min ,Math.abs(root.val-temp.val));
            
        }
        temp = root;
        getMinimumDifference(root.right);
        return min;
    }
}