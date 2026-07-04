
class Solution {
    TreeNode helper(int []preorder, int prelo,int prehi,int [] inorder, int inlo, int inhi,HashMap<Integer,Integer> map){
        if(prelo > prehi){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[prelo]);
        int i = map.get(preorder[prelo]);
        int leftSize = i - inlo;
        root.left = helper(preorder,prelo+1,prelo+leftSize,inorder,inlo,i-1,map); 
        root.right = helper(preorder,prelo+leftSize+1,prehi,inorder,i+1,inhi,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i < n; i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,n-1,inorder,0,n-1,map);
    }
}