package dataStructures.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.*;


public class P70_StackRemoveAdjacentDuplicates {
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
       String str="abaac"; 
       Assert.assertEquals(findX(str),"abc");
        
    }
	@Test
    public void test2(){
       String str="abcd"; 
       Assert.assertEquals(findX(str),"abcd");
        
    }
	@Test
    public void test3(){
       String str="aaa"; 
       Assert.assertEquals(findX(str),"a");
        
    }
	
	
	
	private String findX(String str){
		char[] ch = str.toCharArray();
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (!stack.isEmpty() && stack.peek()==ch[i]) stack.pop();
			else stack.push(ch[i]);
		}
		while (!stack.isEmpty()){
			sb.append(stack.pop());
		}
		/*for (char chr: stack) {
			System.out.println(chr);
		}*/
		return sb.reverse().toString();
	
		
	}
}
