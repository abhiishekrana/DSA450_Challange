// Count set bits in an integer
// Input : n = 6
// Output : 2
// Binary representation of 6 is 110 and has 2 set bits

// Input : n = 13
// Output : 3
// Binary representation of 13 is 1101 and has 3 set bits

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int N = 6;
		String s=decimalToBinary(N);
		System.out.println("ans->"+s);
		int setBits = countSetBits(s);
		System.out.println("Set Bit->"+setBits);
		System.out.println("ans->"+s.getClass().getName());
	}
	
	static String decimalToBinary(int Number){
	    StringBuilder sb = new StringBuilder();
	    while(Number>0){
	        int rem = Number%2;
	        sb.append(rem);
	        Number=Number/2;
	    }
	    return sb.reverse().toString();
	}
    static int countSetBits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return count; // Move this line outside of the for loop
    }
}

/********************************
Write an efficient program to count the number of 1s in the binary representation of an integer.

Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Input : n = 13
Output : 3
Binary representation of 13 is 1101 and has 3 set bits

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n = 6;
		int count=0;
		while(n>0){
		    count+=n&1;
		    n>>=1;
		}
		System.out.println("count->"+count);
	}
}
