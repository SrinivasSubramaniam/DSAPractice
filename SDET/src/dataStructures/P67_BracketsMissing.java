package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.*;


public class P67_BracketsMissing {
	/*
	 *Find out how many missing brackets to make a valid parentheses !!  
Input can have only open and closing brackets ( ) 
String st = “((((” -> 4 brackets  
String st = “(()))” -> 1 bracket  
	 * 
	 * 
	 * 1)What is the input(s)? - String
	 * What is the expected output? integer
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- “((((”
	 * Negative data- "{}" -->  
	 * Edge Case- "}}{{"
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
       String str="(((("; 
       Assert.assertEquals(findX(str),4);
        
    }
	@Test
    public void test2(){
       String str="{}"; 
       Assert.assertEquals(findX(str),0);
        
    }
	@Test
    public void test3(){
       String str="}}{{"; 
       Assert.assertEquals(findX(str),0);
        
    }
	
	/*Psuedo code
	 * Convert String to charArray
	 * Create a HashMap to store the brackets key and values
	 * Add brackets as key and values to the map
	 * Create a stack of characters
	 *Check if -> the character is not present in the map key
	 *		else-> if the key is present-> check whether pop the value and the value to the key is matching
	 *
	 *Return stack size which will be the missing brackets
	 * 
	 * 
	 */
	private int findX(String str){
		char[] character = str.toCharArray();
		Map<Character, Character> map=new HashMap<Character, Character>();
		map.put(')', '(');
		map.put('}', '{');
		Stack<Character> stack=new Stack<Character>();
			for (Character ch : character) {
				if (!map.containsKey(ch)) stack.push(ch);
				else if (stack.peek()==map.get(ch)) stack.pop();
				
			}
		return stack.size();		
	}
	private int findMinBrackets(String str){
		int open=0,closed=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='(') open++;
			else closed++;
		}
		return Math.abs(open-closed);
	}
}
