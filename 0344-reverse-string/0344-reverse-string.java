class Solution {
    public void reverseString(char[] s) {
        res(s,0,s.length);
    // String[] a= new String[s.length];
    // int left = 0;
    // int right = s.length - 1;
    // while(left < right){
    //     char temp = s[left];
    //     s[left] = s[right];
    //     s[right] = temp;
    //     left++;
    //     right--;

    // }

    }
    static void res(char [] s, int i,int j){
        if (i >= j/2){
            return;
        }
        char temp = s[i];
        s[i] = s[j-i-1];
        s[j-i-1] = temp;
        res(s,i+1,j);
    }
}