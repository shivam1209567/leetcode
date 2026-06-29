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
    void ans(List<Integer> list1, TreeNode root,int n){
        if(root == null){
            return;
        }
        
        if(n == 1){
            list1.add(root.val);
            return ;
        }
        ans(list1,root.left,n-1);
        ans(list1,root.right,n-1);
    }
    int height(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        int n = height(root);

        for(int i = 1; i <= n+1; i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            ans(list1,root,i);
            list.add(list1);
        }
        return list;
    }
}