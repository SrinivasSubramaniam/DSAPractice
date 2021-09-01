package onspot;

import java.util.Arrays;

import org.junit.Test;

public class TowerHeight {
	
	/*
	 * Given heights of n towers and a value k. We have to either increase or
	 * decrease height of every tower by k (only once) where k > 0. The task is
	 * to minimise the difference between the heights of the longest and the
	 * shortest tower after modifications, and output this difference.
	 * 
	 * arr[] = {1, 15, 10}, k = 6 Output : Maximum difference is 5. 
	 * Explanation: We change 1 to 7, 15 to 9 and 10 to 4. 
	 * Maximum difference is 5 (between 4 and 9). 
	 * We can't get a lower difference.
	 * 
	 * 
	 * Pseudo code
	 * Sort the array 
	 * Create two pointers one with lowest and one with highest by adding k values
	 * find the difference between first and last
	 * iterate the index from 0 to last-1 index
	 * for each index 
	 * 			--> add the index with k and compare with max to find current max
	 * 			--> subtract the index+1 -k and compare with min to find the current min
	 * Subtract current max and current min to find the minimum difference
	 * return minimum difference
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
