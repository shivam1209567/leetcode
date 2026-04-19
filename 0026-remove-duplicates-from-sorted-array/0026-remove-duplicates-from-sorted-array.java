class Solution {
    public int removeDuplicates(int[] nums) {
     return res(0,0,nums);   
    }
    
    public static int res(int i, int j,int nums[]){
        if(i == nums.length){
            return j;
        }
        if(i == 0 || nums[i] != nums[i-1]){
            nums[j] = nums[i];
            j++;
        }
        return res(i+1, j, nums);
        
    }
}