package dataStructures;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.junit.*;


public class P89_SecondLargest {
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
	//@Test
    public void test1(){
        int[] nums ={2,3,4};
        Assert.assertEquals(findXSinglePass(nums),3);
        
    }
	@Test
    public void test2(){
        int[] nums ={4,1,6,3,5,2};
        Assert.assertEquals(findXSinglePass(nums),5);
        
    }
	
	/*Psuedo code
	 * Traverse the array and store the max variable, store it is as the largest
	 * Traverse the array and check for max variable which is not equal to the largest
	 * 
	 */
	private int findX(int[] nums){
		int largest=nums[0];
		int secondLargest=nums[0];
		for (int i = 0; i < nums.length; i++) {		
			largest=Math.max(nums[i], largest);			
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=largest)
				secondLargest=Math.max(nums[i], secondLargest);			
		}
		System.out.println(secondLargest);
		return secondLargest;
	}
	
	private int findXSinglePass(int[] nums){
		
		int largest=Math.max(nums[0], nums[1]);
		int secondLargest=Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			if (nums[i]>largest){
				secondLargest=largest;
				largest=nums[i];
			}else if (nums[i]>secondLargest){
				secondLargest=nums[i];
			}
		}
		System.out.println(secondLargest);
		return secondLargest;
		
	}
}
