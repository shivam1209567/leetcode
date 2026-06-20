class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = l*(l+1)/2;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
             ans += nums[i];
        }
        int m = sum - ans;
        return m;
    }
  
}