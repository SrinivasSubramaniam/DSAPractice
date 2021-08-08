package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P24_AbsoluteDifferenceDuplicate {

	/*
	 * 
	 * 	 * 
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- [4,3,2,1] Negative -
	 * Edge- [9,9]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force
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
	 * 10) If it fails, debug them to solve it /* Psuedo code Traverse the array
	 * from the last index check if last index value is less than 9, then
	 * increment last value and return array else put last value as 0 and that
	 * will increment the previous digits create a new array to fit the extra
	 * value like two digit number changed to three digit number assign 1 to
	 * first index of new array Time complexity - O(n) Space complexity - O(n)
	 *
	 * /
	 */
	
	    @Test
	    public void test1() {
	        int[] input = {1,2,3,1};
	        int k = 3;
	        Assert.assertTrue(findIfPresent(input,k));
	    }

	    @Test
	    public void test2() {
	        int[] input = {1,0,1,1};
	        int k = 1;
	        Assert.assertTrue(findIfPresent(input,k));
	    }

	    @Test
	    public void test3() {
	        int[] input = {10,20,10,11,70,80,40,30};
	        int k = 2;
	        //Assert.assertTrue(findIfPresent(input,k));
	        Assert.assertEquals(findIfPresent(input,k), true);
	    }

	    @Test
	    public void test4() {
	        int[] input = {1,2,3,2};
	        int k = 2;
	        Assert.assertTrue(findIfPresent(input,k));
	    }

	    @Test
	    public void test5() {
	        int[] input = {1,2,3,2,2,3};
	        int k = 3;
	        Assert.assertTrue(findIfPresent(input,k));
	    }

    private boolean findIfPresent(int[] input, int k) {
			// TODO Auto-generated method stub
    	
    	///{1,2,3,4,2,6,7,9}--iterations to be 4
    	Set<Integer> set=new HashSet<Integer>();
    	for (int i = 0; i <= k; i++) {
    		if (!set.add(input[i])) return true;	
		}
    	for (int i = 1; i < input.length-k; i++) {
			set.remove(input[i-1]);
			if (!set.add(input[i+k])) return true;
		}
			return false;
		}
    
  
}
