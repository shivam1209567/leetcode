class Solution {
    int c = 0;
    int ans = 0;
    void h(TreeNode root,int k){
        if(root == null) return ;
        h(root.left,k);
        c++;
        if(c == k)ans = root.val;
        h(root.right,k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        h(root,k);
        return ans;
    }
}