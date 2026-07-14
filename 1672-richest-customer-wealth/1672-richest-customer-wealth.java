class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0 , count = 0 ;
        for(int i = 0 ; i < accounts.length ; i++){
        for(int j = 0 ; j < accounts[i].length ; j++){
            sum += accounts[i][j];
        }
        if(sum >= count) count = sum ;
            sum = 0;
        }
        return count;
    }
}