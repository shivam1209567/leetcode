
class Solution {
    TreeNode invert(TreeNode root){
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    int check(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return 0;
        if(root1 == null || root2 == null) return -1;
        if(root1.val != root2.val) return -1;
        int left = check(root1.left,root2.left);
        if(left  == -1) return -1;
        int right = check(root1.right, root2.right);
        if(right == -1) return -1;
        return 0;
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.left);
        int x = 1;
        x = check(root.left,root.right);
        if(x == 0) return true;
        return false;
    }
}