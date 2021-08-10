package dataStructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import org.junit.*;


public class P94_QueueLongestContiguousSubArray {
	/*
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- 
	 * Negative data- 
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
        int[] nums ={8,2,4,7};
        int k=4;
        Assert.assertEquals(findX(nums, k), 2);
        
    }
	@Test
    public void test2(){
        int[] nums ={10,1,2,4,7,2};
        int k=5;
        Assert.assertEquals(findX(nums, k), 4);
        
    }
	private int findX(int[] nums,int k){
		int left=0,right=0;
		int longest=Integer.MIN_VALUE,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		while (left<nums.length&&right<nums.length){
			min=Math.min(min, Math.min(nums[left], nums[right]));
			max=Math.max(max, Math.max(nums[left], nums[right]));
			//min=Math.min(min, nums[right]);
			//max=Math.max(max, nums[right]);
			
			if (Math.abs(max-min)<=k){
				longest=Math.max(longest, right-left+1);
				right++;
			}else{
				right=++left;
				min=nums[left];
				max=nums[left];
			}
		}
		return longest;
	}
}
