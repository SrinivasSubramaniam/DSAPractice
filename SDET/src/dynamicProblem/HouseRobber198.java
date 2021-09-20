package dynamicProblem;

import org.junit.*;

public class HouseRobber198 {
	@Test
	public void test1(){
		int[] nums={1,2,3,1};
		Assert.assertEquals(4,findMaxMoney(nums));
	}
	@Test
	public void test2(){
		int[] nums={2,1,1,2};
		Assert.assertEquals(4,findMaxMoney(nums));
	}

	/*Pseudo code
	 * if length is 1 return 0 index value
	 * if length is 2 return the max value in index 0 and 1
	 * create an sum array to hold the max money that can be robber
	 * assign 0th index with 0 the value
	 * assign 1st index with max of 0 and 1 index value
	 * iterate the loop from 2 till length
	 * Add ith value i-2 of sum value
	 * Calculate max of i-1 value and the above value and assign to max
	 * return the last value in sum array
	 * 
	 * Time Complexity- O(n)
	 * Space Complexity- O(n)
	 * 
	 * Time to solve
	 * Logic - 25 mins
	 * Pseudo code - 15 mins
	 * Code- 15 mins
	 * Debug-5 mins
	 * 
	 * 
	 * 	
	 */
	private int findMaxMoney(int[] nums) {
		if (nums.length==1) return nums[0];
		if (nums.length==2) return Math.max(nums[0], nums[1]);
		int[] sum=new int[nums.length];
		sum[0]=nums[0];
		sum[1]=Math.max(nums[0], nums[1]);
		for(int i=2;i<nums.length;i++){
			sum[i]=Math.max(nums[i]+sum[i-2], sum[i-1]);
		}
		return sum[nums.length-1];
	}
}
