public class Array1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {10,20,30,40,50};
		int [] arr1=new int[arr.length];
		int i=0;
		for(int j=arr.length-1;i>=0;i--){
		    arr1[i]=arr[j];
		    i++;
		}
		for(int k:arr1){
		    System.out.print(k+ " ");
		}
		
	}
}