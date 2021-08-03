package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.*;

//import junit.framework.Assert;

/*
 * Given an integer x, return true if x is palindrome integer.

         * 1) Did I understand the problem? Yes or No !! - Yes 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - Integer
         * What is the expected output? - boolean
         * Do I have constraints to solve the problem? - No
         * Do I have all informations to go to next step!!
         * How big is your test data set will be?
         *
         *
         *2) Test Data Set
         *  Minimum of 3 data set !! Positive, Edge and Negative
         *  Validate the data set with the interviewer 
         *
         *3) Do I know how to solver it?
         *    Yes - great, Is there any alternate solution?
         *    No - Can I break down the problem to sub problems?
         *
         *4) Ask for the hint (If you don't know how to solve it)
         *
         *
         *5) Do I know alternate solution to solve this problem?
         *6) If you know alternate solutions-> find out the O notations (performance)
         *  Then explain the both or the best (depends on the time)
         *  
         *  Approach 1-> Start with the worst -> Improve to optimize -> End up with the beset
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



public class P06_IntegerPalindrome {
	
	@Test
	public void testData1()
	{
		int a=121;
		System.out.println(integerPalindrome(a));
		Assert.assertTrue(integerPalindrome(a));
	}
	
	@Test
	public void testData2()
	{
		int a=14445;
		System.out.println(integerPalindrome(a));
		Assert.assertEquals(false, integerPalindrome(a));
	}
	
	@Test
	public void testData3()
	{
		int a=0;
		System.out.println(integerPalindrome(a));
		Assert.assertEquals(false, integerPalindrome(a));
	}
	
	/*Psuedocode
	 * 1.create a reminder variable and assign integer value
	 * 2.create a another variable and assign 0 to it
	 * 3.Check if it is a single digit number and return false
	 * 4.In While loop check if integer value is greater than 0
	 * 5.Use Modulo operator to find the reminder add with sum of previous sum*10
	 * 6.Use division operator to find the next integer
	 * */
	
	/*Time Complexity - O(n)
	 *Space Complexity - O(1)*/
	private boolean integerPalindrome(int a) {
		
		int rem = a;
		int sum = 0;
		
		if (a>=0&&a<10) return false;

		while (rem > 0) {
			sum = (sum * 10) + (rem%10);
			rem = rem / 10;
		}

		if (sum == a) return true;
		else return false;

	}

	

}
