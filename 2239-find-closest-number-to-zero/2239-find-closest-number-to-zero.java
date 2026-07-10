class sex implements Comparable<sex>{
    int dist;
    int x;
    sex(int dist,int x){
        this.dist = dist;
        this.x = x;
    }
    public int compareTo(sex y){
        if(y.dist != this.dist)return y.dist - this.dist;
        return this.x-y.x;
    }
}
class Solution {
    public int findClosestNumber(int[] nums) {
        PriorityQueue<sex> pq = new PriorityQueue<>();
        for(int x : nums){
            
            pq.add(new sex(Math.abs(x),x));
            if(pq.size() > 1) pq.remove();
        }
        sex q = pq.remove();
        return q.x;
    }
}