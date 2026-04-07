class Solution {
    public int strStr(String haystack, String needle) {
    int m = haystack.length();
    int n  = needle.length();
    if(n>m) return -1;
    for(int i = 0; i <= m-n; i++){
        if(haystack.substring(i, i+n).compareTo(needle) == 0 ){
            return i;
        }
    }    
    return -1;
    }
}