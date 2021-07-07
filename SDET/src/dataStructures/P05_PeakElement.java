package dataStructures;

import java.util.Arrays;

import org.junit.Test;

public class P05_PeakElement {
	
	/*
	 * Given an array of integers nums find the first duplicate number
	 * 
	 * Problem Solving Techniques :
	 * 1. Do you understand the question?
	 * 		Yes - Go to next step
	 * 		No - Ask the person to provide more detail with example(s).
	 * 
	 *  ->what is the input(s)? --> Int array
	 * 	->what is the expected output? --> integer
	 *  ->Do i have constraints to solve the problem? --> not supposed to sort
	 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
	 *  ->How big is your test data will be? -> 
	 *  
	 *  2. Test Data Set
	 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
	 *  ----> Positive - {1,2,5,6,5,7,1}
	 *  ----> Negative - {} -1
	 *  ----> Edge - {5,5,5,5} 5
	 *  -> Validate with the interviewer if the data set is fine -> its depends on the interviewer
	 *  
	 *  3. Do i know how to solve it?
	 *  
	 *  Yes - Great, is there an alternate? -> Yes
	 *  No - Can i break down the problem into sub problems? 
	 *  then -> 
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
	 *    -> Brute Force (Simple Technique) -->  
	 *    -> inbuilt approach --> List
	 *  No - Can i break down the problems into sub problems?
	 * 
	 * 6. If you know alternate solutions-> find out the O notations (performance)
	 *  Then explain the both or the best (depends on the time)
	 *  
	 *  Approach 1-> Start with the worst -> Improve to optimize -> End up with the beset
	 *  Approach 2-> Write down the options and benefits and code the best
	 *  
	 * 7. Start with the Pseudo code
	 * 
	 * 8. Implement them in the code (editor)
	 * 
	 * 9. Test against the different data set
	 * 
	 * 10. If it fails, debug them to solve it
	 */
	
	
	
	/* Psuedo code
	 * 1. Input - integer array
	 * 2. Output - Integer
	 * 3. intialize a variable to store max value and store 
	 * 4. Traverse through the array 
	 * 5. Compare the value and assign max value 
	 * 
	*/

		@Test
		public void testData1()
		{
			int[] array={1,2,3,2,3,5};
			System.out.println(maxElement(array));
			
			
		}
		
		@Test (expected=IllegalArgumentException.class)
		public void testData2()
		{
			int[] array={};
			System.out.println(maxElement(array));
			
			
			
		}
		
		@Test
		public void testData3()
		{
			int[] array={3,3,3,3};
			System.out.println(maxElement(array));
			
		}
		
		
		private int maxElement(int[] array)
		{
			
				if (array.length==0) {
					throw new IllegalArgumentException("Zero length arrays");
					
				}
				int max=array[0];
			
			for (int i = 1; i < array.length; i++) {
				
				if (array[i]>max)
				{
				max=array[i];	
				}
				
			}
			return max;			
	}
		
		/*private int peakElement(int[] array)
		{
			if (array.length==0) {
				throw new IllegalArgumentException("Zero length arrays");
				
			}
			if (array.length==1)
			{
				return array[0];
			}
			if (array[0]>array[1])
			{
				return array[0];
			}
			
			if (array[array.length-1]>array[array.length-2])
			{
				return array[array.length-2];
			}
			
		
		}*/
		
		//O(n+m)
}


