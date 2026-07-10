class pair implements Comparable<pair>{
    int num;
    int freq;
    pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }
    public int compareTo(pair p){
        if(this.freq == p.freq) return this.num - p.num;
        return this.freq-p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        }
      for(int x : map.keySet()){
        int freq = map.get(x);
        pq.add(new pair(x,freq));
        if(pq.size() > k) pq.remove();
    }   
    int [] d = new int [pq.size()];
    int i = 0;
    while(pq.size() > 0){
        pair top = pq.remove();
        d[i] = top.num;
        i++;
    }
    return d;
    }
}