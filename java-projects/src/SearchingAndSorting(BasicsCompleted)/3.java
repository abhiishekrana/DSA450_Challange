// Search an element in a sorted and rotated Array
// Note: Find the element in O(logN) time and assume that all the elements are distinct.

// Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
// Output : Found at index 8

// Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 30
// Output : Not found

// Input : arr[] = {30, 40, 50, 10, 20}, key = 10   
// Output : Found at index 3
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {30, 40, 50, 10, 20};
		int key=10;
		int first = 0;
		int last =arr.length-1;
		int pivot=0;
		while(first<=last){
		    int mid=(first+last)/2;
		    if(arr[mid]==key){
		        pivot=1;
		        System.out.println("arr[mid] index->"+mid);
		        }
		    if(first<=mid)first=mid+1;
		    else{
		        last = mid-1;
		    }
		}
		if(pivot==0)System.out.println("Value not found");
	}
}
