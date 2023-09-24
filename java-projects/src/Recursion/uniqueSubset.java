//Unique subset by using sort and continue;
class Solution {

    void func(int ind,int[] nums,List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind &&nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            func(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,ans,new ArrayList<>());
        return ans;
    }
}

