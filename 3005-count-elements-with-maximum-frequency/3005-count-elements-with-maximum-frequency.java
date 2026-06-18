class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        int freq = 0;
        int ans = 0;
        int temp = 0;
        for(var x : map.entrySet()){
             if(freq == x.getValue()){
                ans += freq;
               
            }
            if(x.getValue() > freq){
               freq = x.getValue();
               ans = freq;
              
            }
           
        }
        
        return ans;
    }
}