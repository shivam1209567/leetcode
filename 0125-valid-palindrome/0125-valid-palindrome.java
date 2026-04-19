class Solution {
    
    public static boolean check(int n , String s){
        int m = s.length()-1;
        if(n >= m){
            return true;
        }
        if(s.charAt(n) != s.charAt(m-n)){
            return false;

        }
        return check(n+1,s);
    }
    public boolean isPalindrome(String s) {
      s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      return check(0,s);

    }
}