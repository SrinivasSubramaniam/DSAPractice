package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/*
 * Given an integer x, return true if x is palindrome integer.

	An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
	
 * Problem Solving Techniques :
 * 1. Do you understand the question?
 * 		Yes - Go to next step
 * 		No - Ask the person to provide more detail with example(s).
 * 
 *  ->what is the input(s)? --> based on the question, we decide to create an input
 *  	 [i.e., Palindrome program needs input as integer]
 * 	->what is the expected output? --> [boolean true or false]
 *  ->Do i have constraints to solve the problem? --> [Eg: Its based on the question or interviewer expectations such as 
 *  specific algorithms -> "O Notations" - > 1) Time Complexity 2) Space Complexity ]
 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
 *  ->How big is your test data will be? -> Eg., If input is 5 digits (10001), so the Time complexity will be O(n) 
 *  
 *  2. Test Data Set
 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
 *  ----> Positive - 1221 -> 1221
 *  ----> Negative - 1234 -> 4321
 *  ----> Edge - 120000 -> 21 
 *  -> Validate with the interviewer if the data set is fine -> its depends on the interviewer
 *  
 *  3. Do i know how to solve it?
 *  
 *  Yes - Great, is there an alternate? -> Yes
 *  No - Can i break down the problem into sub problems? -> Let's Assume, 
 *  	 If interviewer ask to solve without using string, 
 *  	 to know the integer length, in this we can't have any straight forward way
 *  then -> 1. to use while loop (if its unknown length of the integer -> iterations are unknown)
 *  		2. create a variable for and initialize as same value as input (121).
 *  		3. Create a variable for to store the reminder and initialize as 'zero'.
 *  		4. use modulus to get the reminder values (E.g., Itr 1: 121%10 = 1 Itr 2 : 12% Itr 3: 1%10 = 1)
 *  		5. assign this reminder values to the created variable (step 3)
 *  		6. compare the created variable (step 2) and input 
 *  		7. print out the output
 * 
 * 4. Ask for hint (if you do not know how to solve it?) 
 *  		-> Ask one time and thank the interviewer
 *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence 
 *  		   level to get the next question 
 *  
 * 5. Do I know alternate solutions as well?
 * 	
 * 	Yes - What are those?
 *     way of Approach to solve with the following
 *    -> Brute Force (Standard) --> recursive function, using for loop --> without considering this Time complexity and space complexity 
 *    -> inbuilt approach --> using String, Collections --> Use Time complexity and space complexity
 */



public class Program7_MaxOccurence {
	
	@Test
	public void testData1()
	{
		int[] array={6,6,2,2,2};
		System.out.println(integerPalindrome(array));
		
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
