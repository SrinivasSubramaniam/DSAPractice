package dataStructures;

import java.util.HashSet;
import java.util.Set;

import org.junit.*;


public class P80_LongestConsecutiveSequence {
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
        int[] nums ={100,4,200,1,3,2};
        //int target=3;
        findX(nums);
       // Assert.assertEquals(findX(nums, target),3);
        
    }
	
	/*Psuedo code
	 * 
	 * 
	 */
	private int findX(int[] nums){
		if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int freq = 0;
        for(int num : nums) {
           if (set.contains(num+1)) freq++;
        }
        System.out.println(freq);
        return freq;
	}
}
