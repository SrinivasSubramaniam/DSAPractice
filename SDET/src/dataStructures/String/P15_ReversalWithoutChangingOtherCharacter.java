package dataStructures.String;

import org.junit.Test;
import org.testng.Assert;

public class P15_ReversalWithoutChangingOtherCharacter {

	/*
		Given a string s, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
		 
		Example 1:
		Input: s = "ab-cd"
		Output: "dc-ba"
		Example 2:
		Input: s = "a-bC-dEf-ghIj"
		Output: "j-Ih-gfE-dCba"
		Example 3:
		Input: s = "Test1ng-Leet=code-Q!"
		Output: "Qedo1ct-eeLg=ntse-T!"
	 * What is the input(s)? - String
	 * String What is the expected output? - String 
	 * Do I have constraints to solve the problem? - Using two pointer
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive, Edge and Negative
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? Yes - great, Is there any alternate
	 * solution?- 
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

	@Test
	public  void testData1() {
		String word="ab-cd";
		String output="dc-ba";
		Assert.assertEquals(output, reversalWithoutNonCharacters(word));

	}
	//@Test
	public  void testData2() {
		String word="a-bC-dEf-ghIj";
		String output="j-Ih-gfE-dCba";
		//revereStringUsingTwoPointer(word);
		Assert.assertEquals(output, reversalWithoutNonCharacters(word));

	}
	@Test
	public  void testData3() {
		String word="Test1ng-Leet=code-Q!";
		String output="Qedo1ct-eeLg=ntse-T!";
		//revereStringUsingTwoPointer(word);
		Assert.assertEquals(output, reversalWithoutNonCharacters(word));

	}

	/*
	 * 1) Create a char array with string
	 * 2) Calculate the left and right index value
	 * 3) Do a while loop
	 * 4) Check if the left character is not matching with the character then left++
	 * 5) Check if the right character is not matching with the character then right--
	 * 6) if (both are character) then swap the variable using temp
	 * 
	 * Time Complexity- O(n^2)
	 * Space Complexity- O(n)
	 */


	private String reversalWithoutNonCharacters(String word) {
		if (word.length()==0) throw new RuntimeException("Invalid inpurt");
		int left=0,right=word.length()-1;
		char[] output = word.toCharArray();
		while (left<right)
		{
			if (!Character.isLetter(output[left])) left++;
			if (!Character.isLetter(output[right])) right--;
			if (Character.isLetter(output[left])&&Character.isLetter(output[right]))
			{
				char temp=output[left];
				output[left++]=output[right];
				output[right--]=temp;
			}
		}
		
		return new String(output);
	}




}
