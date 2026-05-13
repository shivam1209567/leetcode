class Solution {
    public int reverse(int x) {
        int rvrs = 0;
        while (x != 0){
            int digit = x % 10;
            if(rvrs > Integer.MAX_VALUE / 10 ||
   (rvrs == Integer.MAX_VALUE / 10 && digit > 7)) {
    return 0;
}

if(rvrs < Integer.MIN_VALUE / 10 ||
   (rvrs == Integer.MIN_VALUE / 10 && digit < -8)) {
    return 0;
}
            rvrs = rvrs * 10 + digit;
            x = x / 10;
            
        }
        return rvrs;
    }
}