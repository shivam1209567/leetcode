class Solution {
    void trim(TreeNode root, int a, int b){
        if(root == null) return;
        TreeNode curr = root;
        while(root.left != null){
           if(root.left.val < a) root.left = root.left.right;
           else if(root.left.val > b) root.left = root.left.left;
           else break;
        }
        while(root.right != null){
            if(root.right.val < a) root.right = root.right.right;
            else if(root.right.val > b) root.right = root.right.left;
            else break;
        }
        trim(root.left,a,b);
        trim(root.right,a,b);
       }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        trim(temp,low,high);
        return temp.left;
    }
}