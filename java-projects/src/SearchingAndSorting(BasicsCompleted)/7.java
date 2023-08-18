// Find four elements that sum to a given value | Set 1 (n^3 solution)
// For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and X = 23, then your function should print “3 5 7 8” (3 + 5 + 7 + 8 = 23).
import java.util.*;
public class Main{
    public static void main(String[] args){
        int arr[] = {1, 4, 45, 6, 10, 12};
        int n = arr.length;
        int X = 21;
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1;
                int r=n-1;
                if(arr[i]+arr[j]+arr[l]+arr[r]==X){
                    System.out.print(arr[i]+arr[j]+arr[l]+arr[r]);
                    l++;
                    r--;
                }
                else if(arr[i]+arr[j]+arr[l]+arr[r]<X){
                    l++;
                }
                else r--;
            }
        }
    }
}