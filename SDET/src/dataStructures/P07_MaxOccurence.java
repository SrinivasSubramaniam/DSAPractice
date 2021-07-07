package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 *  Given an array nums of size n, return the majority element. 
 *  you may assume that the majority element always exists in the array.
 *  The majority element is the element that appears more than n/2 times. 

         * 1) Did I understand the problem? Yes or No !! - Yes 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - integer Array
         * What is the expected output? - integer
         * Do I have constraints to solve the problem? - majority element is the element that appears more than n/2 times. 
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
/*
 *  Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2] 

         * 1) Did I understand the problem? Yes or No !! - Yes 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - integer Array
         * What is the expected output? - integer
         * Do I have constraints to solve the problem? - majority element is the element that appears more than n/2 times. 
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

/*Psuedo Code
 * 1.Do a for loop with lenght/2 
 * 2.Create a count variable to get the max Occurence
 * 3.Create nested for loop and check whether i+1 element is matching the previous value
 * 4.If matching increment it
 * 5.Check if the count is more than length/2*/

/*Time Complexity O(n/2)
 *Space Complexity O(n/2)*/


public class P07_MaxOccurence {
	
	@Test
	public void testData1()
	{
		int[] array={6,6,2,2,2};
		System.out.println(integerPalindrome(array));
		Assert.assertEquals(2, integerPalindrome(array));
		
	}
	@Test
	public void testData2()
	{
		int[] array={2,2,4,4};
		System.out.println(integerPalindrome(array));
		Assert.assertEquals(-1, integerPalindrome(array));
		
	}
	@Test
	public void testData3()
	{
		int[] array={2,2,2,2};
		System.out.println(integerPalindrome(array));
		Assert.assertEquals(2, integerPalindrome(array));
		
	}
	
	/*Given an array numss of size n, return the majority element. ou may assume that the majority element always exists in the array.
	The majority element is the element that appears more than n / 2 times. */
	private int integerPalindrome(int[] array) {
		for (int i = 0; i <= array.length/2; i++) {
			int count=1;
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j])
				{
					count++;
				}
			}
			if (count>array.length/2)
			{
				return array[i];
			}
		}
		return -1;
			
		}
	

}
