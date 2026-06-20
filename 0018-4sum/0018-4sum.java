class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
       
        Arrays.sort(nums);
        int l = nums.length;
        
        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length - 2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int n = l-1;
                while(k < n){
                long sum = (long)nums[i]+nums[j]+nums[k]+nums[n];
                if( sum == target){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[n]);
                    k++;
                    n--;
                    lists.add(list);
                    while(k < n && nums[k] == nums[k-1]){
                        k++;
                    }
                    while(k < n &&  nums[n] == nums[n+1]){
                        n--;
                    }
                }else if(sum > target){
                    n--;
                }else{
                    k++;
                }
            
                }
            }
        }
        return lists;
    }
}