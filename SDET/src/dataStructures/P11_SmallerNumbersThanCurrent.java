package dataStructures;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class P11_SmallerNumbersThanCurrent {

		/*
		 * Given the array nums, for each nums[i] find out how many numbers in the
		 * array are smaller than it. That is, for each nums[i] you have to count
		 * the number of valid j's such that j != i and nums[j] < nums[i]. Return
		 * the answer in an array.
		 * Input: nums = [8,1,2,2,3]
		 * Output: [4,0,1,1,3]
		 * 
		 * 
         * 1) Did I understand the problem? Yes or No !! - Yes 
         * -> If No, Ask the person to provide more detail with example(s) 
         * -> If yes, go to next step !!
         * 
         * What is the input(s)? - integer array
         * What is the expected output? - integer array
         * Do I have constraints to solve the problem? -  
         * 2 <= nums.length <= 500
         * 0 <= nums[i] <= 100
         * Array can be unsorted array and it can contain duplicates
         * 
         * Do I have all informations to go to next step!!
         * How big is your test data set will be?
         *
         *
         *2) Test Data Set
         *  Minimum of 3 data set !! Positive, Edge and Negative
         *  Validate the data set with the interviewer 
         *
         *3) Do I know how to solver it?
         *    Yes - great, Is there any alternate solution?- Using Bruteforce and set
         *    No - Can I break down the problem to sub problems?
         *
         *4) Ask for the hint (If you don't know how to solve it)
         *
         *
         *5) Do I know alternate solution to solve this problem?
         *6) If you know alternate solutions-> find out the O notations (performance)
         *  Then explain the both or the best (depends on the time)
         *  BruteForce -> Time complexity -> O(n^2), Space Complexity -> O(n)
         *  Set-> Time Complexity-> O(n) two pass, Space Complexity-> O(n)
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
		int[] num={6,5,4,8};
		Assert.assertArrayEquals(new int[] {2,1,0,3},smallerNumbersUsingArray(num));


	}
	@Test
	public void testData2()
	{
		int[] num={6,6,7};
		Assert.assertArrayEquals(new int[] {0,0,2},smallerNumbersUsingArray(num));
	}
	@Test
	public void testData3()
	{
		int[] num={8,1,2,2,3};
		Assert.assertArrayEquals(new int[] {4,0,1,1,3},smallerNumbersUsingArray(num));
	}
	
	/*Psuedo Code
	 * 1) Create an another output array with same length to store the occurences which are less than each element
	 * 2) Traverse the for loop and initialize the counter variable
	 * 3) Traverse the for loop and check if the n[j]>n[i] and n[i]!=n[j]
	 * 4) store the counts of each value at the end of the second loop
	 * 5) Return the counter
	 * 
	 */
	
	public int[] smallerNumbersCount(int[] num)
	{
		int[] output=new int[num.length];
		for (int i = 0; i < output.length; i++) {
			int counter=0;
			for (int j = 0; j < output.length; j++) {
				if (num[i]!=num[j]&&num[i]>num[j]) counter++;
			}
			output[i]=counter;
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
	
	/*
	 * Psuedo Code
	 *1) Arrays sort
	 *2) Create an another output array with same length to store the occurrence which are less than each element
	 *3) Create counter variable to know the counts and assign 0 to num[0]
	 *4) Traverse the input array
	 *5) Increase the counter variable
	 *6) Check if the current number is != previous number and assign the counter variable to output [i]
	 *7) Else assign the output i-1 value to i
	 *5) return the array
	 *
	 *Time Complexity -> n log n
	 *Space Complexity -> O(n)
	 */
	
	private int[] smallerNumbersCountUsingBrute(int[] num)
	{

		Arrays.sort(num);
		int[] output=new int[num.length];
		int counter=0;
		for (int i = 1; i < output.length; i++) {
			counter++;
			if (num[i]!=num[i-1])output[i]=counter;
			else output[i]=output[i-1];				
			
		}
		
		System.out.println(Arrays.toString(output));
		return output;
		
	}
	
	/*
	 * Psuedo code
	 * 1.Create a new array with size 101 to store the count values which are less than the current number
	 * 2.Traverse the array and increment the corresponding count [n[i]+1] value--> for n[1]==n[2]++
	 * 3.Now traverse the count array do the sum with the previous n[i-1] which will --> 1-->0 (count) 2-->1 (count)
	 * 4.Now traverse the input array and for n[i] store the value which is thre in count[n[i]]
	 * 5.Return the input array
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity - O(498)
	 */
	
	private int[] smallerNumbersUsingArray(int[] num)
	{
		int[] count = new int[101];
        for(int i=0; i<num.length; i++)
        {
        	count[num[i]+1]++;
        }

        for(int i=1; i<101; i++) 
        {
        	count[i] += count[i-1];
        }
        
        for(int i=0; i<num.length; i++)
        {
        	num[i] = count[num[i]];
        }
        System.out.println(Arrays.toString(num));
        
        return num;
	}

}
