class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        if(st.size() == 0){
            st.push(value);
            min.push(value);
        }else{
            st.push(value);
            if(value < min.peek()){
                min.push(value);
            }else{
                min.push(min.peek());
            }
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
       return  st.peek();
        
    }
    
    public int getMin() {
        int a = min.peek();
        return a;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */