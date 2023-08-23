/****************************************************************************
Max possible two fruits in a bucket solution or Longest Subarray with Two Distinct Elements
int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
*****************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
		Map<Integer,Integer> map = new HashMap<>();
		int left=0;
		int maxOfArray = Integer.MIN_VALUE;
		for(int right=0;right<arr.length;right++){
		    map.put(arr[right],map.getOrDefault(arr[right],0)+1);
		    
		    while(map.size()>2){
		        map.put(arr[left],map.getOrDefault(arr[left],0)-1);
		        if(map.get(arr[left])==0){
		            map.remove(arr[left]);
		        }
		        left++;
		    }
		    maxOfArray = Math.max(maxOfArray,right-left+1);
		}
		System.out.println("maxOfArray->"+maxOfArray);

	}
}
