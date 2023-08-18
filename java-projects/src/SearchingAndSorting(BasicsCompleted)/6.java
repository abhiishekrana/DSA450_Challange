// Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

// Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output : 4
// Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

// Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
// Output : No Majority Element
// Explanation: There is no element whose frequency is greater than the half of the size of the array size.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
        map.put(val,map.getOrDefault(val,0)+1);
        }
        int size=Math.abs(arr.length/2);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        
        if(entry.getValue()>size){
        System.out.print(entry.getKey());
        }
	}
	}
}
