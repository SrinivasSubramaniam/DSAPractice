package kandane;

import org.junit.Assert;
import org.junit.Test;

public class MaxSumCircularArray {
	
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
