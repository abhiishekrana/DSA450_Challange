// 1.Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo


public class Array3 {
    	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {0, 1, 2, 0, 1, 2};
		int n=arr.length;
		int low=0;
		int high = n-1;
		int mid=0;
		int temp=0;
		while(mid<=high){
		    switch(arr[mid]){
		        case 0:{
		            temp=arr[low];
		            arr[low]=arr[mid];
		            arr[mid]=temp;
		            low++;
		            mid++;
		            break;
		        }
		        case 1:{
		            mid++;
		            break;
		        }
		        case 2:{
		            temp=arr[high];
		            arr[high]=arr[mid];
		            arr[mid]=temp;
		            high--;
		            break;
		        }
		    }
		}
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
