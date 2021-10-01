package dataStructures.slidingWindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.*;


public class P87_LastAnagram {
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
       String str="abdddcadca";
        String target="adc";
        lastAnagram(str, target);
        Assert.assertEquals(lastAnagram(str, target),"dca");   
    }
	@Test
    public void test2(){
       String str="abdddcadda";
        String target="add";
        lastAnagram(str, target);
        Assert.assertEquals(lastAnagram(str, target),"dda");   
    }
	/*@Test
    public void test3(){
       String str="abdddcadca";
        String target="adc";
        findX(str, target);
        Assert.assertEquals(findX(str, target),"dca");   
    }*/
	
	/*Psuedo code
	 * 
	 * 
	 */
	private String findX(String str,String target){
		Map<Character, Integer> dictMap=new HashMap<Character, Integer>();
		Map<Character, Integer> map=new HashMap<Character,Integer>();
		String tempString="";
		int left=0,right=0;
		for (int i = 0; i < target.length(); i++) {
			dictMap.put(target.charAt(i), dictMap.getOrDefault(target.charAt(i), 0)+1);			
		}
		while (right<str.length()) {
			map.put(str.charAt(right), map.getOrDefault(str.charAt(right++),0 )+1);
			if (right>target.length()) {
				if (map.get(str.charAt(left)) > 1) {
					map.put(str.charAt(left), map.getOrDefault(str.charAt(left++), 0) - 1);
				} else	map.remove(str.charAt(left++));
			}			
			if (map.equals(dictMap)) tempString = str.substring(left, right);
		}
		System.out.println(tempString);
		return tempString;
	}
	
	private String lastAnagram(String input, String target) {
		if (input.length() == 0)
			throw new RuntimeException("input string cannoto be empty");
		int[] asciiCounter = new int[128];
		int[] asciiCounterTarget = new int[128];
		String tempString = "";
		for (int i = 0; i < target.length(); i++) {
			asciiCounterTarget[target.charAt(i)]++;
		}
		int left = 0, right = 0;
		while (right < input.length()) {
			asciiCounter[input.charAt(right++)]++;
			if (right - left == target.length()) {
				if (Arrays.equals(asciiCounter, asciiCounterTarget)) {
					tempString = input.substring(left, right);
				}
				asciiCounter[input.charAt(left++)]--;

			}
		}

		return tempString;
	}
}
