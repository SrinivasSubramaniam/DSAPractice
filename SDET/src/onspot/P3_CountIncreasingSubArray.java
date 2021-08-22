package onspot;

import org.junit.Test;
import org.testng.Assert;

public class P3_CountIncreasingSubArray {
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3)Methods to Solve-
	 * 
	 * 4)O Notations-
	 * 
	 * 5)Psuedo code
	 */

	/*
	
	 * 
	 * 
	 * Time Complexity - 
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		int[] nums={5,3,5,7,8};
		int k=3;
		Assert.assertEquals(countSubArray(nums,k),2);

	}
	@Test
	public void test2() {
		int[] nums={1,2,3,5,7};
		int k=3;
		Assert.assertEquals(countSubArray(nums,k),3);

	}
	@Test
	public void test3() {
		int[] nums={1,2,3,5,7};
		int k=2;
		Assert.assertEquals(countSubArray(nums,k),4);

	}

	private int countSubArray(int[] nums,int k) {
		int count=0;
		for (int i=0;i<nums.length-1;i++){
			if (nums[i+1]>nums[i]) count++;
		}
		return count-k+2;
	}


}
