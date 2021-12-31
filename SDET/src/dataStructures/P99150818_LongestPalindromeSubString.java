package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P99150818_LongestPalindromeSubString {

	/*
	 * Given an int array [1,4,20,3,10,5] and target sum 33.
If target subarray sum is found, return true else false
Time : 20 Minutes 
- Write another 2 test data (edge and neg)
- Pseudo Code for Optimised Solution
- Code, Debug
- Time everything 
- Do it yourself !! 
	 * 
	 * 
	 * 
	 *1) Input-int array
	 *	 Output - boolean
	 *	 Constraints- no
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * [1,4,20,3,10,5]
	 * target = 38
	 * 	Negative data- 
	 * [1,4,20,3]
	 * target -39
	 * 	Edge Case- 
	 * [20,3,22,1,5] 
	 * target - 23
	 * 
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * Create a two pointers with left and right as 0
	 * Create a windowSum as 0
	 * Iterate the loop for right till it reaches the end
	 * Add the sum of the current window from left to right till it reaches end
	 * if the target is found return true
	 * if the target is greater break the window
	 * After completing the iteration if the target is not found return false;
	 * 
	 * 
	 * Time Complexity - O(N)- best case
	 * O(N^2)- worst case
	 * 
	 * PsuedoCode: 6 mins
	 * Code: 6 mins
	 * Debug: 3 mins
	 * 
	 * 
	 * 
	 */
	
	
		
	
	@Test
    public void test1(){
		String s="babad";
		System.out.println(findX(s));
				
    }
	@Test
    public void test2(){
		String s="cbbd";
		System.out.println(findX(s));
				
    }
	@Test
    public void test3(){
		String s="abda";
		System.out.println(findX(s));
				
    }
	

	private String findX(String s) {
		        int left=0,right=0;
		        //create a max variable to store the output and outPut string
		        int max=Integer.MIN_VALUE;
		        String outPut="";
		        
		        //iterate till left and right reached end
		        while (left<s.length()){
		        	
		        	 if (s.charAt(left)==s.charAt(right)){
		              if ((right+1)-left>max) {
		                    max=(right+1)-left;
		                    outPut=s.substring(left,right+1);
		                }
		            }
		        	right++;
		            if (right>=s.length() && left<s.length()) {
		                right=++left;
		        }
		        }
		        
		        return outPut;
	}

}
