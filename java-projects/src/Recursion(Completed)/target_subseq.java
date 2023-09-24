// print the list sum with the target
import java.util.*;
public class Main
{
    static void recursion(int start,int[] arr,ArrayList<Integer> al,int sum,int target){
        if(start>=arr.length){
            if(sum==target){
                System.out.print(al);
            }
            return;
        }
        al.add(arr[start]);
        recursion(start+1,arr,al,sum+arr[start],target);
        al.remove(al.size() - 1);
        recursion(start+1,arr,al,sum,target);
    }
	public static void main(String[] args) {
		int arr[] = {3,1,2};
		int sum = 0;
		int target = 3;
		ArrayList<Integer> al = new ArrayList<>();
		recursion(0,arr,al,sum,target);
	}
}
