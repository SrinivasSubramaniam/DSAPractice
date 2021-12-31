package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

import bsh.StringUtil;

public class P38_PermutationString {
	/*
	 * Given two strings s1 and s2, return true if s2 contains the permutation
	 * of s1.
	 * 
	 * In other words, one of s1's permutations is the substring of s2.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s1 = "ab", s2 = "eidbaooo" Output: true Explanation: s2 contains
	 * one permutation of s1 ("ba"). Example 2:
	 * 
	 * Input: s1 = "ab", s2 = "eidboaoo" Output: false
	 * 
	 * 
	 * 1)What is the input(s)? - two Strings 
	 * What is the expected output? -true
	 * integer Do I have constraints to solve the problem? - 
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 *
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Two pointer
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
    public void Test1(){
    	String str1="ab";//k
    	String str2="eidbaooo";
    	System.out.println(permutationUsingSlidingWindow(str1, str2));    	
    }
	@Test
    public void Test2(){
    	String str1="ab";//k
    	String str2="eidboaoo";
    	System.out.println(permutationUsingSlidingWindow(str1, str2));    	
    }
	@Test
    public void Test3(){
    	String str1="";//k
    	String str2="eidboaoo";
    	System.out.println(permutationUsingSlidingWindow(str1, str2));    	
    }
	@Test
    public void Test4(){
    	String str1="adc";//k
    	String str2="dcda";
    	System.out.println(permutationUsingSlidingWindow(str1, str2));    	
    }
	/*@Test
    public void Test4(){
    	String str1="a";//k
    	String str2="ab";
    	System.out.println(permutationStringUsingTwoPointer(str1, str2));    	
    }*/
	  
	
	/* *
	 * Check if the s1 or s2 length is less than 0
	 * Check if s1 length is greater than s2
	 * Put s1 in a character array and sort
	 * Do a for loop to check 
	 * check by each substring, convert to array and sort them
	 * Now compare both the array and see if it is equal
	 * */
	 
	    
	    private boolean permutationStringBruteForce(String str1,String str2) {
	    	if (str1.length()==0||str2.length()==0||str1.length()>str2.length()) return false;
	    	int length=str1.length();
	    	char[] str1Array = str1.toCharArray();
	    	Arrays.sort(str1Array);
	    	for (int i = 0; i <= str2.length()-str1.length(); i++) {
	    		char[] subArray = str2.substring(i, i+length).toCharArray();
	    		Arrays.sort(subArray);
	    		if (Arrays.equals(str1Array,subArray)) return true;
			}
	    	
	    	return false;
	    	
	    }
	    
	    private boolean permutationUsingSlidingWindow(String str1,String str2){
	    	
	    	if (str1.length()>str2.length()) return false;
	    	if (str1.length()==0) return false;
	    	int[] count=new int[26];
	    	for (int i=0;i<str1.length();i++){
	    		count[str1.charAt(i)-'a']++;
	    		count[str2.charAt(i)-'a']--;
	    	}
	    	 //System.out.println("first for loop is "+Arrays.toString(count));
	    	if (allZero(count)) return true;
	    	 for (int i = str1.length(); i < str2.length(); i++) {
	             count[str2.charAt(i) - 'a']--;
	             count[str2.charAt(i - str1.length()) - 'a']++;
	             //System.out.println("second for loop is "+Arrays.toString(count));
	             if (allZero(count)) return true;
	         }
	    	 //System.out.println("third for loop is "+Arrays.toString(count));
	         return false;
	    	//return false;
	    	
	    }
	    
	    private boolean allZero(int[] count) {
	        for (int i = 0; i < 26; i++) {
	            if (count[i] != 0) return false;
	        }
	        return true;
	    }
	    /* *
		 * Store ascii value of str1 and str2 in a separate array
		 * do a for loop and start decrementing each character front and back
		 * Check if the both the arrays are equal then start decrementing and incrementing left and right value
		 * */
	    private boolean permutationStringUsingTwoPointer(String str1,String str2) {
	    	if (str1.length()==0||str2.length()==0||str1.length()>str2.length()) return false;
	    	int[] str1Array=new int[128];
	    	int[] str2Array=new int[128];
	    	for (int i = 0; i < str1.length(); i++) {
	    		str1Array[str1.charAt(i)]++;	
			}
	    	System.out.println(Arrays.toString(str1Array));
	    	for (int i = 0; i < str2.length(); i++) {
	    		str2Array[str2.charAt(i)]++;	
			}
	    	System.out.println(Arrays.toString(str2Array));
	    	int left=0,right=str2.length()-1;
	    	while (left<right){
	    		str2Array[str2.charAt(left)]--;
	    		str2Array[str2.charAt(right)]--;
	    		if (Arrays.equals(str1Array, str2Array)) return true;
	    		left++;
	    		right--;
	    	}
	    	return false;
	    	
	    }
	    /*
	     * Create a map and store the s1 character occurences in it
	     * Create another mapping map to store and compare the s2 string
	     * next do a for loop for s2 string till s1 length and store that in the map
	     * do a for loop till the s1 length and add the next character and remove the previous character
	     * compare the map to see if both are maching
	     * 
	     * 
	     * 
	     */
	    private boolean permutationUsingMap(String str1,String str2){
	    	if (str1.length()==0||str2.length()==0||str1.length()>str2.length()) return false;
	    	int n=str1.length();
	    	Map<Character, Integer> str1Map =new HashMap<Character,Integer>(str1.length());
	    	for (int i = 0; i < str1.length(); i++) {
	    		str1Map.put(str1.charAt(i), str1Map.getOrDefault(str1.charAt(i), 0)+1);
				
			}
	    	Map<Character, Integer> str2Map =new HashMap<Character,Integer>(str2.length());
	    	for (int i = 0; i < str1.length(); i++) {
	    		str2Map.put(str2.charAt(i), str2Map.getOrDefault(str2.charAt(i), 0)+1);
				
			}
	    	if (str1Map.equals(str2Map)) return true;
	    	
	    	for (int i = 1; i < str2.length()-str1.length(); i++) {
	    		str2Map.put(str2.charAt(i+n-1), str2Map.getOrDefault(str2.charAt(i+n-1), 0)+1);
	    		if (str2Map.containsKey(str2.charAt(i-1))) str2Map.put(str2.charAt(i-1), str2Map.get(str2.charAt(i-1))-1);
	    		else str2Map.remove(str2.charAt(i-1));
	    		if (str1Map.equals(str2Map)) return true;
	    			
	    		} 	
	    	
			return false;
	    	
	    }
	    
	    
	    
	    
	
}
