class Solution {
    void backtrack(List<List<Integer>> res, List<Integer> curr,int[] nums,int start){
        res.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length; i++){
        curr.add(nums[i]);    
        backtrack(res,curr,nums,i+1);
        curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    backtrack(res,curr,nums,0);
    return res;

    }
}