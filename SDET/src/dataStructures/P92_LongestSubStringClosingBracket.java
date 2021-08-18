package dataStructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.*;


public class P92_LongestSubStringClosingBracket {
	/*
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- 
	 * Negative data- 
	 * Edge Case-
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
	 * 
	 * 
	 * Approach 1-> Start with the worst -> Improve to optimize -> End up with
	 * the best Approach 2-> Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start with the Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 *
	 *
	 *
	 * /
	 */
	@Test
    public void test1(){
        String s="}{{}}{";
        findX(s);
        
    }
	@Test
    public void test2(){
        String s="}{}{}{";
        findX(s);
        
    }
	@Test
    public void test3(){
        String s="}{}{{}{";
        findX(s);
        
    }
	@Test
    public void test4(){
        String s="{}";
        findX(s);
        
    }
	
	
	/*Psuedo code
	 * 
	 * 
	 */
	private int findX(String s){
		if (s.length()==0) return 0;
		Stack<Integer> stack=new Stack<Integer>();
		int count=0;
		int longest=Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!='}') stack.push(i);
			else{
				if (!stack.isEmpty())stack.pop();
				if (!stack.isEmpty()){
				count=i-stack.peek();
				longest=Math.max(longest, count);				
			    }
				else{
					stack.push(i);
				}
			}
			
		}
		System.out.println(longest);
		if (longest==Integer.MIN_VALUE) return 2;
		return longest;
	}
}
