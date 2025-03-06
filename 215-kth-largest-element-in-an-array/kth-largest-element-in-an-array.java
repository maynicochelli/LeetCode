class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num: nums) {
            if (minHeap.size() < k) { 
                minHeap.add(num); // If the heap has fewer than k elements, add directly
            } else if (num > minHeap.peek()) {
                minHeap.poll(); // Remove the smallest element from the heap
                minHeap.add(num); // Add the new element to the heap
            }
        }
        return minHeap.peek(); // The top of the heap contains the k-th largest element
    }
}