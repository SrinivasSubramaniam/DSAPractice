package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P30_MoveOddToRight {

	/*
	 * Moved Odd numbers to the right 
	 * 
	 * Input-{1,2,3,4,5,6}
	 * Output- {2,4,6,1,3,5}
	 * 
	 * Input- {8,8,8,8}
	 * Output-{8,8,8,8}
	 * 
	 * Input-{2,1,5,4,7,6}
	 * Output- {2,6,1,5,7}
	 * 
	 * 
	 * 1)What is the input(s)? - String, Character String What is the expected
	 * output? - integer array Do I have constraints to solve the problem? -
	 * s[i] and c are lowercase English letters,It is guaranteed that c occurs
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- "aaab" Negative -
	 * Edge- "loveleetcode"
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
	 * Psuedo code
	 *
	 *
	 *
	 *
	 * /
	 */
	
	    @Test
	    public void Test1(){
	    	int[] n={1,2,3,4,5,6};
	    	Assert.assertEquals(Arrays.equals(moveOddToRight(n), new int[] {2,4,6,1,5,3}),true);
	    }
	    @Test
	    public void Test2(){
	    	int[] n={8,8,8,8};
	    	moveOddToRight(n);
	    }
	    @Test
	    public void Test3(){
	    	int[] n={2,1,5,4,7,6};
	    	moveOddToRight(n);
	    }
	    /*
	     * Pseudo code
	     * use two pointer Equi directional
	     * Initialize the left with 0 and right variable with 0
	     * use a while loop to check if right is even then swap
	     * 
	     * 
	     */
	    
	    
	    private int[] moveOddToRight(int[] arr) {
	    	int left=0,right=0;
	    	while(right<arr.length)
	    	{
	    		if (arr[right]%2==0){
	    			int temp=arr[right];
	    			arr[right++]=arr[left];
	    			arr[left++]=temp;
	    		}
	    		else right++;
	    	}
	    	System.out.println(Arrays.toString(arr));
	        return arr;
	    }
	
}
