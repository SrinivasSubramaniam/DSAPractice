package dataStructures;

import java.util.Arrays;

import org.junit.*;


public class P57_MovePositiveNegative {
	/*
	 *array of nums, contains equal no of positve and negative, 
	 *rearrange in an order +ve and then -ve in alternate positions.
	Constraint: cannot use extra space
	eg : int[] input = {12, -90, -100, 15, 98, 99, -56, -2};
			   expected output {12, -90, 15, -100, 98,-56,99,-2}
	 * 
	 * 
	 * 1)What is the input(s)? - Integer array
	 * What is the expected output? -integer array
	 * Do I have constraints to solve the problem? -do not use extra space
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- {12, -90, -100, 15, 98, 99, -56, -2}
	 * Negative data- {}
	 * Edge Case- {-90, -100, 15,12}
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
        int[] nums={12, -90, -100, 15, 98, 99, -56, -2};
        System.out.println(Arrays.toString(movePostiveNegative(nums)));
        //Assert.assertEquals(3, findX(nums, target));
    }
	@Test
    public void test2(){
        int[] nums={};
        System.out.println(Arrays.toString(movePostiveNegative(nums)));
    }
	@Test
    public void test3(){
        int[] nums={-90, -100, 15,12};
        System.out.println(Arrays.toString(movePostiveNegative(nums)));
    }
	/*
	 * Psuedo code
	 * initialize a left and right variable 
	 * do a while loop till the length of the array
	 * Check if the are any negative values and move it to the right with temp variable
	 * After this all the negative values are moved to the right
	 * Now do a while loop and swap the second half of the negative values with the alternate position
	 * return the array
	 * 
	 * Time complexity - O(2n)-> O(n)
	 * Space complexity- O(1)
	 * 
	 */
	private int[] movePostiveNegative(int[] nums){
		if (nums.length==0) return new int[] {-1,-1};
		int left=0,right=0;
		while (right<nums.length){
			if (nums[right]>0){
				int temp=nums[left];
				nums[left++]=nums[right];
				nums[right++]=temp;
			}else right++;	
		}
		left=1;
		right=nums.length/2;
		while (right<nums.length){
			if (nums[right]<0){
				int temp=nums[left];
				nums[left]=nums[right];
				left+=2;
				nums[right++]=temp;
			}else right++;
		}
		return nums;
	}
}
