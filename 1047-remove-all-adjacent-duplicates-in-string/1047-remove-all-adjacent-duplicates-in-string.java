class Solution {
    String ans(Stack<Character> st){
        
        if(st.size() == 0) return "";
        char a = st.pop();
        String s = ans(st);
        s += a;
        return s;

    }
    
    public String removeDuplicates(String s) {
     Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.size() == 0) {
                st.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i) != st.peek()) st.push(s.charAt(i));
            else st.pop();
        }
        String m;
        String a = ans(st); 
        return a;  
    }
}