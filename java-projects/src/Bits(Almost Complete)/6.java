/******************************************************************************
Return the position of the setBitCount;
N = 2
Output:
2
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
		int n = 8;
		int count=0;
		int val = setBitCount(n); 
		if(val==1){
		    int cnt=0;
		    while(n>0){
		        n>>=1;
		        cnt+=1;
		    }
		    System.out.println("cnt->"+cnt);
		}
		else System.out.println("invalid case");

	}
}
