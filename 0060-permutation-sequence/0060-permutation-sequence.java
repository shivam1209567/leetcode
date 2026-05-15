class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> curr = new ArrayList<>();
        int fac = 1;
        for(int i = 1; i < n; i++){
            fac *= i;
            curr.add(i);
        }
        curr.add(n);
        
        k--;
        StringBuilder res = new StringBuilder();
        while(true){
      
        
        int idx = k/fac;
        res.append(curr.get(idx));
        curr.remove(idx);
          if(curr.size() == 0){
            break;
        }
        k = k % fac;
        fac = fac/curr.size();
        }
        return res.toString();
    }
}