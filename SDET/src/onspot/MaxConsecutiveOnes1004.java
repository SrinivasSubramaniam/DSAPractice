package onspot;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class MaxConsecutiveOnes1004 {
	@Test
	public void test1(){
		int[] nums={1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		Assert.assertEquals(6,maxConsecutive(nums,k));
	}
	@Test
	public void test2(){
		int[] nums={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		Assert.assertEquals(10,maxConsecutive(nums,k));
	}
	@Test
	public void test3(){
		int[] nums={0,0,1,1,1,0,0};
		int k=0;
		Assert.assertEquals(3,maxConsecutive(nums,k));
	}
	@Test
	public void test4(){
		int[] nums={0,0,0,0};
		int k=0;
		Assert.assertEquals(0,maxConsecutive(nums,k));
	}
	
	
	/*Psuedo code
	 * 
	 * Create a max variable to hold the max ones
	 * iterate the outer loop with value 0
	 * create a temp variable to hold the k value
	 * iterate the inner from with value of i
	 * 
	 * if the value is 0 then decrement the temp variable
	 * if the temp variable is not equal to -1
	 * 		-> Calculate the max  difference by subtracting j-i+1
	 * if value is less than -1 break
	 * 
	 * Time complexity - O(N)
	 * Space Complexity - O(1)
	 * 
	 */
	

	private int findConsecutiveOnes(int[] nums, int k) {
		int max=0;
		for (int i=0;i<nums.length;i++){
			int count=k;
			for (int j=i;j<nums.length;j++){
				if (nums[j]==0) count--;
				if (count>=0) max=Math.max(max, (j-i)+1);
				else break;				
				
			}
		}
		
		return max;
	}
	
	private int maxConsecutive (int[] nums,int k){
		int temp=k;
		int max=0;
		int left=0;

		for (int right=0;right<nums.length;right++){
			if (nums[right]==0) temp--;
			while (temp<0){
				if (nums[left] ==0) temp++;
				left++;
			}
			max=Math.max(max,right-left+1);

		}
		return max;
	}

}
