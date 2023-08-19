/******************************************************************************
Find the two non-repeating elements in an array of repeating elements/ Unique Numbers 2

Given an array in which all numbers except two are repeated once. (i.e. we have 2n+2 numbers and n numbers are occurring twice 
and the remaining two have occurred once). Find those two numbers in the most efficient way.  

*******************************************************************************/
import java.util.*;
public class Main
{
    static ArrayList<Integer> get2NonRepeatingNos(int[] arr,int n){
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                ans.add(arr[i]);
                i = i - 1;
            }
            
        }
        return ans ;
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = { 2, 3, 7, 9, 11, 2, 3, 11 };
        int n = arr.length;
        ArrayList<Integer> ans = get2NonRepeatingNos(arr, n);
        System.out.print("The non-repeating elements are ");
        System.out.println(ans.get(0) + " and " + ans.get(1));
	}
}
