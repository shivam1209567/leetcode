class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int ans = -1;
        int min = 0;
        
        for(var e : map.entrySet()){
            if( e.getKey() % 2 == 0){
                if(e.getValue() > min){
                    min = e.getValue();
                    ans = e.getKey();
                }else{
                    if((e.getValue() == min && e.getKey() < ans )|| ans == -1){
                        ans = e.getKey();
                    }
                }
            }
        }
        if(min == 0) return -1;
        return ans;
    }
}