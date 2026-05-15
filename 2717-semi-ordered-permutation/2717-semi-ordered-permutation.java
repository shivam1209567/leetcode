class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int one_index = 0;
        int n_index = 0;
        int n = nums.length;
        if(nums[0] == 1 && nums[n-1] == n){
            return 0;
        }
        
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                one_index = i;
            }
            if(nums[i] == n){
                n_index = i;
            }
        }
        int swap = one_index + (n - 1 - n_index);
        if(one_index > n_index){
            swap--;
        }
        return swap;
    }
}