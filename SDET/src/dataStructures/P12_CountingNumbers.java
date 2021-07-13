package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P12_CountingNumbers {

	/*
	 *Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr
	 *. If there are duplicates in arr, count them separately.
	 
		Input: arr = [1,2,3]
		Output: 2
		Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
		Example 2:
		
		Input: arr = [1,1,3,3,5,5,7,7]
		Output: 0
		Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
		Example 3:
		
		Input: arr = [1,3,2,3,5,0]
		Output: 3
		Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
		Example 4:
		
		Input: arr = [1,1,2,2]
		Output: 2
		Explanation: Two 1s are counted cause 2 is in arr.
		Example 5:
		
		Input: arr = [1,1,2]
		Output: 2
		Explanation: Both 1s are counted because 2 is in the array.
	         * 1) Did I understand the problem? Yes or No !! - Yes 
	         * -> If No, Ask the person to provide more detail with example(s) 
	         * -> If yes, go to next step !!
	         * 
	         * What is the input(s)? - integer Array
	         * What is the expected output? - integer
	         * Do I have constraints to solve the problem? -  Array can be in any unsorted array
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
	         *    1.Using Brute Force-O(n^2)
	         *    2.Using set 2 passs- O(2n)
	         *    3.Using set 1 pass- O(n)
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
	public void testData1()
	{
		int[] num={1,2,3};
		System.out.println(countingNumbersUsingSinglePass(num));
		Assert.assertEquals(2, countingNumbersUsingSinglePass(num));
		
	}
	
	
	@Test
	public void testData2()
	{
		int[] num={1,1,3,3,5,5,7,7};
		System.out.println(countingNumbersUsingSinglePass(num));
		Assert.assertEquals(0, countingNumbersUsingSinglePass(num));
		
	}
	
	
	@Test
	public void testData3()
	{
		int[] num={1,3,2,3,5,0};
		System.out.println(countingNumbersUsingSinglePass(num));
		Assert.assertEquals(3, countingNumbersUsingSinglePass(num));
		
	}
	
	@Test
	public void testData4()
	{
		int[] num={1,1,2,2};
		System.out.println(countingNumbersUsingSinglePass(num));
		Assert.assertEquals(2, countingNumbersUsingSinglePass(num));
		
	}
	@Test
	public void testData5()
	{
		int[] num={1,1,2};
		System.out.println(countingNumbersUsingSinglePass(num));
		Assert.assertEquals(2, countingNumbersUsingSinglePass(num));
		
	}
	
	/*
	 * Psuedo code
	 * 1. Initialize counter variable to be 0
	 * 2. Use Outer For loop to traverse through the array
	 * 3. Use inner For loop to compare with each elements
	 * 4. Check if the next value is equal to i+1 and i!=j then increment the counter,break the loop
	 * 5. Reutrn couner
	 * 
	 * Time complexity ->O(n^2)
	 * Space Compelxity -> O(1)
	 */
	
	public int countingNumbers(int[] num) {
		if (num.length < 2) return 0;
		int counter = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (i != j && num[j] == num[i] + 1) {
					counter++;
					break;
				}
			}
		}
		return counter;
	}
	
	/*
	 * Psuedo code
	 * 1. Return 0 if the length is <2
	 * 2. Create a set to compare the values
	 * 3. Initialize a counter variable to 0
	 * 4. Traverse the array and put it in a set
	 * 5. Traverse the array and check with set if i equals n[i]+1 then increment the counter
	 * 6. return counter
	 * 
	 * Time complexity ->O(n)
	 * Space Compelxity -> O(n)
	 */
	
	public int countingNumbersUsingSet(int[] num) {
		if (num.length < 2) return 0;			
		Set<Integer> set = new HashSet<Integer>();
		int counter = 0;
		for (int i : num) {
			set.add(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			if (set.contains(num[i] + 1)) {
				counter++;
			}
		}
		return counter;
	}
	
	/*
	 *1) Sort the array
	 *2) Initialize the counter variable and create a set
	 *3) Traverse through the array from the reverse order 
	 *4) Put each element in a set and check if it contains x+1 value
	 *5) If it contains then increment using counter
	 *
	 *Time Complexity - O(n log(n)) + O(2n) -->O (n log n)
	 *Space Complextiy- O(n)
	 */
	
	public int countingNumbersUsingSinglePass(int[] num1)
	{
		if (num1.length<2) return 0;
		Arrays.sort(num1);//O(n log(n))
		Set<Integer> set =new HashSet<Integer>();
		int counter=0;
		for (int i = num1.length-1; i >=0; i--) { //O(n)
			set.add(num1[i]); //O(n)
			if (set.contains(num1[i]+1)) counter++; //O(n)
			

		}

		return counter;
	}


}
