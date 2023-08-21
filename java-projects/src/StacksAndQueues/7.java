
/****************************************************
Reverse the Words of a String using Stack

Input: str = “I Love To Code” 
Output: Code To Love I
Input: str = “data structures and algorithms” 
Output: algorithms and structures data 

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Stack<String> stc =  new Stack<>();
		String inp = "data structures and algorithms";
		String temp = "";
		for(int i=0;i<inp.length();i++){
		    if(inp.charAt(i)==' '){
		        stc.add(temp);
		        temp="";
		    }else{
		        temp=temp+inp.charAt(i);
		    }
		}
		stc.add(temp);
		while(!stc.isEmpty()){
		    String val = stc.peek();
		    System.out.print(val+" ");
		    stc.pop();
		}
	}
}