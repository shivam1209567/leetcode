class Solution {
    void help(TreeNode root,List<Integer> list,int n){
        if(root == null) return ;
        
        if(n == 1){
            list.add(root.val);
            return;
        }
        help(root.left,list,n-1);
        help(root.right,list,n-1);
    }
    int height(TreeNode root){
        if (root == null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        int n = height(root);
        for(int i = 1; i <= n; i++ ){
            List<Integer> list = new ArrayList<>();
            help(root,list,i);
            if(i % 2 == 0){
                Collections.reverse(list);
            }
            list1.add(list);
        }
        return list1;
    }
}