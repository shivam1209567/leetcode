class Solution {
    public void flatten(TreeNode root) {
        if(root == null ||(root.left == null && root.right == null)) return;
        TreeNode Left = root.left;
        TreeNode Right = root.right;
        root.left = null;
        flatten(Left);
        flatten(Right);
        root.right = Left;
        TreeNode temp = Left;
        
            while(temp != null && temp.right != null){
                temp = temp.right;
            }
        
        if(temp != null){
        temp.right = Right;
    }else{
        root.right = Right;
    }
    // TreeNode curr = root;
    // while(curr != null){
    //     if(curr.left != null){
    //         TreeNode prev = curr.left;
    //         while(prev.right != null){
    //             prev = prev.right;
    //         }
    //         prev.right = curr.right;
    //         curr.right = curr.left;
    //         curr.left = null;
    //     }
    //     curr = curr.right;
    // }
    }
}