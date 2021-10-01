package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P21_Assesment1ContainsDuplicate {

	/*
	 * 
	 *  What is the input(s)? - integer array
	 * String What is the expected output? - boolean 
	 * Do I have constraints to solve the problem? - 
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- [1,2,3,1]
	 * Negative - [1,2,3,4] Edge- [1,1,1,3,3,4,3,2,4,2]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force and two pointer
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
     /*
     *Psuedo code
     *Sort the array
     *initialize left with 0 and right variable with length
     *Do a while loop 
     *check if the left and left+1 is equals if yes return true
     *Also check if right and right +1 is equal if yes return ture
     *then increment left and right by 2 indicies
     *return false after while 
     *
     *
     *Time complexity - O(n log n)
     *Space complexity - O(n)
     *
     /*/
     

    public boolean containsDuplicate(int[] nums) {
        if (nums.length==0) return false;
        Arrays.sort(nums);
		int left=0, right =nums.length-1;
		
		while (left<=right)
		{
			if(nums[left]==nums[left+1]) return true;
			if(nums[right]==nums[right-1]) return true;
			left+=1;
			right-=1;
			
		}
		return false;
        
    }
	
	

}
