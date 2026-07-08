class Solution {
    int temp = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        convertBST(root.right);
        temp = temp + root.val;
        root.val = temp;
        convertBST(root.left);
        return root;
    }
}