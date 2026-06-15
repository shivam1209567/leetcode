class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
      q1 = new LinkedList();
      q2 = new LinkedList();
    }
    
    public void push(int x) {
        
        q1.add(x);
    }
    
    public int pop() {
        int s = q1.size();
     for(int i = 0; i < s-1; i++){
        q2.add(q1.remove());
      }  
      int l = q1.remove();
      while(!q2.isEmpty()){
        q1.add(q2.remove());
      }
      return l;
    }
    
    public int top() {
       int s = q1.size();
        for(int i = 0; i < s-1; i++){
          q2.add(q1.remove());
        }
        int l = q1.peek();
        q2.add(q1.remove());
       while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return l;
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