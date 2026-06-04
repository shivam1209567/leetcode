class Solution {
    public int count(int num){
        int c = 0;
        char[] ary = String.valueOf(num).toCharArray();
        if(ary.length < 3){
            return 0;
        }
        for(int i= 1; i < ary.length; i++){
            if(i == ary.length-1){
                break;
            }
            if(ary[i] > ary[i-1] && ary[i] > ary[i+1]){
                c++;
            }else if(ary[i] < ary[i-1] && ary[i] < ary[i+1]){
                c++;
            }
           
           
           }
        return c ;
        
    }
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        for(int i = num1; i <= num2; i++){
            sum += count(i);
        }
        return sum;
    }
}