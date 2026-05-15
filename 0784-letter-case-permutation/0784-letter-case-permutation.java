class Solution {
    public static void backtracking(String s,int idx,List<String> result,String curr){
        if(idx == s.length()){
            result.add(curr);
            return;
        }
        char ch = s.charAt(idx);
        if(Character.isDigit(ch)){
            backtracking(s,idx+1,result,curr+ch);
        }else{
            backtracking(s,idx+1,result,curr + Character.toLowerCase(ch));

            backtracking(s,idx+1,result,curr + Character.toUpperCase(ch));
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtracking(s,0,result,"");
        return result;
    }
}