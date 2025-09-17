class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> val=new PriorityQueue<>();
        for(int num:nums){
            val.add(num);
            if(val.size() > k){
                val.poll();
            }
        }
        return val.peek();

    }
}
