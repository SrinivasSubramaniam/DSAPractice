package dataStructures;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class P16_MaximumSum {

	/*
		Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.
		 
		Example 1:
		Input: nums = [34,23,1,24,75,33,54,8], k = 60
		Output: 58
		Explanation: We can use 34 and 24 to sum 58 which is less than 60.
		Example 2:
		Input: nums = [10,20,30], k = 15
		Output: -1
		Explanation: In this case it is not possible to get a pair sum less that 15.
	 * What is the input(s)? - int array[]
	 * String What is the expected output? - integer 
	 * Do I have constraints to solve the problem? - 
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
		int[] num={34,23,1,24,75,33,54,8};
		int target=60;
		System.out.println(maximumSumUsingTwoPointer(num, target));
		//Assert.assertEquals(58, maximumSumUsingTwoPointer(num, target));
	}
	
	/*@Test
	public  void testData() {
		int[] num={10,20,30};
		int target=15;
		Assert.assertEquals(Integer.MIN_VALUE, maximumSumUsingTwoPointer(num, target));
	}*/
	

	/*
	 * Psuedo code
	 * Initialize sum with minimum value
	 * Traverse through the array with the outer for loop
	 * Traverse through the array with the inner for loop
	 * Check if i(!=)j
	 * Check if (arr[i]+arr[j]<target)
	 * sum both the values
	 * Do math.max to find the max value
	 * 
	 * 
	 * Time Complexity- O(n^2)
	 * Space Complexity- O(n)
	 */


	private int maximumSum(int[] num,int target) {
		int sum=Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (i!=j&& num[i]+num[j]<target) sum=Math.max(sum, num[i]+num[j]);
			}	
		}
		return sum;		
	}
	
	/*
	 * Psuedo code
	 * Initialize sum with minimum value
	 * Sort the array
	 * initialize left to 0 and right counter values to 1
	 * Do while loop and do tempsum = arr[i] + arr[j]
	 * chekc if tempsum < k -> sum=Math.max(max,lastsum)
	 * Do math.max to find the max value
	 * 
	 * 
	 * Time Complexity- O(n log n)
	 * Space Complexity- O(n)
	 */
	
	private int maximumSumUsingTwoPointer(int[] num, int target)
	{
		int sum=Integer.MIN_VALUE;
		int left=0,right=num.length-1;
		Arrays.sort(num);
		while (left<right)
		{
			int tempSum=num[left]+num[right];
			if (tempSum<target){
				sum=Math.max(sum, tempSum);
				left++;
			}else{
			right--;
			}
		}
		//System.out.println(sum);
		return sum;
	}
	/*private int maximumSumUsingTwoPointer(int[] num, int target)
	{
		int sum=Integer.MIN_VALUE;
		int left=0,right=num.length-1,mid;
		Arrays.sort(num);
		while (left<right)
		{
			mid=(left+right)/2;
			if (num[mid]+num[mid+1]<target) {
				sum=Math.max(sum, tempSum);
				left++;
			}
			
			right++;
		}
		return sum;
	}*/


}
