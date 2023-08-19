/******************************************************************************
Divide two integers without using multiplication, division and mod operator

Input : a = 10, b = 3
Output : 3

Input : a = 43, b = -8
Output :  -5 



*******************************************************************************/
import java.util.*;
public class Main
{
    static int getQuotient(int a, int b){
        long sign
            = ((a < 0) ^ (b < 0)) ? -1 : 1;
        int q=0;
        a=Math.abs(a);
        b=Math.abs(b);
        while(a>=b){
            a=a-b;
            q++;
        }
        if(sign==-1){
            return -q;
        }
        return q;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a =43;
		int b =-8;
		System.out.println(getQuotient(a,b));
	}
}
