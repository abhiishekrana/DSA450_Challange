/******************************************************************************
Problem Statement:
Given an array of positive integers and an integer K, find the number of subarrays where the product of all elements in the subarray is less than K.

Example:
Input: nums = [10, 5, 2, 6], K = 100
Output: 8

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {10,5,2,6};
	    int k=100;
	    int left=0;
	    int product = 1;
	    int count=0;
	    for(int right=0;right<arr.length;right++){
	        product*=arr[right];
	        while(product>=k && left<=right){
	            product/=arr[left];
	            left++;
	        }
	        count+= right-left+1;
	    }
	    System.out.println("count->"+count);
	}
}
