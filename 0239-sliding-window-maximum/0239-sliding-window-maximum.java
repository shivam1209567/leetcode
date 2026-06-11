class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
         int n = nums.length;
         int ans [] = new int[n-k+1];
        int [] arr = new int[nums.length];
        st.push(n-1);
        arr[n-1] = n;
        for(int i = nums.length - 2; i>= 0; i--){
            while(st.size() > 0 && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = n;
            }else{
            arr[i] = st.peek();
            }
            st.push(i);
            }
        int j = 0;
        for(int i = 0; i < n - k + 1; i++){
        if(j >= i + k) j = i;
           int max = nums[j];
           while(j < i+k){
            max = nums[j];

            j = arr[j];
           }
           ans[i] = max;
        }
        return ans;
     }
}