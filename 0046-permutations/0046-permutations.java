class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        printPrm(nums,result,perm);
        return result;
    }
    public static void printPrm(int[] nums, List<List<Integer>> result,List<Integer> perm){

        if(nums.length == perm.size()){
            result.add(new ArrayList <>(perm));
            return;
        }


  for(int i = 0; i < nums.length; i++){
       if(perm.contains(nums[i]))  continue;

       perm.add(nums[i]);

       printPrm(nums,result,perm);

       perm.remove(perm.size() -1);
  }
    }
}