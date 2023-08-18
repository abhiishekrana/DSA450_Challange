/***********************************************************
Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value. 
The expected Time Complexity is O(n2).

Input : arr[] = {-2, 0, 1, 3}
        sum = 2.
Output : 2
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3) 

Input : arr[] = {5, 1, 3, 4, 7}
        sum = 12.
Output : 4
Explanation :  Below are triplets with sum less than 12
               (1, 3, 4), (1, 3, 5), (1, 3, 7) and 
               (1, 4, 5)
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {5, 1, 3, 4, 7};
		int sum = 12;
		int ans =0;
		int size = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<size-2;i++){
		    int j=i+1;
		    int k=size-1;
		    while(j<k){
		        if (arr[i] + arr[j] + arr[k] < sum) {
            ans += (k - j);  // Increment answer by the count of valid triplets
            j++;  // Move j to the right to try larger values
        } else {
            k--;  // Move k to the left to try smaller values
        }
		    }
		    
		}
		System.out.print("ans->"+ans);
	}
}