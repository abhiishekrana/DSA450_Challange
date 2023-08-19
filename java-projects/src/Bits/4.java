/******************************************************************************
Count total set bits in first N Natural Numbers (all numbers from 1 to N)

Input: N = 3
Output:  4
Explanation: Numbers from 1 to 3: {1, 2, 3}
Binary Representation of 1: 01 -> Set bits = 1
Binary Representation of 2: 10 -> Set bits = 1
Binary Representation of 3: 11 -> Set bits = 2
Total set bits from 1 till 3 = 1 + 1 + 2 = 4

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
		int N = 6;
		int count=0;
		for(int i=1;i<=N;i++){
		   count+=setBitCount(i); 
		}
		System.out.println("count->"+count);
	}
}
