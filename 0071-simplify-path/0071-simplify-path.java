class Solution {
    void rec(Stack<String> st ,StringBuilder str){
        if(st.isEmpty()){
            return;
        } 
        String temp = st.pop();
        rec(st,str);
        str.append("/");
        str.append(temp);
    }
    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> st = new Stack<>();
        for(String i : arr){
            if(i.equals("..") && !st.isEmpty()){
                st.pop();
            }
            else if(!i.equals(".") && !i.equals("") && !i.equals("..")){
                st.push(i);
            }
        }
        StringBuilder ans = new StringBuilder();
        rec(st,ans);
        return ans.length() == 0 ? "/" : ans.toString();
     }
}