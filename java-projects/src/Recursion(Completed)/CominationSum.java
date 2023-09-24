//Using Recursion pick one element multiple times
class Solution {
    void findCombinations(int ind,int[] arr , int target,List<List<Integer>> ans,List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){ 
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind],ans,ds);// Go in dept whil picking the same element from the same index
            ds.remove(ds.size()-1); //while go back we have remove the element from the data structure
        }
        findCombinations(ind+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}