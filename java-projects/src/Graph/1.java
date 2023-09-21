// Representation of undirected graph
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1);
        adj.get(1).add(3);

        for (int i = 1; i <= n; i++) { // Start i from 1
            System.out.print("Adjacency list of node " + i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}



/******************************************************************************
adjcncy List of a graph
*******************************************************************************/
import java.util.*;
public class Main{

    static void initGraph(int V,int edges[][],int noOfEdges){
        //Create empty list of vector
        Vector<Integer> adj[] = new Vector[V];
        for(int i=0;i<adj.length;i++){
            adj[i]=new Vector<>();
            
        }
        // Traverse the adj list and make list
        for(int i=0;i<noOfEdges;i++){
            addEdge(adj,edges[i][0],edges[i][1]);
        }
        
        //Crate adjacencylist
        adjacencylist(adj, V);
    }
    
    
    static void addEdge(Vector<Integer> adj[],int u,int v){
        adj[u].add(v);
    }
    
    static void adjacencylist(Vector<Integer> adj[],int V){
        for(int i=0;i<V;i++){
            System.out.print(i+"->");
            for(int x:adj[i]){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
  {
    // Given vertices
    int V = 3;
 
    // Given edges
    int edges[][] = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
 
    int noOfEdges = 3;
 
    // Function Call
    initGraph(V, edges, noOfEdges);
 
}
}
