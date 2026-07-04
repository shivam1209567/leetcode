class Solution {
    boolean sum(TreeNode root,int n,int targetSum){
        if(root == null) return false;
        n += root.val;
        if(root.left == null && root.right == null){
            return n == targetSum;
        }
        return  sum(root.left,n,targetSum) || sum(root.right,n,targetSum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root,0,targetSum);
    }
}