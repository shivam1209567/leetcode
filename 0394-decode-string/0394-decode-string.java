class Solution {
    public String decodeString(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<String> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
           if(Character.isDigit(ch)){
            int num = 0;
            while(i < s.length() && Character.isDigit(s.charAt(i))){
                num = num*10+(s.charAt(i)-'0');
                i++;
            }
            val.push(num);
            i--;
           }
           else if(ch == '['){
            st.push("[");
           }
           else if(Character.isLetter(ch)){
            st.push(String.valueOf(ch));
           }
           else if(ch == ']'){
            StringBuilder a = new StringBuilder();
            while(!st.isEmpty() && !st.peek().equals("[")){
                a.insert(0,st.pop());
            }
            st.pop();
            int vals = val.pop();
            StringBuilder b = new StringBuilder();
            for(int j = 0; j < vals; j++){
                b.append(a);
            }
            st.push(b.toString());
           }
            
        }
        StringBuilder c = new StringBuilder();
        while(!st.isEmpty()){
            c.insert(0,st.pop());
        }
        return c.toString();
    }
}