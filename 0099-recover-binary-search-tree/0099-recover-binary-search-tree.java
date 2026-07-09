class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    void ans(TreeNode root){
        if(root == null) return;
        ans(root.left);
        if(prev != null && prev.val > root.val){
            if(first == null) first = prev;

            second = root;
        }
        prev = root;
        ans(root.right);
    }
    public void recoverTree(TreeNode root) {
        ans(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
// morris traversal
// class Solution {
//     void ans(TreeNode root){
//         if(root == null) return;
//         ArrayList<TreeNode> a = new ArrayList<>();
//         TreeNode curr = root;
//         TreeNode p = null;
//         TreeNode pp = null;
//         while(curr != null){
//             if(curr.left != null){
//                 TreeNode pred = curr.left;
//                 while(pred.right != null && pred.right != curr){
//                     pred = pred.right;
//                 }
//                 if(pred.right == null){
//                     pred.right = curr;
//                     curr = curr.left;
//                 }
//                 else if(pred.right == curr){
//                     pred.right = null;
//                     if(p != null && pp != null){
//                         if(p.val > pp.val && p.val > curr.val) a.add(p);
//                         if(p.val < pp.val && p.val < curr.val) a.add(p);
//                     }
//                     else if(p != null && p.val > curr.val) a.add(p);
//                     pp = p;
//                     p = curr;
//                     curr = curr.right;
//                 }
//             }else{
//                  if(p != null && pp != null){
//                         if(p.val > pp.val && p.val > curr.val) a.add(p);
//                         if(p.val < pp.val && p.val < curr.val) a.add(p);
//                     }
//                     else if(p != null && p.val > curr.val) a.add(p);
//                     pp = p;
//                     p = curr;
//                     curr = curr.right;
//             }
//         }
//         if(p != null && p.val < pp.val) a.add(p); 
//         TreeNode q = a.get(0);
//         TreeNode z = a.get(a.size() -1);
//         int temp = q.val;
//         q.val = z.val;
//         z.val = temp;
        
//     }
//     public void recoverTree(TreeNode root) {
//         ans(root);
        
        
//     }
// }