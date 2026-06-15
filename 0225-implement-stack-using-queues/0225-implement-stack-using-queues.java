class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
      q1 = new LinkedList();
      q2 = new LinkedList();
    }
    
    public void push(int x) {
        if(q1.size() == 0){
        q1.add(x);
        }else{
            q1.add(x);
            int a = q1.size();
            for(int i = 0; i < a-1; i++){
                q2.add(q1.remove());
            }
            int b = q2.size();
            for(int i = 0; i < b; i++){
                q1.add(q2.remove());
            }
        }

    }
    
    public int pop() {
      return q1.remove();
    }
    
    public int top() {
      return q1.peek();
    }
    
    public boolean empty() {
        if(q1.size() == 0) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */