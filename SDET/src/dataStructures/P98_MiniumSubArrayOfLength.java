package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;

public class P98_MiniumSubArrayOfLength {

	/*
	 * 
	 * 1) Input- Output - Constraints-
	 *
	 * 2) Test Data
	 *
	 * Positive data- Negative data- Edge Case-
	 * 
	 * 3)Methods to Solve-
	 * 
	 * 4)O Notations-
	 * 
	 * 5)Psuedo code
	 */

	/*
	 * 1. Simplest possible case- 0 2. Test data - 5 ,4 3. Edge case- 4.
	 * Pattern- (n-1)
	 * 
	 * 
	 * 
	 */

	@Test
	public void tes1() {
		int[] nums = { 1, 2, 5, 6, 3, 0, 3 };
		int k = 3;
		findMinSumOptimised(nums, k);
	}
	@Test
	public void tes2() {
		int[] nums = { 1, 0,1, 6, 3, 0, 3 };
		int k = 3;
		findMinSumOptimised(nums, k);
	}

	private int[] findMinSum(int[] nums,int k){
		int minSum=Integer.MAX_VALUE;
		int sum=0;
		int left=0;
		for (int i = 0; i < k; i++) {
			sum+=nums[i];
		}
		sum=Math.min(sum, minSum);
		for (int i = 0; i < nums.length-k+1; i++) {
			sum+=nums[i+k-1]-nums[i];
			if (sum<minSum){
				minSum=sum;
				left=i+1;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, left+k)));
		return Arrays.copyOfRange(nums, left, left+k);
	}
	private int[] findMinSumOptimised(int[] nums,int k){
		int minSum=Integer.MAX_VALUE;
		int sum=0;
		int left=0;
		for (int i=0;i<nums.length-k+1;i++){
			sum+=nums[i];
			if (i>=k-1){
				if (sum<minSum){
					minSum=sum;
					if (i==k-1) left=i-(k-1);
					else left=i;
				}
				sum-=nums[i];
			}
		}
		System.out.println(left);
		System.out.println(nums[left]);
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, left+k)));
		return nums;
	}

}
