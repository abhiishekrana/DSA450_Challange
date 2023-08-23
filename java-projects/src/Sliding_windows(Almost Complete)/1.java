/**********************************
Sliding window with given size
arr[] = {100, 200, 300, 400},  k = 2

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int max = Integer.MIN_VALUE;
		int windowSum = 0;
		int k=4;
		for(int i=0;i<k;i++){
		    windowSum+=arr[i];
		}
		for(int i=k;i<arr.length;i++){
		    windowSum+=arr[i]-arr[i-k];
		    max=Math.max(windowSum,max);
		}
		System.out.println("max->"+max);
	}
}