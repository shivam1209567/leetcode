class Solution {
    public int lengthOfLastWord(String s) {
        
        int n = s.length() - 1;
        for(; n >= 0; n--){
            if(s.charAt(n) != ' '){
                break;
         }
        }
        int counter = 0;
        for(; n >= 0; n--){
            if(s.charAt(n) == ' '){
                break;

            }
            counter++;
        }
       
       return counter;
    }
}