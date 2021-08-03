package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P39_MinimumSizeSubArray {
	/*
	 * A subarray is defined as a non-empty contiguous sequence of elements in
	 * an array. A subarray sum is the sum of all elements in the subarray.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,1,3], k = 4 Output: 3 Explanation: The subarrays of
	 * [2,1,3] are: - [2] with sum 2 - [1] with sum 1 - [3] with sum 3 - [2,1]
	 * with sum 3 - [1,3] with sum 4 - [2,1,3] with sum 6 Ordering the sums from
	 * smallest to largest gives 1, 2, 3, 3, 4, 6. The 4th smallest is 3.
	 * Example 2:
	 * 
	 * Input: nums = [3,3,5,5], k = 7 Output: 10 Explanation: The subarrays of
	 * [3,3,5,5] are: - [3] with sum 3 - [3] with sum 3 - [5] with sum 5 - [5]
	 * with sum 5 - [3,3] with sum 6 - [3,5] with sum 8 - [5,5] with sum 10 -
	 * [3,3,5], with sum 11 - [3,5,5] with sum 13 - [3,3,5,5] with sum 16
	 * Ordering the sums from smallest to largest gives 3, 3, 5, 5, 6, 8, 10,
	 * 11, 13, 16. The 7th smallest is 10.
	 * 
	 * 
	 * 
	 * 1)What is the input(s)? - integer array What is the expected output?
	 * -integer integer Do I have constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [1,1,1,2,2,3] Negative data-[5,5,5,5] Edge Case-
	 * [2,2,4,4,6,6,6]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Two pointer
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
    public void Test1(){
    	int[] nums={2,1,3};
    	int target=4;
    	System.out.println(minSizeSubArray(nums, target));
    	Assert.assertEquals(minSizeSubArray(nums, target),3);
    }
	@Test
    public void Test2(){
    	int[] nums={3,3,5,5};
    	int target=7;
    	System.out.println(minSizeSubArray(nums, target));
    	Assert.assertEquals(minSizeSubArray(nums, target),10);
    }
	 
	    
	    private int minSizeSubArray(int[] nums,int target) {
	    	List<Integer> list=new ArrayList<Integer>();
	    	for (int i = 0; i < nums.length; i++) {
	    		int sum=nums[i];
	    		list.add(sum);
				for (int j = i+1; j < nums.length; j++) {
					sum+=nums[j];
					list.add(sum);
				}
			}
	    	Collections.sort(list);
	    	return list.get(target-1);	    	
	    }
}
	    
	    
	    
	    
	
