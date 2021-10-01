package sdetMockInterview;

import java.util.Arrays;

import org.junit.*;

public class BadNumbers {
	@Test
	public void test1(){
		int lower=50;
		int upper=59;
		int[] nums={37,7,22,15,49,60};
		Assert.assertEquals(10, findLargestGoodNum(nums,lower,upper));
	}

	private int findLargestGoodNum(int[] nums, int lower, int upper) {
		int max=Integer.MIN_VALUE;
		Arrays.sort(nums);
		int left=lower,index=0;
		while (lower>nums[index]){
			index++;
		}
		for (int right=lower; right<=upper;right++){
			if (nums[index]==right){
				index++;
				left=right+1;
			}
			max=Math.max(max,right-left+1);
		}
		return max;
	}

}
