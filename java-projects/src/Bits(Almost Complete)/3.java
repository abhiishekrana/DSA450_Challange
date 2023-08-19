/******************************************************************************

Given two numbers A and B. Write a program to count the number of bits needed to be flipped to convert A to B. 
Input: A = 10, B = 20
Output: 4
Explanation: Binary representation of A is 00001010
Binary representation of B is 00010100
We need to flip highlighted four bits in A to make it B.

Input: A = 7, B = 10
Output: 3
Explanation: Binary representation of A is 00000111
Binary representation of B is 00001010
We need to flip highlighted three bits in A to make it B.

*******************************************************************************/
public class Main
{
    static int countSetBits(int n){
        int count =0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
    static int flippdBits(int a, int b){
       return countSetBits(a^b);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int A=10;
		int B=20;
		System.out.println(flippdBits(A,B));
	}
}
