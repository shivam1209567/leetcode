class Solution {
    public int singleNumber(int[] nums) {
    if(nums.length == 1){
        return nums[0];
    }     
    for(int i = 0; i < nums.length; i++){
        int c = 1;
        for(int j = 0; j < nums.length; j++){
            int var = nums[i];
            if(i == j){
                continue;
            }
            if(var == nums[j]){
                c++;
               break;
            }else{
                c++;
            }
            if(c == nums.length){
                return var;
            }
        }
    }   
   return -1;
    }
}