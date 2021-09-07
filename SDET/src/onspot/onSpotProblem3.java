package onspot;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;


public class onSpotProblem3 {
	
	/*confirm if the given string as valid parenthesis
	 * *
	 */
	
	/*
	 * Psuedo code
	 * 
	 * 1. Put closing bracket to the map and opening bracket to map
	 * 2. if the character is closing and peek if the value is opening then pop
	 * 3. else return false
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1(){
		String s="{{()}}";
		Assert.assertEquals(findX(s), "Valid");
	}
	@Test
	public void test2(){
		String s="{()[]}";
		Assert.assertEquals(findX(s), "Valid");
	}
	@Test
	public void test3(){
		String s="}{}{";
		Assert.assertEquals(findX(s), "Invalid");
	}
	@Test
	public void test4(){
		String s="}{";
		Assert.assertEquals(findX(s), "Invalid");
	}


	private String findX(String s) {
		Map<Character,Character> map=new HashMap<Character,Character>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');	
		Stack<Character> stack=new Stack<Character>();	
		for (int i=0;i<s.length();i++){
			if (map.containsKey(s.charAt(i))){
				if (!stack.isEmpty() && stack.peek()==map.get(s.charAt(i))) stack.pop();
				else return "Invalid";
			}else{
				stack.push(s.charAt(i));
			}
		}
		return "Valid";
	}
	private String findXBuilder(String s){
		StringBuilder sbr=new StringBuilder();
		Map<Character,Character> map=new HashMap<Character,Character>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');	
		for (int i=0;i<s.length();i++){
			if (map.containsKey(s.charAt(i))){
				if (sbr.charAt(i-1)==map.get(s.charAt(i))) sbr.deleteCharAt(i-1);
				else return "Invalid";
			}else{
				sbr.append(s.charAt(i));
			}
		}
		return "Valid";
		
	}

}
