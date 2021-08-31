package onspot;

import java.util.Arrays;

import org.junit.Test;

public class TowerHeight {
	
	/*
	 * Sort the array
	 * Create two pointers one with lowest and one with highest
	 * add the k if the value is lower and delete if the value is higher
	 *  
	 * 
	 */
	
	@Test
	public void test1(){
		int[] nums={1,10,15};
		int k=6;
		System.out.println(findX(nums,k));
	}
	@Test
	public void test2(){
		int[] nums={1,5,15,10};
		int k=3;
		System.out.println(findX(nums,k));
	}
	@Test
	public void test3(){
		int[] nums={4, 6};
		int k=10;
		System.out.println(findX(nums,k));
	}
	@Test
	public void test4(){
		int[] nums={6, 10};
		int k=3;
		System.out.println(findX(nums,k));
	}
	@Test
	public void test5(){
		int[] nums={1, 10, 14, 14, 14, 15};
		int k=6;
		System.out.println(findX(nums,k));
	}
	@Test
	public void test6(){
		int[] nums={1, 2, 3};
		int k=2;
		System.out.println(findX(nums,k));
	}

	private int findX(int[] nums, int k) {
		Arrays.sort(nums);
		int outPut = nums[nums.length - 1] - nums[0];
		int min = nums[0] + k;
		int max = nums[nums.length - 1] - k;
		for (int i = 0; i < nums.length - 1; i++) {
			int addMax = Math.max(max, nums[i] + k);
			int subtractMin = Math.min(min, nums[i + 1] - k);
			outPut = Math.min(outPut, addMax - subtractMin);
		}
		return outPut;

	}

}
