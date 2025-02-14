/*

Intuition: All the things are related to elements less than k. Given the high constraints in this 
  problem, we also need to consider data type conversion. To solve this, we can use a Priority 
  Queue (Min-Heap) and a variable count to track the number of operations. We start by traversing 
  the queue, extracting the two smallest elements, performing the required operation, and if 
the result is still less than k, we push it back into the queue. This process continues until 
  the queue is empty, and we increment the count for each operation performed.

Approach:
  -> Take Priority Queue or Min Heap (pq) and push array elements which are less than k to the pq.
  -> Take count as variable.
  -> Now traverse the queue untill queue is not empty, now take two smallest elements and make sure 
     put the condition to check pq is empty or not, now increament the count and do the remaining 
     operation as per the problem.
  -> And in the last, check the value we have get through the doing operation is less than k or 
     greater than k.
  -> Return count.

*/


class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            if(num < k) {
                pq.offer(num);
            }
        }
        int count = 0;

        while(!pq.isEmpty()) {
            int x = pq.poll();
            count++;

            if(pq.isEmpty()) {
                break;
            }
            int y = pq.poll();

            long val = (Math.min(x, y) * 2L) + Math.max(x, y);
            if(val < k) {
                pq.offer((int) val);
            }
        }
        return count;
    }
}
