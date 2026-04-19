class Solution {
    public String addBinary(String a, String b) {
       return res(a,b,a.length()-1,b.length()-1,0);  
    }
    public static String res(String a, String b,int i,int j,int carry){
     if(i < 0 && j < 0 && carry == 0){
        return "";
     }
     
     int sum = carry;
     if(i >= 0){
      sum += a.charAt(i) - '0';
     }
     if(j >= 0){
        sum += b.charAt(j) - '0';
     }
     return res(a,b,i-1,j-1,sum/2) + sum%2;
     
    }
}