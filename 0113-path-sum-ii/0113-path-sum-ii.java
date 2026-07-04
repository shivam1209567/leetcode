class Solution {
    void helper(TreeNode root,int targetSum,List<Integer> list,List<List<Integer>> list1){
        if(root == null) return;
        if(root != null && root.left == null && root.right == null){
            if(root.val == targetSum){
               list.add(root.val);
               list1.add(new ArrayList<>(list));
               list.remove(list.size()-1);
               return;
            }
           return;
        }
        list.add(root.val);
        helper(root.left,targetSum-root.val,list,list1);
        helper(root.right,targetSum-root.val,list,list1);
        list.remove(list.size() - 1);
    }
   
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root,targetSum,list,list1);
        return list1;
        
    }
}