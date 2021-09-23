package kandane;

import org.junit.Assert;
import org.junit.Test;

public class MaxSumCircularArray918 {
	
	@Test
	public void test1(){
		int[] nums={1,-2,3,-2};
		Assert.assertEquals(3,findMaxSum(nums));
		
	}
	@Test
	public void test2(){
		int[] nums={-1,-2,-3};
		Assert.assertEquals(3,findMaxSum(nums));
		
	}
	@Test
	public void test3(){
		int[] nums={5,-3,5};
		Assert.assertEquals(3,findMaxSum(nums));
		
	}
	/*
	 * Kandane
	 *create minSum, WindowMinSum, MaxSUm, WindowMaxSum
	 *if array is not circular use kandane and find maxSum
	 *if array is ciruclar
	 *		-> find min sum, maxsum, total sum
	 *		-> return max of max sum and totalSum-MinSUm
	 *
	 *Time Complexity- O(n)
	 *Space Complexity- O(1)
	 *
	 *Time taken
	 *Psuedo code- 15 Mins
	 *Code- 15 Mins
	 *Debug - 10 Mins
	 * 
	 */

	private int findMaxSum(int[] nums) {
int maxSum=nums[0],minSum=nums[0],totalSum=nums[0],windowMinSum=nums[0],windowMaxSum=nums[0];
        
        for (int i=1;i<nums.length;i++){
            totalSum+=nums[i];
            windowMinSum=Math.min(windowMinSum+nums[i],nums[i]);
            minSum=Math.min(minSum,windowMinSum);
            windowMaxSum=Math.max(windowMaxSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,windowMaxSum);
        }
        if (maxSum>0)
            return Math.max(maxSum,totalSum-minSum);
        else 
            return maxSum;
	}

}
