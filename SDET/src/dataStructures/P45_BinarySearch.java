package dataStructures;

import org.junit.Test;
import org.testng.Assert;

public class P45_BinarySearch {
	/*
	 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0
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
        int[] nums={1,3,5,6,7,8,9};
        int target= 7;
        System.out.println(findIndex(nums,target));
       // Assert.assertEquals(findIndex(nums,target), 2);
        
    }
	@Test
	public void test2(){
        int[] nums={-1,0,3,5,9,12};
        int target= 2;
        System.out.println(findIndex(nums,target));
       // Assert.assertEquals(findIndex(nums,target), 2);
        
    }
	
	
    /*private int findIndex(int[] nums,int target) {
    	 int left=0,right=nums.length-1,mid=0;
    	 int i=0;
         while (left<=right){
             mid=(left+right)/2;
             System.out.println("i is " + i++);
             if (nums[mid]==target) return mid;
             if (nums[mid]<target) left=mid+1;
             else right=mid-1;
         }

         return -1;
        
    }*/
    private int findIndex(int[] nums,int target) {
   	 int left=0,right=nums.length-1,mid=0;
   	 int i=0;
        while (left<right){
            mid=(left+right)/2;
            System.out.println("i is " + i++);
            if (nums[mid]==target) return mid;
            if (nums[mid]<target) left=mid+1;
            else right=mid;
        }
        if (nums[left]!=target) return left;
        return -1;
        
        
        /*int left=0,right=nums.length-1,mid=0;
        while (left<=right){
            mid=(left+right)/2;
           // System.out.println("i is " + i++);
            if (nums[mid]==target) return mid;
            if (nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return -1;*/
   }
}
