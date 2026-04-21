class Solution {
    public boolean isPowerOfTwo(int n) {
        int result = 0;
        int a = 1;
        if(n <= 0){
            return false;
        }
    for(int i = 0; i < 32; i++){
        if((n & a) != 0){
            result++;
        }
        a = a << 1;
    }  
    if(result == 1){
        return true;
    }else{
    return false;
    }
    }
}