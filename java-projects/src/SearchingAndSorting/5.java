// Find the missing and repeating number

// Input: arr[] = {3, 1, 3}
// Output: Missing = 2, Repeating = 3
// Explanation: In the array, 2 is missing and 3 occurs twice 

// Input: arr[] = {4, 3, 6, 2, 1, 1}
// Output: Missing = 5, Repeating = 1

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int arr[] = {3, 1, 3};
		int size = arr.length;
		int i;
		System.out.println("Repeating Element");
		for( i=0;i<size;i++){
		    int abs_val = Math.abs(arr[i]);
		    if(arr[abs_val-1]>0){
		        arr[abs_val-1] = -arr[abs_val-1];
		    }
		    else{
		        System.out.println(abs_val);
		    }
		}
		    System.out.println("print array");
		    for(int val:arr){
		        System.out.print(val+" ");
		    }
		    
	    System.out.println("Missing Element");
	    for( i=0;i<size;i++){
	        if(arr[i]>0){
	            System.out.println(i+1);
	        }
	    
		}
		
	}
}
