package dataStructures;

import java.util.Arrays;

import org.junit.*;


public class P55_ClosestNumber {
	/*
	 *Given a Integer array and a target value, 
	 *find the closest product of 2 distinct numbers, that matches the target
	 * 
	 * 
	 * 1)What is the input(s)? - Integer array
	 * What is the expected output?  integer
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- {1,5,2,10,12,6}, target 11
	 * Negative data- 
	 * Edge Case- {3,2,2,6,8,7,1},target 18
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
	 * 
	 * 
	 * Approach 1-> Start with the worst -> Improve to optimize -> End up with
	 * the best Approach 2-> Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start with the Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 *
	 *
	 *
	 * /
	 */
	
	@Test
    public void test1(){
        int[] nums={1,5,2,10,12,7};///10    11     14
        int target=11;
        System.out.println(closestProductBruteForce(nums, target));
        Assert.assertEquals(10, closestProductBruteForce(nums, target));
        
    }
	@Test
    public void test2(){
        int[] nums={3,2,2,6,8,7,1};
        int target=18;
        System.out.println(closestProductBruteForce(nums, target));
        Assert.assertEquals(18, closestProductBruteForce(nums, target));
        
    }
	@Test
    public void test3(){
        int[] nums={};
        int target=18;
        System.out.println(closestProductBruteForce(nums, target));
        Assert.assertEquals(-1, closestProductBruteForce(nums, target));
        
    }
	
	/*
	 * Psuedo code
	 * Initialize a max and min variable
	 * iterate through two loops by iterating outer loop variable with inner loop variable
	 * multiply values at i and j and store that product in a product variable
	 * check if the product is equal to the target then return output
	 * Check if the product is less than the target
	 * Calculate max and store it in a max variable
	 * Check if the product is greater than the target
	 * calculate the min and sore it in a min variable
	 * finally return the value which has minimum difference between min, target and max, target
	 * 
	 * Time complexity- O(n^2)
	 * Space complexity - O(n)
	 * 
	 */
	private int closestProductBruteForce(int[] nums,int target){
		if (nums.length==0) return -1;//1,5,2,10,12,7
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
			int product=nums[i]*nums[j];
			if (product==target) return target;
			if (product < target) max=Math.max(max, product); // (10<11 )  max= (-1245,10)//10
			if (product > target) min=Math.min(min,product);// (14>11)   min= (267894,14)//14
			}
		}
		
		//(14-11) < (10-11)
		if (Math.abs(min-target)<Math.abs(max-target)) return min;
		else return max;
	}
	/*
	 * Pseudo code
	 * Sort the array
	 * Initialize a max , min ,left and right value
	 * check in a while loop for condition till left reaches right
	 * calculate the product by multiplying left and right values 
	 * check if the product is matching the target then return the target
	 * check if the product is less than the target then calculate max and increment left
	 * else calculate the min values and decrement the right
	 * finally return the value which has minimum difference between min, target and max, target
	 * 
	 * Time complexity - O(log n)
	 * Space complexity- O(1)
	 * 
	 */
	private int closestProductTwoPointer(int[] nums,int target){
		if (nums.length==0) return -1;
		Arrays.sort(nums);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int left=0;
		int right=nums.length-1;
		while (left<right){
			int product =nums[left]*nums[right];
			if (product==target) return target;
			if (product<target){
				max=Math.max(max, product);
				left++;
			}else{
				min=Math.min(min, product);
				right--;
			}
		}
		if (Math.abs(min-target)<Math.abs(max-target)) return min;
		return max;
	}
}
