package onspot;

import java.util.Stack;

import org.junit.Test;

public class KadjacentRemoval {
	
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
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

	@Test
	public void test1() {
		String s="abcd";
		int k=2;
		findX(s,k);

	}
	@Test
	public void test2() {
		String s="deeedbbcccbdaa";
		int k=3;
		findX(s,k);

	}
	/*
	 * Psuedo code
	 * Create a character stack and count stack to hold the values
	 * push the first character and count 1 to both the stacks
	 * Iterate the String
	 * 			-> peek and see if the adjacent value is same
	 * 					--> if same then push peek and do +1 in the count stack
	 * 					--> if the count is equal to k, pop the values k times in character and count stack
	 * 			--> else push to character stack and put +1 to count stack
	 * Pop the stack and return in the string
	 * 
	 * 
	 */

	private String findX(String s, int k) {
		Stack<Character> charStack=new Stack<Character>();
		Stack<Integer> countStack=new Stack<Integer>();		
		for (int i=0;i<s.length();i++){			
			if (!charStack.isEmpty() && charStack.peek()==s.charAt(i)){
				charStack.push(s.charAt(i));
				countStack.push(countStack.peek()+1);
				if (countStack.peek()==k){
					int temp=k;
					while (temp-->0){
						charStack.pop();
						countStack.pop();
					}	
				}
			}else{
				charStack.push(s.charAt(i));
				countStack.push(1);
			}
		}
		StringBuilder sbr=new StringBuilder();
		while(!charStack.isEmpty()){
			sbr.append(charStack.pop());
		}
		System.out.println(sbr.reverse().toString());		
		return s;
		
	}
	/*Pseudo code
	 * 
	 * Create a hashMap to store the values
	 * Create a string builder to 
	 * 
	 * 
	 * 
	 */
	
	private String findXMap(String s, int k) {
		return s;
		
	}


}
