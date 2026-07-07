class Solution {
    TreeNode n(int [] nums,int lo,int hi){
        if(lo > hi) return null;
        int mid = lo+(hi-lo)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = n(nums,lo,mid-1);
        root.right = n(nums,mid+1,hi);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return n(nums,0,nums.length-1);
    }
}