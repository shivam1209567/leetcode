class Solution {
    public int largestRectangleArea(int[] heights) {
        int l = heights.length;
        Stack<Integer> st = new Stack<>();
        int nextSmaller[] = new int [l];
        int prevSmaller[] = new int [l];
        st.push(l-1);
        nextSmaller[l-1] = l;
        for(int i = l-2; i >= 0; i--){
        while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
            st.pop();
        }
        if(st.size() == 0){
            nextSmaller[i] = l;
        }else{
            nextSmaller[i] = st.peek();
      }
        st.push(i);
        
    }
    while(st.size() > 0) st.pop();
    st.push(0);
    prevSmaller[0] = -1;
    for(int i = 1; i < l; i++){
        while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
            
            st.pop();
        }
        if(st.isEmpty()){
            prevSmaller[i] = -1;
        }else{
            prevSmaller[i] = st.peek();
        }
        st.push(i);
    }
    int ans = 0;
    for(int i = 0; i < l; i++){
        int area = heights[i] * (nextSmaller[i] - prevSmaller[i] - 1);
         ans = Math.max(ans,area);
    }
    return ans;
}
}