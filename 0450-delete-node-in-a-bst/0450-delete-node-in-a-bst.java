class Solution {
    void delete(TreeNode root, int key){
        if(root == null) return;
        if(key < root.val){
           //for leaf node
           if(root.left != null && root.left.val == key){
            TreeNode l = root.left;
                 if(l.left == null && l.right == null){
                    root.left = null; //0leaf node
                 }else if(l.left == null || l.right == null){
                    if(l.left != null) {
                        root.left = l.left; //1 leaf node
                    }else{
                        root.left = l.right;
                    }
                 }else{
                    TreeNode node = l;//2 node
                    TreeNode pred = node.left;
                    while(pred.right != null){
                        pred = pred.right;
                    }
                    delete(root,pred.val);
                    pred.left = node.left;
                    pred.right = node.right;
                    root.left = pred;
                 }
           }else{
             delete(root.left,key);
           }
        }else{
            if(root.right != null && root.right.val == key){
            TreeNode l = root.right;
                 if(l.left == null && l.right == null){
                    root.right = null; //0leaf node
                 }else if(l.left == null || l.right == null){
                    if(l.right != null) {
                        root.right = l.right; //1 leaf node
                    }else{
                        root.right = l.left;
                    }
                 }else{
                    TreeNode node = l;//2 node
                    TreeNode pred = node.right;
                    while(pred.left != null){
                        pred = pred.left;
                    }
                    delete(root,pred.val);
                    pred.right = node.right;
                    pred.left = node.left;
                    root.right = pred;
                 }
           }else{
             delete(root.right,key);
           }
        }
        
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode top = new TreeNode(Integer.MAX_VALUE);
        top.left = root;
        delete(top,key);
        return top.left;
    }
}