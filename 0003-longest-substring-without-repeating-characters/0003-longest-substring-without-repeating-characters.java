import java.util.*;
class Solution {

    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> map = new HashSet<>();
       int i = 0;
       int maxLen = 0;
       for(int j = 0; j < s.length(); j++)        {
        while(map.contains(s.charAt(j))){
            map.remove(s.charAt(i));
            i++;
        }
        map.add(s.charAt(j));
        maxLen = Math.max(maxLen, j-i+1);
       }
       return maxLen;
    }
   
}