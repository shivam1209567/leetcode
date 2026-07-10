class triplets implements Comparable<triplets>{
        int dist;
        int x;
        int y;
        triplets(int dist,int x,int y){
            this.dist = dist;
            this.x = x;
            this.y = y;
        }
        public int compareTo(triplets t){
            return this.dist - t.dist;
        }
    }
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<triplets> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] x : points){
            int a = x[0];
            int b = x[1];
            int c = a*a + b*b;
            pq.add(new triplets(c,a,b));
            if(pq.size() > k){
                pq.remove();
            }
        }
        int [][] q = new int [k][2];
        for(int i = 0; i < q.length; i++){
            triplets top = pq.remove();
            q[i][0] = top.x;
            q[i][1] = top.y;
        }
        return q;
    }
}