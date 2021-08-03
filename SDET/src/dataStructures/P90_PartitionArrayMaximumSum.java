package dataStructures;

import java.util.Arrays;

import org.junit.*;


public class P90_PartitionArrayMaximumSum {
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
        int[] nums ={1,15,7,9,2,5,10};
        int target=3;
        findX(nums, target);
       // Assert.assertEquals(findX(nums, target),3);
        
    }
	
	/*Psuedo code
	 * 
	 * 
	 */
	private int findX(int[] arr,int k){
		int size = arr.length;
        int[] dp = new int[size+1];
        
        // i is the size of the subproblem size
        for(int i=1;i<=size;i++){
            
            // Set max value to be the new element introduced. arr[i-1] is the last element if i elements are to be considered.
            int curMax = arr[i-1];
            
            // the size of the partition j must be less than or equal to k (the max partition size)
            // also, the subproblem size i must be greater than the partition size
            for(int j=1;j<=k && i>=j; j++){
                curMax = Math.max(curMax, arr[i-j]); // update the max value in the partition as new elements get introduced into the partition containing the new element 
                dp[i] = Math.max(dp[i], dp[i-j] + curMax*j);    
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[size];
	}
}
