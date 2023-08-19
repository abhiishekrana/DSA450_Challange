/******************************************************************************
Finding whether a given number is a power of 2 by checking the count of set bits:
Return true if it is a power of 2 otherwise return false

*******************************************************************************/
public class Main
{
    static int setBitCount(int n){
        int c=0;
        while(n>0){
            c+=n&1;
            n>>=1;
        }
        return c;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int N = 18;
		int count=0;
		int val = setBitCount(N); 
		if(val==1)System.out.println("true");
		else System.out.println("true");

	}
}
