class Solution {
    public int missingNumber(int[] nums) {
      Arrays.sort(nums);
      return res(nums,0);  
    }
    public static int res(int [] nums, int c){
        if(c == nums.length){
            return nums.length;
        }
        
        if(nums[c] != c){
        
        
        return c;
        }
        return res(nums,c+1);
    }
        
    
}