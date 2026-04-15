class Solution {
    public int findGCD(int[] nums) {
    Arrays.sort(nums);
    int s = nums[0];
    int l = nums[nums.length-1];
    while(l > 0 && s > 0){
        if(l > s){
            l = l % s;
        }else{
            s = s % l;
        }
    }
    if(l == 0){
        return s;
    }else{
        return l;
    }
    }
}