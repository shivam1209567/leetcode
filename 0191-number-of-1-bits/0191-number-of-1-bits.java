class Solution {
    public int hammingWeight(int n) {
    int counter = 0;
    int result = 1;
    for(int i = 0; i < 32; i++){
        if((result & n) != 0){
            counter++;
        }
        result = result << 1;
    }
    return counter;
    }
}