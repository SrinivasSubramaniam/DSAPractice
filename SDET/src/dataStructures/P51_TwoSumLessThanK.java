package dataStructures;

import java.util.Arrays;

import org.junit.*;


public class P51_TwoSumLessThanK {
	/*
	 * Given an array nums of integers and integer k, return the maximum sum
	 * such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If
	 * no i, j exist satisfying this equation, return -1.   Example 1:
	 * 
	 * Input: nums = [34,23,1,24,75,33,54,8], k = 60 Output: 58 Explanation: We
	 * can use 34 and 24 to sum 58 which is less than 60.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [10,20,30], k = 15 Output: -1 Explanation: In this case it
	 * is not possible to get a pair sum less that 15.
	 * 
	 * Solve this in less than O(n) time complexity
	 * 
	 * 
	 * 1)What is the input(s)? - What is the expected output? Do I have
	 * constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- Negative data- Edge Case-
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
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
	 *
	 *
	 *
	 * /
	 */
	@Test
    public void test1(){
        int[] input={34,23,1,24,75,33,54,8};
        int target=60;
        System.out.println(findX(input, target));
        
    }
	private int findX(int[] input,int target){
		int sum=Integer.MIN_VALUE;
		int left=0,right=input.length-1;
		Arrays.sort(input);
		while (left<right)
		{
			int tempSum=input[left]+input[right];
			if (tempSum<target){
				sum=Math.max(sum, tempSum);
				left++;
			}else right--;
		}
		return sum;
	}
}
