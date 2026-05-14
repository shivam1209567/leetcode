import java.util.*;
class Solution {
    public static void helper(int []nums, boolean [] track, List<Integer> curr, List<List<Integer>> res ){
        if(nums.length == curr.size()){
            res.add(new ArrayList<>(curr));
            return;
        }
       
        if(nums.length == curr.size()){
                res.add(new ArrayList<>(curr));
                return;
            }
        for(int i = 0; i < nums.length; i++){
            
            if(track[i] == true) continue;
            if(i > 0 && nums[i] == nums[i-1] && !track[i-1])continue;
            track[i] = true;
            curr.add(nums[i]);
            helper(nums,track,curr,res);
            curr.remove(curr.size()-1);
            track[i] = false;
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] track = new boolean[nums.length];
        helper(nums,track,curr,result);
        return result;


    }
}