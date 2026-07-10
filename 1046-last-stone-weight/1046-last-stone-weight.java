class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            pq.add(x);
        }
        while(pq.size() > 1){
            int a = pq.remove();
            int b = pq.remove();
            pq.add(a-b);
            // if(pq.size() == 1) break;
        }
        return pq.peek();
    }
}