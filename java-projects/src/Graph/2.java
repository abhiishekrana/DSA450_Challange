// No of provencis code in java
//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean vis[] = new boolean[V+1];
       
        int ans=0;
        for(int i=1;i<=V;i++){
            if(!vis[i]){
                ArrayList<Integer> ls = new ArrayList<>();
                dfs(i, vis, adj, ls);
                ans++;
            }
        }
        
        return ans;
    }
    static void dfs(int node,boolean vis[],  ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);

        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ls);
                
                
            }
        }

    }
}