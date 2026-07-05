class Solution {
    int ans(TreeNode root,int targetSum,long sum){
        if(root == null){
            return 0;
        }
        int c = 0;
        sum += root.val;
        
        if(sum == targetSum){
            c++;
        }
        c += ans(root.left,targetSum,sum);
        c += ans(root.right,targetSum,sum);
        return c;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        
        return ans(root,targetSum,0) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
        
    }
}