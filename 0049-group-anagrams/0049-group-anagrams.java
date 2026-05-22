class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> Map = new HashMap<>();
      for(int i = 0; i < strs.length; i++){
        String curr = strs[i];
        char[] currChar = curr.toCharArray();
        Arrays.sort(currChar);
        String str = new String(currChar);
        if(!Map.containsKey(str)){
            Map.put(str,new ArrayList<>());
        }
            Map.get(str).add(curr);
        
      } 
      return new ArrayList<>(Map.values()); 
    }
}