class Solution {
    class triplet implements Comparable<triplet>{
        int ele;
        int row;
        int col;
        triplet(int ele,int row, int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(triplet t){
            return this.ele - t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++){
            min = Math.min(min,nums.get(i).get(0));
            max = Math.max(max,nums.get(i).get(0));
            pq.add(new triplet(nums.get(i).get(0),i,0));
        }
        int a = min, b = max;
        while(true){
            triplet top = pq.remove();
            int ele = top.ele, row = top.row, col = top.col;
            if(max - ele < b-a){
                a = ele;
                b = max;
            }
            if(col+1 == nums.get(row).size()) break;
            max = Math.max(max,nums.get(row).get(col+1));
            pq.add(new triplet(nums.get(row).get(col+1),row,col+1));
        }
        int []ans = new int[2];
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}       