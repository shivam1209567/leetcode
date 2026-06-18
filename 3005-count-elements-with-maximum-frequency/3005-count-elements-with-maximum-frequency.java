class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int freq = 0;
        int ans = 0;
        int temp = 0;
        for(int x : map.values()){
             
            if(x > freq){
               freq = x;
               ans = x;
              
            }else if(freq == x){
                ans += x;
            }
           
        }
        
        return ans;
    }
}