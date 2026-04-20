class Solution {
    public int climbStairs(int n) {
    if(n <= 2){
        return n;
    }
    int a = 1;
    int b = 2;
    
    int i = 3;
    while( i <= n){
        int c  = a+b;
        a = b;
        b = c;
        i++;

    } 
    return b;   
    }
}