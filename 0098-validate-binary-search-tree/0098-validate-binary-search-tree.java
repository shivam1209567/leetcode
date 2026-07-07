class Solution {
    TreeNode temp = null;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        if(!isValidBST(root.left)) return false;
        
        if(temp != null && temp.val >= root.val) return false;
        temp = root;
        return isValidBST(root.right);
        
    }
}