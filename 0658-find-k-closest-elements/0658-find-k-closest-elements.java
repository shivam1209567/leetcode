class comp implements Comparable<comp>{
    int x;
    int y;
    comp(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(comp v){
        if(this.y != v.y) return v.y - this.y;
        return v.x - this.x;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<comp> pq = new PriorityQueue<>();
        for(int b : arr){
            pq.add(new comp(b,Math.abs(b-x)));
            if(pq.size() > k) pq.remove();
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(pq.size() > 0){
            comp g = pq.remove();
            list.add(g.x);
        }
        Collections.sort(list);
        return list;
    }
}