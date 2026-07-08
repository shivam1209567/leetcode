class Solution {
    int c = 1;
    TreeNode ans(TreeNode node, int val){
        if(node == null) return new TreeNode(val);
        TreeNode temp = new TreeNode(val);
        
        if(val < node.val){
            if(node.left == null) node.left = temp;
            else ans(node.left,val);
        }else{
            if(node.right == null) node.right = temp;
            else ans(node.right,val);
        }
        return node;

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
             ans(node,preorder[i]);
        }
        return node;
    }
}