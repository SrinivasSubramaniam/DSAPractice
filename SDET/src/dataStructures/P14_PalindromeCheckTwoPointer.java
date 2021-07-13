package dataStructures;

import org.junit.Assert;
import org.junit.Test;



public class P14_PalindromeCheckTwoPointer {

	/*
	 * Given a string s, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 * 
	 * Example 1: Input: s = "A man, a plan, a canal: Panama" Output: true
	 * Explanation: "amanaplanacanalpanama" is a palindrome.
	 * Example 2: Input: s= "race a car" Output: false Explanation: "raceacar" is not a palindrome.
	 * 1) Did I understand the problem? Yes or No !! - Yes -> If No, Ask the
	 * person to provide more detail with example(s) -> If yes, go to next step
	 * !!
	 * 
	 * What is the input(s)? - String
	 * String What is the expected output? - boolean 
	 * Do I have constraints to solve the problem? - Using two pointer
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive, Edge and Negative
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? Yes - great, Is there any alternate
	 * solution?- Using Brute Force-O(n^2)
	 * 
	 * 
	 * No - Can I break down the problem to sub problems?
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem? 6) If you know
	 * alternate solutions-> find out the O notations (performance) Then explain
	 * the both or the best (depends on the time) 1
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
	 */

	//@Test
	public  void testData1() {
		String word="amanaplanacanalpanama";
		//revereStringUsingTwoPointer(word);
		Assert.assertEquals(true, palindromeCheckUsingTwoPointer(word));

	}
	//@Test
	public  void testData2() {
		String word="hello";
		//revereStringUsingTwoPointer(word);
		Assert.assertEquals(false, palindromeCheckUsingTwoPointer(word));

	}
	@Test
	public  void testData3() {
		String word="s";
		//revereStringUsingTwoPointer(word);
		Assert.assertEquals(true, palindromeCheckUsingTwoPointer(word));

	}

	/*
	 * 1) Replace the Non alphanumeric 
	 * 2) Calculate the left and right index value
	 * 3) Do a while loop
	 * 4) Check if the first character is not matching with the last character then return false;
	 * 
	 * Time Complexity- O(n^2)
	 * Space Complexity- O(n)
	 */


	private boolean palindromeCheckUsingReplace(String word) {
		String lowerCase = word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		if (lowerCase.length()==0) return false;
		int left=0,right=word.length()-1;
		while(left<right)
		{
			if (lowerCase.charAt(left++)!=lowerCase.charAt(right--)) return false;
		}
		return true;

	}
	
	/*
	 * 1) initialize the left index=0 right index=length-1 
	 * 2) while (i<j)
	 * 3) Check if the left index is whether !letterOrDigit then increment left++
	 * 4) Check if the left index is whether !letterOrDigit then increment right--
	 * 5) Check if both the left and right are digit and then compare if left !right then return false
	 * 5) 
	 * 
	 * Time Complexity- O(n^2)
	 * Space Complexity- O(n)
	 */

	private boolean palindromeCheckUsingTwoPointer(String word) {
		if (word.length()==0) return false;
		int left=0,right=word.length()-1;
		while (left<=right)
		{
			if (!Character.isLetterOrDigit(word.charAt(left))) left++; 
			if (!Character.isLetterOrDigit(word.charAt(right))) right--; 
			
			if (Character.isLetterOrDigit(word.charAt(left))&&Character.isLetterOrDigit(word.charAt(right)))
			{
				if (Character.toLowerCase(word.charAt(left))!=Character.toLowerCase(word.charAt(right))) return false;
				left++;
				right--;
			}
		}
		return true;
	}




}
