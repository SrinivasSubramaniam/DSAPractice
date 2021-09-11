package onspot;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;

public class ValidStringParenthesisRemoval {
	
	@Test
	public void test1(){
		String str="abc(a(c)e)de)";
		findValidString(str);
	}
	@Test
	public void test2(){
		String str="a)b(c)d";
		findValidString(str);
	}
	@Test
	public void test3(){
		String str="))((";
		findValidString(str);
	}
	/*Psuedo code
	 * 
	 * push the index if the char is (
	 * 
	 * 
	 */
	private void findValidString(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		Stack<Integer> stack=new Stack<Integer>();
		StringBuilder sbr=new StringBuilder(str);
		for (int i=0;i<sbr.length();i++){
			if (sbr.charAt(i)=='(') stack.push(i);
			else if (!Character.isLetter(str.charAt(i))){
				if (!stack.isEmpty() && sbr.charAt(stack.peek())== '(') stack.pop();
				else stack.push(i);
			}
		}
		while (!stack.isEmpty()){
			sbr.deleteCharAt(stack.pop());
		}
		System.out.println(sbr);
	}

}
