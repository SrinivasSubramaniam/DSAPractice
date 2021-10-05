package dataStructures.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P9914_MinimumToRemoveToMakeValidParentheses {

	/*
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * 	Negative data- 
	 * 	Edge Case-
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * 1. Simplest possible case- 0
	 * 2. Test data - 5 ,4 
	 * 3. Edge case- 
	 * 4. Pattern- (n-1)
	 * 
	 * 
	 * 
	 */
	
	@Test
    public void test1(){
        String str1="lee(t(c)o)de)";
        System.out.println(findXRecursion(str1));
    }
	@Test
    public void test2(){
        String str1="a)b(c)d";
        System.out.println(findXRecursion(str1));
    }
	@Test
    public void test3(){
        String str1="))((";
        System.out.println(findXRecursion(str1));
    }
	@Test
    public void test4(){
        String str1="(a(b(c)d)";
        System.out.println(findXRecursion(str1));
    }
	@Test
    public void test5(){
        String str1="(a(b(c)d)";
        System.out.println(findXRecursion(str1));
    }
	@Test
    public void test6(){
        String str1="())()(((";
        System.out.println(findXRecursion(str1));
    }
	/*Psuedo code
	 * 
	 * Create and initialize left with length 0 and right pointer with length
	 * Create Open and Closing bracket integer value, and character value
	 * do a for loop
	 * 		- if character is not digit 
	 * 			-	if character is open increment openBracket
	 * 			-	increment closingBracket
	 * if the Openbracket count is greater than closing bracket
	 * 		- calculate the opening bracket count
	 * 		- assign character value
	 * else if openbracket less than close bracket count
	 * 		- calculate the closing bracket count
	 * 		- assign character value
	 * else
	 * 		- replace all open and close with ""
	 * 		- return replacedsubString
	 * Create a string builder and assign string values to it
	 * do a while loop for left less than right character count greater than 0
	 * 		- if character at left is equal to char 
	 * 			- calculate substring and decrement char count
	 * 		- if character at right is equal to char and count >0
	 * 			- calculate substring and decrement char count
	 */

	private String findXRecursionNotCorrect(String str1) {
		int openBracketCount=0, closeBracketCount=0, bracketCount=0;
		char ch;
		for (int i = 0; i < str1.length(); i++) {
			if (!Character.isLetter(str1.charAt(i))){
				if (str1.charAt(i)=='(') openBracketCount++; 
				else closeBracketCount++;
				}
		}
		bracketCount= Math.abs(openBracketCount-closeBracketCount);
		if (openBracketCount==0||closeBracketCount==0) return str1.replaceAll("[^a-z]", "");
		else if (openBracketCount>closeBracketCount) ch='(';
		else if (openBracketCount<closeBracketCount) ch=')';
		else return str1.replaceAll("[^a-z]", "");
		int i=0;
		while (bracketCount>0) {
			if (!Character.isLetter(str1.charAt(i))){
				if (str1.charAt(i)==ch){
				str1=str1.substring(0, i)+str1.substring(i+1);
				bracketCount--;
				}
			}
			i++;
		}
		return str1;
	}
	/*
	 * Psuedo code
	 * 1. Create a stack
	 * 2. Iterate through the string for each characters
	 * 			- if char is open bracket -> push index to stack
	 * 			- if char is close bracket  
	 * 				- if stack is not empty and peek stack has open bracket then pop the index
	 * 				- else push index to stack 
	 * 3. Create a StringBuilder for the input string
	 * 4. Stack has invalid parenthesis index
	 * 			- Do a while loop till stack is empty
	 * 			- remove invalid parenthesis at specific index and pop the value
	 * 
	 * 
	 */
	private String findXRecursion(String str1) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '(') stack.push(i);
			else if (str1.charAt(i) == ')') {
				if (!stack.isEmpty() && str1.charAt(stack.peek()) == '(') stack.pop();
				else stack.push(i);
			}
		}
		StringBuilder sb = new StringBuilder(str1);
		while (!stack.isEmpty()) {
			sb.deleteCharAt(stack.pop());
		}
		return sb.toString();
	}
	}
