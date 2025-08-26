class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res=new ArrayList<>();
     combinationalSum(0,candidates,target,res,new ArrayList<>());
     return res;
    }
    public static void combinationalSum(int index,int[] arr,int target,List<List<Integer>> res,List<Integer> ds){
     if(target == 0){
        res.add(new ArrayList<>(ds));
        return;
     }
     if(index == arr.length || target < 0){
      return;
     }
  ds.add(arr[index]);
        combinationalSum(index, arr, target - arr[index], res, ds); // Recurse with the same index
        ds.remove(ds.size() - 1); // Backtrack

        // Exclude the current element and move to the next one
        combinationalSum(index + 1, arr, target, res, ds);
}
}
