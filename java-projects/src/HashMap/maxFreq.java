
//Maximum Frequency Element
class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        // code here
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int freq = 0;
        for(int i:map.keySet()){
            if(freq<map.get(i)){
                freq = map.get(i);
                ans = i;
            }
        }
        return ans;
    }
}
//map.containsKey(i)