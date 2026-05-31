class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n > 0){
            int s = n % 10;
            sum += s;
            n = n/10;
        }
        return sum;
    }
}