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
        // return sum(root,0,targetSum);
        if(root == null) return false;
        if(root != null && root.left == null && root.right == null){
            if(root.val == targetSum) return true;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}