//Little learning when we are going back and if that index earlier we cannot tak that repetatively
class Solution {
    public void func(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] arr){
        if(ds.size()==arr.length){
           ans.add(new ArrayList<>(ds));
           return;
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                arr[i]=true;
                ds.add(nums[i]);
                func(nums,ans,ds,arr);
                ds.remove(ds.size()-1);
                arr[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        func(nums,ans,ds,arr);
        return ans;
    }
}