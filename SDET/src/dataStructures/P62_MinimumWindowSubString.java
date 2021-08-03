package dataStructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.soap.Node;

import org.junit.*;


public class P62_MinimumWindowSubString {
	/*
	 * Given two strings s and t of lengths m and n respectively, return the
	 * minimum window substring of s such that every character in t (including
	 * duplicates) is included in the window. If there is no such substring,
	 * return the empty string "".
	 * 
	 * The testcases will be generated such that the answer is unique.
	 * 
	 * A substring is a contiguous sequence of characters within the string.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "ADOBECODEBANC", t = "ABC" Output: "BANC" Explanation: The
	 * minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
	 * Example 2:
	 * 
	 * Input: s = "a", t = "a" Output: "a" Explanation: The entire string s is
	 * the minimum window. Example 3:
	 * 
	 * Input: s = "a", t = "aa" Output: "" Explanation: Both 'a's from t must be
	 * included in the window. Since the largest window of s only has one 'a',
	 * return empty string.
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - String, String What is the expected output?
	 * -String Do I have constraints to solve the problem? - Do I have all
	 * informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- Negative data- Edge Case-
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
        String str="ADOBECODEBANC"; /// B-2 String Map , Target B-1
        String target="ABC";
        System.out.println(findXUsingMap(str, target));
        
    }
	@Test
    public void test2(){
        String str="ADOBECODEBANM";
        String target="ABC";
        System.out.println(findXUsingMap(str, target));
        
    }
	@Test
    public void test3(){
        String str="ADOBECCODEBANM";
        String target="ABCC";
        System.out.println(findXUsingMap(str, target));
        
    }
	
	/*
	 * Psuedo code
	 * Create a dictionary map to store the target occurrences
	 * Create a wordMap to store the word occurrences
	 * Initialize a left,right,frequency and minimum variable and String varaible
	 * Iterate through the target string and store the occurences
	 * Do a while loop till right is less than the length
	 * Check whether the string contains the right pointer in dictionary map
	 * if wordMap already has it increase the freq when the count is more
	 * If not add the occurences +1
	 * Else put the occurences as one and increment the frequency
	 * When the freq is equal to the target length
	 * do w while loop to check if the word map doesn't contain that character at left pointer or if the wordmap occurence is more than target Map
	 * Also check if the wordMap conatins left pointer and word map left pointer occurence is more than dict Map decrement the occurence
	 * then increment the left pointer
	 * Check if right -left is smaller then store it in the minString variable
	 * finally increment the right pointer
	 * 
	 *Time complexity- O(n)
	 *Space complexity- O(n)
	 * 
	 * 
	 */
	
	
	private String findXUsingMap(String str, String target) {
		
        HashMap<Character, Integer> dictMap = new HashMap<>();
        HashMap<Character, Integer> wordMap = new HashMap<>();
        int frequency = 0,right=0,left=0;
        int min = Integer.MAX_VALUE;
        String minString = "";
        for (int i = 0; i < target.length(); i++) {
        	dictMap.put(target.charAt(i),dictMap.getOrDefault(target.charAt(i), 0)+1);
        }
        
        while (right < str.length()) {
            if (dictMap.containsKey(str.charAt(right))) {
                if (wordMap.containsKey(str.charAt(right))) {
                    if (wordMap.get(str.charAt(right)) < dictMap.get(str.charAt(right))) frequency++;                        
                    wordMap.put(str.charAt(right), wordMap.get(str.charAt(right)) + 1);
                } else {
                	frequency++;
                    wordMap.put(str.charAt(right), 1);
                }
            }
            if (frequency == target.length()) {
                while (!wordMap.containsKey(str.charAt(left)) || wordMap.get(str.charAt(left)) > dictMap.get(str.charAt(left))) {
                    if (wordMap.containsKey(str.charAt(left)) && wordMap.get(str.charAt(left)) > dictMap.get(str.charAt(left)))
                        wordMap.put(str.charAt(left), wordMap.get(str.charAt(left)) - 1);
                    left++;
                }
                if (right - left + 1 < min) {
                	min = right - left + 1;
                    minString = str.substring(left, right + 1);
                }
            }
            right++;
        }
        //System.out.println(minString);
        return minString;
    }
	
	/*Psuedo code
	 * initialize a hash map to store the target map 
	 * Iterate through the target string and store the values in it
	 * Iterate through the string and store until the value reaches the target counter
	 * until all the target values are stored and consider it as starting window
	 * do a while loop to check if the right is less than the length
	 * decrement the left pointer until the frequency count is less than the target frequency
	 * check if the new character is containing in the target map then increment frequency
	 * delete the 
	 * 
	 */
	private String findX(String str,String target){
		int left=0,right=0;
		Map<Character, Integer> targetMap=new HashMap<Character, Integer>();
		Map<Character, Integer> wordMap=new HashMap<Character, Integer>();
		for (int i = 0; i < target.length(); i++) {
			targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i),0)+1);			
		}
		int frequency=0;
		while (frequency<targetMap.size()) {
			if (targetMap.containsKey(str.charAt(right))){
				frequency++;
			}
			wordMap.put(str.charAt(right), wordMap.getOrDefault(str.charAt(right++),0)+1);			
		}
		String minSubString = str.substring(left, right);
		int minLength=minSubString.length();
		System.out.println("target map is " + targetMap);
		System.out.println("word map is " +wordMap);
		System.out.println("frquencey is " + frequency);
		System.out.println("inital min subString is "+ minSubString);
		while (right<str.length()){
			if(frequency==targetMap.size()){
				if (right-left<minLength){
					minLength=right-left;
					minSubString=str.substring(left, right);
					}
				while (frequency==targetMap.size()||!targetMap.containsKey(str.charAt(left))){
				if (targetMap.containsKey(str.charAt(left))){
					if (wordMap.get(str.charAt(left))==1){
						frequency--;
						wordMap.remove(str.charAt(left++));
					}
					else wordMap.put(str.charAt(left), wordMap.getOrDefault(str.charAt(left++),0)-1);
				}else if (wordMap.get(str.charAt(left))==1) wordMap.remove(str.charAt(left++));
				else wordMap.put(str.charAt(left), wordMap.getOrDefault(str.charAt(left++),0)-1);
					
				}
				if (right-left<minLength){
					minLength=right-left;
					minSubString=str.substring(left, right);
					}
			}
			if (targetMap.containsKey(str.charAt(right))&& !wordMap.containsKey(str.charAt(right))) frequency++;
			wordMap.put(str.charAt(right), wordMap.getOrDefault(str.charAt(right++), 0)+1);
		}
		System.out.println("last min Sub Strin is"+minSubString);
		return str;
	}
	
}
