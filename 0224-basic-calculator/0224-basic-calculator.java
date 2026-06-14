class Solution {
    public int calculate(String s) {
     int sum = 0;
     int  sign = 1;
     Stack<Integer> st = new Stack<>();
     for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(ch == ' ') continue;
        if(Character.isDigit(ch)){
            int num = 0;
            while(i < s.length() && Character.isDigit(s.charAt(i))){
                num = num *10 + (s.charAt(i) - '0');
                i++;
            }
            i--;
            num = num*sign;
            sum += num;
            sign = +1;        
            }else if(ch == '('){
              st.push(sum);
              st.push(sign);
              sum = 0;
              sign = +1;

            }else if(ch == ')'){
                sum *= st.pop();
                sum += st.pop();
                
            }
            else if(ch == '-'){
                sign *= -1;
            }
     }   
    return sum;
}
}