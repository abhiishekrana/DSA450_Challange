Subarray : contigious and follow order
Subsequence : contigious or non contigious but follow order.

/* 
pick and non pick basic idea
f(ind,[]){
    if(ind>=n){
        print([])
        return 
    }
    [].add(arr[i])
    f(ind+1,[])
    [].remove(arr[i])
    f(ind+1,[])
}
main(){
    arr->{3,1,2};
    f(0,[])
}
*/

// find the subsequences of arr
import java.util.*;
public class Main
{
    static void recursion(int start,int[] arr,ArrayList<Integer> al){
        if(start>=arr.length){
            System.out.print(al);
            return;
        }
        al.add(arr[start]);
        recursion(start+1,arr,al);
        al.remove(al.size() - 1);
        recursion(start+1,arr,al);
    }
	public static void main(String[] args) {
		int arr[] = {3,1,2};
		ArrayList<Integer> al = new ArrayList<>();
		recursion(0,arr,al);
	}
}

Time Complxity : O(2^n*n)
Space Complxity : O(N )
