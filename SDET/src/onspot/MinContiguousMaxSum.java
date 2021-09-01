package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MinContiguousMaxSum {
	/*
	 * Given an array of integers, return the minimum possible 
	 * contiguous array with maximum sum value.
	 * Examples:
	 * int[] nums = {2,4,-11,0,3,7}
	 * Output {3,7}
	 * Explanation: Sum of 3+7 is the biggest sum of all elements in the array. Though 0+3+7 gives the same value, 
	 * it is expected to return the min possible contiguous array, hence it is {3,7}
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void test1(){
		int[] nums={2,4,-11,0,3,7};
		findMin(nums);
	}
	@Test
	public void test2(){
		int[] nums={-2,-4,-11,0,-3,-7};
		findMin(nums);
	}
	@Test
	public void test3(){
		int[] nums={-2,-4,-11,4,2,-3,-7};
		findMin(nums);
	}
	

	private void findMinBrute(int[] nums) {
		int left=0;
		int right=0;
		int maxSum = Integer.MIN_VALUE;	
		for (int i=0;i<nums.length;i++){
			int tempSum=0;
			for (int j=i;j<nums.length;j++){
				tempSum+=nums[j];
				if (tempSum>maxSum){
					maxSum=tempSum;
					left=i;
					right=j;
				}
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, right+1)));
		System.out.println(maxSum);		
	}
	private void findMin(int[] nums) {
		int left=0;
		int right=0;
		int start=0,end=0;
		int maxSum = Integer.MIN_VALUE;
		int tempSum=Integer.MIN_VALUE;
		int currentSum=0;
		for (right=0;right<nums.length;right++){
			currentSum+=nums[right]; 	
			if (currentSum>=tempSum){
				if (currentSum==tempSum || currentSum<0 && nums[right]>0){
					maxSum=Math.max(maxSum, nums[right]);
					left=right;
					start=end=right;
					tempSum=Integer.MIN_VALUE;
					currentSum=nums[right];
				}else{
				tempSum=currentSum;
				if (tempSum>maxSum){
					maxSum=Math.max(maxSum,tempSum);
					start=left;
					end=right;
				}
				
				}
			}else{
				left=right;
				tempSum=Integer.MIN_VALUE;
				currentSum=nums[right];
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, start, end+1)));
		System.out.println(maxSum);
	}
	
	
	
	

}
