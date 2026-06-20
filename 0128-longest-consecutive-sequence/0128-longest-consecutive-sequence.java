class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        if(nums.length == 0) return 0;
        for(int x : nums){
            set.add(x);
        }
        for(var x : set){
            if(!set.contains(x-1)){
                int counter = 1;
                
                while(set.size() > 1 && set.contains(x+1)){
                    x++;
                    counter++;
                }
                max = Math.max(max,counter);
               
            }else{
                continue;
            }
        }
        return max;
    }
}