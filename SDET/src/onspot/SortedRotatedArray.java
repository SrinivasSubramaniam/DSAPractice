package onspot;

import org.junit.Assert;
import org.junit.Test;


public class SortedRotatedArray {
	
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
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
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
		int[] nums={4,5,6,7,0,1,2};
		int target=0;
		int outPut=4;
		Assert.assertEquals(findX(nums,target), outPut);
	}
	@Test
	public void test2() {
		int[] nums={4,5,6,7,0,1,2};
		int target=3;
		int outPut=-1;
		Assert.assertEquals(findX(nums,target), outPut);
	}
	@Test
	public void test3() {
		int[] nums={1};
		int target=0;
		int outPut=-1;
		Assert.assertEquals(findX(nums,target), outPut);
	}
	@Test
	public void test4() {
		int[] nums={3,1};
		int target=1;
		int outPut=1;
		Assert.assertEquals(findX(nums,target), outPut);
		}
	/*Psuedo code
	 * if mid is equal to target return mid
	 * if mid < right then move to right
	 * 		- if target is greater than mid and target is less than or equal to right move to left to mid+1
	 * 		 else right to mid-1;
	 * else mid is greater than or equal to left move to left
	 * 		- if target is less than mid and target is greater than or equal to left move righ to mid-1
	 * 		-else left to mid+1
	 * 
	 * Time complexity - O(N log N)
	 * 
	 * 
	 */
	private int findX(int[] nums,int target) {
	
		int left=0,right=nums.length-1,mid=0;
    	if (nums.length==0) return -1;
    	while (left<=right){
    		mid=(left+right)/2;
    		if (nums[mid]==target) return mid;
    		if (nums[mid]<=nums[right]){
    		if (target>nums[mid]&&target<=nums[right]) left =mid+1;
    		else right=mid-1;
    		}
    		else if (nums[mid]>=nums[left]){
    			if (target<nums[mid]&&target>=nums[left]) right=mid-1;
    			else left=mid+1;
    		}
    	}
        return -1;
	}


}
