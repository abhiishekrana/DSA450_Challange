//print all the suset in one list
class Solution{
    
    void func(int ind,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> subsetSum){
        if(ind==N){
            subsetSum.add(sum);
            return;
        }
        //increase the indx
        func(ind+1,sum+arr.get(ind),arr,N,subsetSum);
        
        //Not pick up
        func(ind+1,sum,arr,N,subsetSum);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> subsetSum = new ArrayList<>();
        func(0,0,arr,N,subsetSum);
        Collections.sort(subsetSum);
        return subsetSum;
    }
}