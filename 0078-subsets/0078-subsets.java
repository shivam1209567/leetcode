class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        countsubset(nums,0,subset,result);
        return result;

    }
    public static void countsubset(int[] nums, int i,ArrayList<Integer> subset, List<List<Integer>> result){
        if(i == nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        countsubset(nums,i+1,subset,result);

        subset.remove(subset.size() - 1);
        countsubset(nums,i+1,subset,result);
    }
}