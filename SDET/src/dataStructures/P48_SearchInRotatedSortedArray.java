package dataStructures;

import org.junit.Test;
import org.testng.Assert;

public class P48_SearchInRotatedSortedArray {
	/*
	 * There is an integer array nums sorted in ascending order (with distinct
	 * values).
	 * 
	 * Prior to being passed to your function, nums is rotated at an unknown
	 * pivot index k (0 <= k < nums.length) such that the resulting array is
	 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
	 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index
	 * 3 and become [4,5,6,7,0,1,2].
	 * 
	 * Given the array nums after the rotation and an integer target, return the
	 * index of target if it is in nums, or -1 if it is not in nums.
	 * 
	 * You must write an algorithm with O(log n) runtime complexity.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 Example 2:
	 * 
	 * Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1 Example 3:
	 * 
	 * Input: nums = [1], target = 0 Output: -1
	 * 
	 * 
	 * 1)What is the input(s)? - integer array , integer
	 *  What is the expected output?- integer (index)
	 * integer Do I have constraints to solve the problem? - Binary search
	 * at least once in s Do I have all informations to go to next step!! 
	 * How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- {4,5,6,7,0,1,2} , k =0 
	 * Negative data- {1}, k=0
	 * Edge Case- 
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
        int[] nums={4,5,6,7,0,1,2};
        int target= 0;
        System.out.println(searchIndex(nums, target));
        Assert.assertEquals(searchIndex(nums,target), 4);
        
    }
	@Test
    public void test2(){
        int[] nums={4,5,6,7,0,1,2};
        int target= 3;
        System.out.println(searchIndex(nums, target));
        Assert.assertEquals(searchIndex(nums,target), -1);
        
    }
	@Test
    public void test3(){
        int[] nums={1};
        int target= 0;
        System.out.println(searchIndex(nums, target));
        Assert.assertEquals(searchIndex(nums,target), -1);
        
    }
	@Test
    public void test4(){
        int[] nums={6,7,0,1,2,4,5};
        int target= 4;
        System.out.println(searchIndex(nums, target));
        Assert.assertEquals(searchIndex(nums,target), 5);
        
    }
	@Test
    public void test5(){
        int[] nums={6,7,0,1,2,4,5};
        int target= 6;
        System.out.println(searchIndex(nums, target));
        Assert.assertEquals(searchIndex(nums,target), 0);
        
    }
	@Test
    public void test6(){
        int[] nums={5,6,7,0,1,2,3,4};
        int target= 1;
        System.out.println(searchIndex(nums, target));
        Assert.assertEquals(searchIndex(nums,target), 4);
        
    }
	
	/*Psuedo code
	 * Declare a variable left, right and mid variable
	 * If array length is 0 return -1
	 * do a iteration until left crosses right variable
	 * calculate mid point with left and right
	 * if mid matches target ,return mid as output
	 * 
	 * check if array is right sorted compare mid and right
	 * if right sorted check if the target lies between mid and right, then shift left next to mid
	 * else shift right to mid
	 * 
	 * check if the array is left sorted compare mid and left
	 * if left sorted check if the target lies between left and mid, then shift right before mid
	 * else shift left next to mid 
	 * 
	 * Time complexity  O(log n)
	 * Space complexity O(1)
	 * 
	 */
	
    private int searchIndex(int[] nums,int target) {
    	int left=0,right=nums.length-1,mid=0;
    	if (nums.length==0) return -1;
    	while (left<=right){
    		mid=(left+right)/2;
    		if (nums[mid]==target) return mid;
    		if (nums[mid]<=nums[right]){//towards right
    		if (target>nums[mid]&&target<=nums[right]) left =mid+1;
    		else right=mid-1;
    		}
    		else if (nums[mid]>=nums[left]){//towards left
    			if (target<nums[mid]&&target>=nums[left]) right=mid-1;
    			else left=mid+1;
    		}
    	}
        return -1;
    }
}
