class Solution {
    public int mySqrt(int x) {
     return rot(0,x);    
    }
    public static int rot(int i,int x){
      long c = (long)i*i;
      if(c == x){
        return i;
      }
      if(c > x){
        return i-1;
      }
      
      return rot(i+1,x);
    }
}