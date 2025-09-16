class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
       
        
    }
    public void reverseNum(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
