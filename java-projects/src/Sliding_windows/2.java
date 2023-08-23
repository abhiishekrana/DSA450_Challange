/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

/****************************************************************************
Max possible two fruits in a bucket solution or Longest Subarray with Two Distinct Elements
int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
*****************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
		Map<Character,Integer> patternCount = new HashMap<>();
		String text = "ADOBECODEBANC";
        String pattern = "ABC";
		for(char c:pattern.toCharArray()){
		    patternCount.put(c,patternCount.getOrDefault(c,0)+1);
		    int left=0,right=0;
		    int minLength=Integer.MAX_VALUE;
		    String minSub = "";
		    int requiredChar=patternCount.size();
		    int formedChar = 0;
		    
		    Map<Character,Integer> windowCount = new HashMap<>();
		    while(right<text.length()){
		        char charRight = text.charAt(right);
		        windowCount.put(charRight,windowCount.getOrDefault(charRight,0)+1);
		        if(patternCount.containsKey(charRight) && windowCount.get(charRight).equals(patternCount.get(charRight))){
		            formedChar++;
		        }
		        
		        while(left<=right && formedChar==requiredChar){
		            if(right-left+1<minLength){
		                minLength=right-left+1;
		                minSub=text.substring(left,right+1);
		            }
		            char charLeft = text.charAt(left);
		            windowCount.put(charLeft, windowCount.get(charLeft) - 1);
		            if (patternCount.containsKey(charLeft) && windowCount.get(charLeft) < patternCount.get(charLeft)) {
                    formedChar--;
                }

                left++;
		        }
		        right++;
		    }
		    System.out.println("minSubstring->"+minSub);
		}
		
		
	}
}
