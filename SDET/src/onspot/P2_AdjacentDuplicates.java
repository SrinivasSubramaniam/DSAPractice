package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P2_AdjacentDuplicates {

	/*
	 * 
	 * You are given a string s and an integer k, a k duplicate removal consists
	 * of choosing k adjacent and equal letters from s and removing them,
	 * causing the left and the right side of the deleted substring to
	 * concatenate together. We repeatedly make k duplicate removals on s until
	 * we no longer can. Return the final string after all such duplicate
	 * removals have been made. It is guaranteed that the answer is unique.  
	 * 
	 * 
	 * 1) Input-String , integer k
	 * Output - String 
	 * Constraints- Numbers going outside 32 bit
	 * should return 0
	 *
	 * 2) Test Data
	 *
	 * Positive data - 123 Negative data - 1534236469 Edge Case -> 120
	 * 
	 * 
	 * 3)Methods to Solve-
	 * 
	 * 4)O Notations-
	 * 
	 * 5)Psuedo code
	 */
	
	/*

	 * 
	 * 
	 * Time Complexity - O (n)
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	/*
	 * Create a stack for characters and stack for character adjacent counts
	 * Iterate through the string
	 * If stack is not empty and if the previous char is same, then push the count by peek+1
	 * push the character to stack
	 * if the count peek is equal to k then iterate k times and pop char stack and count stack
	 * Pop the stack values in string builder and convert to string
	 *  
	 * 
	 */
		
	
	/*@Test
    public void test1(){
		String s="deeedbbcccbdaa";
		int k=3;
		removeDuplicate(s,k);
    }
	@Test
    public void test2(){
		String s="pbbcggttciiippooaais";
		int k=2;
		removeDuplicate(s,k);
    }
	@Test
    public void test3(){
		String s="abcd";
		int k=2;
		removeDuplicate(s,k);
    }
	@Test
    public void test4(){
		String s="kmkk";
		int k=3;
		removeDuplicate(s,k);
    }
	@Test
    public void test5(){
		String s="aaa";
		int k=3;
		removeDuplicate(s,k);
    }*/
	
	private String removeDuplicate(String s, int k) {
		//Create a stack for characters and stack for character adjacent counts
		
		Stack<Character> ch=new Stack<Character>();
		Stack<Integer> charCount=new Stack<Integer>();
		
		for(int i=0;i<s.length();i++){
			//If stack is not empty and if the previous char is same, then push the count by peek+1
			if (!ch.isEmpty() && ch.peek()==s.charAt(i)) charCount.push(charCount.peek()+1);
			else charCount.push(1);
			ch.push(s.charAt(i));
			if (charCount.peek()==k){
				for(int j=1;j<=k;j++){
					ch.pop();
					charCount.pop();
				}
			}
		}
		
		String str="";
		for(Character c:ch){
			str +=c;
		}
		System.out.println(str);
		return str;
		
	}


}
