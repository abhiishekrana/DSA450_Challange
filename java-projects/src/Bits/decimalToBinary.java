public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int N = 6;
		String s=decimalToBinary(N);
		System.out.println("ans->"+s);
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
}