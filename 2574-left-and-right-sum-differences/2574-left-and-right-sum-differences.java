class Solution {
    int[] leftSum(int []nums){
        int [] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                sum[i] = 0;
                continue;
            }
            sum[i] = sum[i-1] + nums[i-1];
        }
        return sum;
    }
    int [] rightSum(int []nums){
        int[] sum = new int[nums.length];
        for(int i = nums.length - 2; i >= 0; i--){
            if(i == nums.length - 1){
                sum[i] = 0;
            }
            sum[i] = sum[i+1] + nums[i+1];
        }
        return sum;
    }

    public int[] leftRightDifference(int[] nums) {
      int res1[] = leftSum(nums);
      int res2[] = rightSum(nums);
      int res3[] = new int[nums.length];
      for(int i = 0 ; i < nums.length; i++){
        res3[i] = Math.abs(res1[i] - res2[i]);
      }  
      return res3;
    }
}