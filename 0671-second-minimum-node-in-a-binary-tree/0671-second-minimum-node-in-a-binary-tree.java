class Solution {
    long ans = Long.MAX_VALUE;
    int min;
    void help(TreeNode root){
        if(root == null) return;

        if(root.val > min) ans = Math.min(ans,root.val);
        help(root.left);
        help(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        help(root);
        return ans == Long.MAX_VALUE ? -1 :  (int)ans; 
    }
}