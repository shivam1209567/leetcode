class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-1; i++){
            int j = i +1;
            int k = nums.length - 1;
            while( j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < target){
                    j++;
                }else{
                    k--;
                }
                int diff = Math.abs(sum - target);
                if(diff < min){
                    result = sum;
                    min = diff;
                }
                
            }
        }
        return result;
    }
}