
// Find a Fixed Point (Value equal to index) in a given array
//  Input: arr[] = {-10, -5, 0, 3, 7}
//   Output: 3  // arr[3] == 3 
  
//     Input: arr[] = {0, 2, 5, 8, 17}
//   Output: 0  // arr[0] == 0 
  
//    Input: arr[] = {-10, -5, 3, 4, 7, 9}
//   Output: -1  // No Fixed Point

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {-10, -5, 0, 3, 7};
		int var=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==i){
		        var=1;
		        System.out.println(arr[i]);
		    }
		}
		System.out.println("var->"+var);
		if(var==0){
		    System.out.println("-1");
		}
	}
}