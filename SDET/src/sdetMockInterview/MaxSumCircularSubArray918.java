package sdetMockInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class MaxSumCircularSubArray918 {
	@Test
	public void test1(){
		int[] nums={1,2,5,-2,-3,5};
		System.out.println(maxSum(nums));
	}

	private int maxSum(int[] nums) {
		int maxSum=nums[0],windowSum=nums[0];
		for(int i=1;i<nums.length;i++){
			windowSum=Math.max(windowSum+nums[i], nums[i]);
			maxSum=Math.max(maxSum, windowSum);
		}
		System.out.println(maxSum);
		return maxSum;
	}

}
