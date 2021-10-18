package dataStructures.String;

import org.junit.Test;

public class P13_StringReverseTwoPointer {

	/*
	 *Reverse a string using two pointer
	 
		String s="Hari"
		Explanation: Both 1s are counted because 2 is in the array.
	 * 1) Did I understand the problem? Yes or No !! - Yes 
	 * -> If No, Ask the person to provide more detail with example(s) 
	 * -> If yes, go to next step !!
	 * 
	 * What is the input(s)? - String
	 * What is the expected output? - string
	 * Do I have constraints to solve the problem? -  Using two pointer
	 * Do I have all informations to go to next step!!
	 * How big is your test data set will be?
	 *
	 *
	 *2) Test Data Set
	 *  Minimum of 3 data set !! Positive, Edge and Negative
	 *  Validate the data set with the interviewer 
	 *
	 *3) Do I know how to solver it?
	 *    Yes - great, Is there any alternate solution?- Using Brute Force-O(n^2)
	 *    

	 *    No - Can I break down the problem to sub problems?
	 *
	 *4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 *5) Do I know alternate solution to solve this problem?
	 *6) If you know alternate solutions-> find out the O notations (performance)
	 *  Then explain the both or the best (depends on the time)
	 *    1
	 *   
	 *  
	 *  Approach 1-> Start with the worst -> Improve to optimize -> End up with the best
	 *  Approach 2-> Write down the options and benefits and code the best
	 *  
	 *7) Start with the Pseudo code
	 * 
	 *8) Implement them in the code (editor)
	 * 
	 *9) Test against the different data set
	 * 
	 *10) If it fails, debug them to solve it        
	 */

	@Test
	public  void testData1() {
		String s="hello";
		revereStringUsingTwoPointer(s);

	}

	/*
	 * 1) Initialize one left variable with index 0 and another right counter with lenght-1
	 * 2) Use a temp character to hold a temp character
	 * 3) while (i<j)
	 * 4) In the temp assign temp=s.chart(right)
	 * 5) Assign s.charAt(right)=s.charat(left)
	 * 6) Assign s.charAt(left)=temp
	 * 7) increment left++ and decremetn--
	 * 
	 * 
	 * 
	 */


	private String revereStringUsingTwoPointer(String word) {
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('2'));
		System.out.println(Character.isAlphabetic('#'));
		System.out.println(Character.isAlphabetic('2'));
		
		int left = 0, right = word.length() - 1;
		char[] charArray = word.toCharArray();
		while (left < right) {
			char temp = charArray[right];
			charArray[right--] = charArray[left];
			charArray[left++] = temp;
		}
		System.out.println(String.valueOf(charArray));
		return new String(charArray);

	}





}
