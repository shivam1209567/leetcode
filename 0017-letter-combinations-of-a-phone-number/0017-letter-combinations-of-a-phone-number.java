import java.util.*;
class Solution {
     static String[] keypad = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
      List<String> result = new ArrayList<>();
      if(digits.length() == 0) return result;
      
      backtrack(digits,0,"",result);
      return result;
    }
   public static void backtrack(String digits, int idx, String comb, List<String> result){
    if(digits.length() == idx){
        result.add(comb);
        return;
    }
    char currChar = digits.charAt(idx);
    String mapping = keypad[currChar - '0'];
    for(int i = 0; i < mapping.length(); i++){
        backtrack(digits,idx+1,comb+mapping.charAt(i),result);
    }
   }
}