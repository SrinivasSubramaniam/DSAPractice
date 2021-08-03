package dataStructures;

import org.junit.Test;
import org.testng.Assert;

public class P46_SearchInsertPosition {
	/*
	 * Given a sorted array of distinct integers and a target value, return the
	 * index if the target is found. If not, return the index where it would be
	 * if it were inserted in order. You must write an algorithm with O(log n)
	 * runtime complexity.
	 * 
	 * Example 1: Input: nums = [1,3,5,6], target = 5 Output: 2 Example 2:
	 * Input: nums = [1,3,5,6], target = 2 Output: 1 Example 3: Input: nums =
	 * [1,3,5,6], target = 7 Output: 4 Example 4: Input: nums = [1,3,5,6],
	 * target = 0 Output: 0
	 * 
	 * 
	 * 1)What is the input(s)? - integer array,integer
	 * What is the expected output? integer
	 * Do I have constraints to solve the problem? Binary search
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [1,3,5,6] , k =5 
	 * Negative data- 
	 * Edge Case- [1,3,5,6], k=2
	 * 			[1,3,5,6] k=7
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
        int[] nums={1,3,5,6};
        int target= 5;
        Assert.assertEquals(findIndex(nums,target), 2);
        
    }
	@Test
    public void test2(){
        int[] nums={1,3,5,6};
        int target= 2;
        Assert.assertEquals(findIndex(nums,target), 1);
        
    }
	@Test
    public void test3(){
        int[] nums={1,3,5,6};
        int target= 7;
        Assert.assertEquals(findIndex(nums,target), 4);
        
    }
	@Test
    public void test4(){
        int[] nums={1,3,5,6};
        int target= 0;
        Assert.assertEquals(findIndex(nums,target), 0);
        
    }
	/*Psuedo code
	 * 
	 * Declare a left,right and mid variable
	 * iterate till left is less than right
	 * Calculate and assign mid value
	 * if mid matches the target return mid as output
	 * check if mid is less than target move left next to mid
	 * else shift right to mid
	 * return left which will be insert or matching position
	 * 
	 * Time Complexity - O(log n)
	 * Space Complexity- O(1)
	 * 
	 * 
	 */
	
    private int findIndex(int[] nums,int target) {
    	int left=0,right=nums.length,mid=0;
    	while (left<right){
    		mid=(left+right)/2;
    		if (nums[mid]==target) return mid;
    		else if(nums[mid]< target) left=mid+1;
    		else right=mid;
    	}
    	return left;
        
    }
}
