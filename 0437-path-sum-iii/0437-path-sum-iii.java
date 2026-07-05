class Solution {
    HashMap<Long,Integer> map = new HashMap<>();
    int ans(TreeNode root,int targetSum,long sum){
        if(root == null){
            return 0;
        }
        // int c = 0;
        // sum += root.val;
        
        // if(sum == targetSum){
        //     c++;
        // }
        // c += ans(root.left,targetSum,sum);
        // c += ans(root.right,targetSum,sum);
        // return c;
        sum += root.val;
        int count = map.getOrDefault(sum - targetSum,0);
        map.put(sum,map.getOrDefault(sum,0)+1 );
        count += ans(root.left,targetSum,sum);
        count += ans(root.right,targetSum,sum);
        map.put(sum,map.get(sum) - 1);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        
        map.put(0L,1);
        return ans(root,targetSum,0);
        // return ans(root,targetSum,0) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
        
    }
}