class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if(root == null) return null;
        // if(root == p || root == q) return root;

        // TreeNode left = lowestCommonAncestor(root.left,p,q);
        // TreeNode right = lowestCommonAncestor(root.right,p,q);

        // if(left != null && right != null) return root;
        // // if(left != null) return left;
        // // else return right;
        // return left != null ? left : right;
        
        
        if(root.val == p.val || root.val == q.val) return root;
        else if(p.val < root.val && q.val > root.val ) return root;
        else if(root.val < p.val && root.val > q.val) return root;
        else if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else  return lowestCommonAncestor(root.right,p,q);
       

    }
}