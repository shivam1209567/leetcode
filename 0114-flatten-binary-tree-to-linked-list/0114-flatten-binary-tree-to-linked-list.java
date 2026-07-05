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
    public void flatten(TreeNode root) {
        if(root == null ||(root.left == null && root.right == null)) return;
        TreeNode Left = root.left;
        TreeNode Right = root.right;
        root.left = null;
        flatten(Left);
        flatten(Right);
        root.right = Left;
        TreeNode temp = Left;
        
            while(temp != null && temp.right != null){
                temp = temp.right;
            }
        
        if(temp != null){
        temp.right = Right;
    }else{
        root.right = Right;
    }
    }
}