package dataStructures;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class P47_FindFirstAndLastPosition {
	/*
	 * Given an array of integers nums sorted in ascending order, find the
	 * starting and ending position of a given target value.
	 * 
	 * If target is not found in the array, return [-1, -1].
	 * 
	 * You must write an algorithm with O(log n) runtime complexity.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4] Example 2:
	 * 
	 * Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1] Example 3:
	 * 
	 * Input: nums = [], target = 0 Output: [-1,-1]
	 * 
	 * 
	 * 1)What is the input(s)? - integer array, integer 
	 * What is the expected output? integer array
	 * Do I have constraints to solve the problem? -Binary
	 * Search
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [5,7,7,8,8,10] , k =8 
	 * Negative data-[] target=6 
	 * Edge Case- [7,7,7,7] k=7
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
	public void test1() {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		System.out.println(Arrays.toString(findIndex(nums, target)));
		Assert.assertEquals(true, Arrays.equals(findIndex(nums, target), new int[] { 3, 4 }));
	}

	@Test
	public void test2() {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		System.out.println(Arrays.toString(findIndex(nums, target)));
		Assert.assertEquals(true, Arrays.equals(findIndex(nums, target), new int[] { -1, -1 }));
	}

	@Test
	public void test4() {
		int[] nums = { 7, 7, 7, 7, 7 };
		int target = 7;
		System.out.println(Arrays.toString(findIndex(nums, target)));
		Assert.assertEquals(true, Arrays.equals(findIndex(nums, target), new int[] { 0, 4 }));

	}
	

	@Test
	public void test3() {
		int[] nums = {};
		int target = 0;
		System.out.println(Arrays.toString(findIndex(nums, target)));
		Assert.assertEquals(true, Arrays.equals(findIndex(nums, target), new int[] { -1, -1 }));
	}
	@Test
	public void test5() {
		int[] nums = { 6, 6, 6, 7, 8 };
		int target = 7;
		System.out.println(Arrays.toString(findIndex(nums, target)));
		Assert.assertEquals(true, Arrays.equals(findIndex(nums, target), new int[] { 3, 3 }));

	}
	
	/*Psuedo code
	 * Declare a left, right and mid variable
	 * check if the array is empty then return -1,-1 as output
	 * iterate till left is less than right
	 * Calculate mid point
	 * 
	 * If array value at left is less than target then move left next to mid
	 * else shift right to mid
	 * Will get first position of target in left assign it to a new array at 0th index
	 * 
	 * reassign right to array length
	 * again check iterate right until both meets
	 * calculate mid point
	 * Here check if left value is less than or equals to target then assign left next to mid
	 * else shift right to mid
	 * Now assign right variable to array and return array
	 * 
	 * Time Complexity O(log n)
	 * Space complexity O(1)
	 * 
	 * 
	 */

	private int[] findIndex(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid = 0;
		if (nums.length == 0) return new int[] { -1, -1 };
		while (left < right) {
			mid = (left + right)/2;
			if (nums[mid] < target) left = mid + 1;
			else right = mid;
		}
		if (nums[left] != target) return new int[] { -1, -1 };
		int[] ar = new int[2];
		ar[0] = left;
		right = nums.length;
		while (left < right) {
			mid = (left+right)/2;
			if (nums[mid] <= target) left = mid + 1;
			else right = mid;
		}
		ar[1] = right - 1;
		return ar;

	}

}
    
    


