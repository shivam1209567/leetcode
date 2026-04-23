class Solution {
    public boolean isPowerOfFour(int n) {
     return res(n);   
    }
    static boolean res(int n){
        if(n == 1){
            return true;
        }
        if(n % 4 != 0 || n <= 0){
            return false;
        }
        
        return res(n/4);
    }
}