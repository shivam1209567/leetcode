class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min = new PriorityQueue();
        max = new PriorityQueue(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(max.isEmpty()) max.add(num);
        else{
            if(num <= max.peek()) max.add(num);
            else min.add(num);
        }
        if(max.size() == min.size() + 2) min.add(max.poll());
        else if(min.size() == max.size() + 2) max.add(min.poll());
    }
    
    public double findMedian() {
        if(min.size() == max.size()) return (min.peek() + max.peek())/2.0;
        else if(min.size() == max.size()+1) return min.peek();
        else return max.peek();
    }
}