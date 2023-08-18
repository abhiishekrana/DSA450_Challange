// Square root of an integer

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2.

// Input: x = 11
// Output: 3
// Explanation:  The square root of 11 lies in between 3 and 4 so floor of the square root is 3.

public class Main{
    static int floorsqrt(int x){
        if(x==0 && x==1){
            return x;
        }
        int i=1,result=1;
        while(result<=x){
            i++;
            result=i*i;
        }
        return i-1;
    }
    public static void main(String[] args){
        int x=4;
        System.out.println("x->"+floorsqrt(x));
    }
}