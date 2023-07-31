public class Array2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {3, 5, 4, 1, 9};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(max<=arr[i])max=arr[i];
		    else if(min>arr[i])min=arr[i];
		}
		System.out.print("max ->"+max+" min->"+min);
	}
}


