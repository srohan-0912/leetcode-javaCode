class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
          PriorityQueue<int[]> queue = new PriorityQueue<>(
             (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
           for(int i=0;i<nums.length;i++){
            queue.add(new int[]{nums[i],i});
           }
           for(int i=0;i<k;i++){
            int[] curr=queue.poll();
            curr[0]*=multiplier;
            queue.add(curr);
           }
           while(!queue.isEmpty()){
            int[] curr=queue.poll();
            nums[curr[1]]=curr[0];
           }
           return nums;
    }
}
