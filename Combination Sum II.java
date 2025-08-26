class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> res=new ArrayList<>();
      Arrays.sort(candidates);
       combinationalSumTwo(0,candidates,target,res,new ArrayList<>());
       return res;  
    }
    public static void combinationalSumTwo(int index,int[] arr,int target,List<List<Integer>> res,List<Integer> ds){
      if(target == 0){
     res.add(new ArrayList<>(ds));
        return;
      }
     for(int i=index;i<arr.length;i++){
   if(i > index && arr[i] == arr[i-1]){   //TO FIND DUPLICATE
    continue;
   }
   if(arr[i] > target){
    break;
   }
     
        ds.add(arr[i]);
        combinationalSumTwo(i+1,arr,target-arr[i],res,ds);
    ds.remove(ds.size()-1);
     }
    }
}
