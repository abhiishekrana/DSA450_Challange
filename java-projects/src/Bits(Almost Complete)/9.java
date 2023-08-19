
/******************************************************************************
Calculate square of a number without using *, / and pow()
Input: n = 5
Output: 25

Input: 7
Output: 49

Input: n = 12
Output: 144

We have two approach for this 
O(n) and O(log(n))

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 5;
		int sqrt = n;
		for(int i=1;i<n;i++){
		    sqrt+=n;
		}
		System.out.println("sqrt->"+sqrt);
	}
}

public class Main
{
    static int square(int n){
         if (n == 0)
            return 0;
 
        // Handle negative number
        if (n < 0)
            n = -n;
            
        if(n%2==0){
            return 4*square(n/2);
        }
        else if(n%2!=0){
            return 4*square((n/2))+4*(n/2)+1;
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(square(12));
		
	}
}

