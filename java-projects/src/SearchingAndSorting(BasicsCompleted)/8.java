/*********************
Maximum sum such that no two elements are adjacent

Input: arr[] = {5, 5, 10, 100, 10, 5}
Output: 110
Explanation: Pick the subsequence {5, 100, 5}.

Input: arr[] = {3, 2, 7, 10}
Output: 13
Explanation: The subsequence is {3, 10}. This gives sum = 13.

Input: arr[] = {3, 2, 5, 10, 7}
Output: 15
Explanation: Pick the subsequence {3, 5, 7}. The sum is 15.

*******************************************************************************/
public class Main
{
    static int rec(int[] arr, int idx,int size){
        if(idx>=size){
            return 0;
        }
        return Math.max(arr[idx]+rec(arr,idx+2,size),rec(arr,idx+1,size));
    }
    static int findMax(int[] arr,int N){
        return rec(arr,0,N);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {3, 2, 5, 10, 7};
		System.out.print(findMax(arr,arr.length));
	}
}
