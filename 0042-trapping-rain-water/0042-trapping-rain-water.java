class Solution {
    public int trap(int[] height) {
        int a = height.length;
        int l = 0;
        int r = a-1;
        int lm = Integer.MIN_VALUE;
        int rm = Integer.MIN_VALUE;
        int sum = 0;
        while(l < r){
            if(height[l]<height[r]){
               lm = Math.max(lm,height[l]);
               sum = sum + (lm-height[l]);
               l++;
            }else{
                rm = Math.max(rm,height[r]);
                sum = sum + (rm-height[r]);
                r--;
            }
        }
        return sum;
    }
}