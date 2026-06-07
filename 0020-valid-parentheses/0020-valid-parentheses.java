class Solution {
    void matching(){

    }
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
       if(s.length() == 1) return false;
       for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
            st.push(ch);
        }else{
          
            if(st.isEmpty()){
                 return false;
            }
            char top = st.peek();
             if ((top == '(' && ch == ')') ||
                    (top == '[' && ch == ']') ||
                    (top == '{' && ch == '}')) {

                    st.pop();
                } else {
                    return false;
                }            
        }
       
       } 
       if(!st.isEmpty()) return false;
       return true;
    }
}