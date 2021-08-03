package dataStructures;

import org.junit.Assert;
import org.junit.Test;

public class P44_PositiveInteger {
	/*
	 * Given an array arr of positive integers sorted in a strictly increasing
	 * order, and an integer k. Find the kth positive integer that is missing
	 * from this array.   Example 1:
	 * 
	 * Input: arr = [2,3,4,7,11], k = 5 Output: 9 Explanation: The missing
	 * positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive
	 * integer is 9.
	 * 
	 * Example 2:
	 * 
	 * Input: arr = [1,2,3,4], k = 2 Output: 6 Explanation: The missing positive
	 * integers are [5,6,7,...]. The 2nd missing positive integer is 6.
	 * 
	 * 
	 * 1)What is the input(s)? - integer array,int  
	 * What is the expected output? integer
	 *  Do I have constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [2, 3, 5, 9, 10, 11, 12] , k =4
	 * Negative data-
	 * Edge Case- [1,2,3,4]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, 
	 * Is there any alternate solution?- 
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
        int[] nums={2,3,4,7,11};
        int k= 5;
        positiveInteger(nums,k);
    }
	@Test
    public void test2(){
        int[] nums={2,5,6,7};
        int k= 5;
        positiveInteger(nums,k);
    }
	@Test
    public void test3(){
        int[] nums={2, 3, 5, 9, 10, 11, 12};
        int k=4 ;
        positiveInteger(nums,k);
    }
	
	
	@Test
    public void test4(){
        int[] nums={1,2,3,4};
        int k=2 ;
        positiveInteger(nums,k);
    }
	@Test
    public void test5(){
        int[] nums={2,3,4,7,11};
        int k=5 ;
        positiveInteger(nums,k);
    }
    /*
     * Psuedo code
     * Declare a left,right and mid variable
     * Do a while loop
     * Calcualte teh mid index from left and right and assign it to mid variable
     * check if the mid index variable minus index is within the kth element
     * if yes assign left with mid +1
     * else assingn right as end
     * return left
     * 
     * 
     * 
     */
    private int positiveInteger(int[] nums,int k) {
    	int left=1,right=nums.length,mid;
    	while (left<right){
    		mid=(left+right)/2;
    		if (nums[mid]-mid<k){
    			left=mid+1;
    		}else right=mid;
    	}
    	System.out.println("left is "+left);
    	System.out.println(left+k);
    	return left+k;
        
    }
}
