// Find first and last positions of an element in a sorted array
// Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}, x = 5
// Output : First Occurrence = 2
//               Last Occurrence = 5
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1, 3, 5, 5, 5, 5, 7, 123, 125};
		int x=7;
		int first = -1;
		int last = -1;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]!=x){
		        continue;
		    }
		    if(first==-1){
		        first=i;
		    }
		    last=i;
		}
		if(first!=-1){
		    System.out.println("FirstIndex->"+first);
		    System.out.print("LastIndx->"+last);
		}
	}
}
