class Solution {
    public int climbStairs(int n) {
  int first=1;
  int sec=1;
  for(int i=0;i<n-1;i++){
    int temp=first+sec;
     first=sec;
    sec=temp;
  }
  return sec;
    }
}
