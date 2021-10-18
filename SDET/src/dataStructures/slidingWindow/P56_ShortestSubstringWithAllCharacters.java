	package dataStructures.slidingWindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P56_ShortestSubstringWithAllCharacters {
	/*
	 *Write a program to return the shortest substring 
	 *having all the unique characters of the string
	 * Input: "abbcafcb" Output: "bcaf"
	 * 
	 * 
	 * 1)What is the input(s)? - String
	 * What is the expected output? String
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- "abbcafcb"
	 * Negative data- ""
	 * Edge Case- "aabbccaaffabcf"
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
        String str="abbcafcb";
        String output="bcaf";
        System.out.println(shortestSubstring(str));
        Assert.assertEquals(shortestSubstring(str),output);
        
    }
	
	@Test
    public void test2(){
        String str="bbccaaff";
        String output="";
        System.out.println(shortestSubstring(str));
        Assert.assertEquals(shortestSubstring(str),output);
        
    }
	@Test
    public void test3(){
        String str="aabbccaaffabcf";
        String output="fabc";
        System.out.println(shortestSubstring(str));
        Assert.assertEquals(shortestSubstring(str),output);
        
    }
	
	
	/* Initialize a left and right variable
	 * Initialize a map to store the character and it's indices
	 * Initialize a set to store the unique characters in the string
	 * Iterate through the string and store the characters in the string
	 * Iterate through the string
	 * put the character and it's indices in the map
	 * Check if the map size is equal to the unique set size
	 * If yes calculate the shortest index
	 * check if the right subtract left size is equal to the countMap size 
	 * then return the substring between left and right
	 * 
	 * Time complexity - O(n)
	 * Space Complexity - O(2n)-> O(n)
	 * 
	 */
	
	private String shortestSubstring(String str){
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		Set<Character> countMap=new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			countMap.add(str.charAt(i));
		}		
		int left=0,right=0;
		while(right<str.length()) {
			map.put(str.charAt(right), right++);
			if (map.size()==countMap.size()){
				int minIndex = Collections.min(map.values());
				left=minIndex;		
				if (right-left==countMap.size()) return str.substring(left,right);				
			}
		}
		return "";
	}
	
	
}
