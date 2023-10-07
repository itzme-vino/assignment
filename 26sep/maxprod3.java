class Solution {
   public int maximumProduct(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> negated = new ArrayList<>();
        for (int x : nums) {lst.add(x); negated.add(-x);};

        // heapify is O(N)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(lst);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(negated);


        int max1 = -maxHeap.poll();
        int max2 = -maxHeap.poll();
        int max3 = -maxHeap.poll();

        int min1 = minHeap.poll();
        int min2 = minHeap.poll();

        return Math.max(max1*max2*max3, min1*min2*max1);
    }
}