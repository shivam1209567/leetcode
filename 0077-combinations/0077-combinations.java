class Solution {
    public static void backtracking(int n,int k,List<Integer> currs,List<List<Integer>> res,int start){
        if(currs.size() == k){
            res.add(new ArrayList<>(currs));
            return ;
        }
        
        int currInt = start;
        
        for(int i = currInt; i <= n; i++){

        
        currs.add(i);
        backtracking(n,k,currs,res,i + 1);
        currs.remove(currs.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currs = new ArrayList<>();
        backtracking(n,k,currs,res,1);
        return res;
                     
    }  
}