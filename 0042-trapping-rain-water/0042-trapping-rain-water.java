class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int rm = Integer.MIN_VALUE;
        int lm = Integer.MIN_VALUE;
        int [] rM= new int[l];
        int [] lM= new int[l];
        for(int i = 0; i < l; i++){
            lm = Math.max(lm,height[i]);
            lM[i] = lm;
        }
        for(int i = l-1; i >= 0; i--){
            rm = Math.max(rm,height[i]);
            rM[i] = rm;
        }
        int sum = 0;
        for(int i = 0; i < l; i++){
            if(height[i] < lM[i] && height[i] < rM[i]){
                sum = sum + Math.min(lM[i],rM[i]) - height[i];
            }
        }
        return sum;
    }
}