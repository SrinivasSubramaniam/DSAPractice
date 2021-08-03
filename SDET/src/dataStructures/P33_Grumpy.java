package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P33_Grumpy {

	/*
	 * Today, the bookstore owner has a store open for customers.length minutes.
	 * Every minute, some number of customers (customers[i]) enter the store,
	 * and all those customers leave after the end of that minute. On some
	 * minutes, the bookstore owner is grumpy. If the bookstore owner is grumpy
	 * on the i-th minute, grumpy[i] = 1, otherwise grumpy[i] = 0. When the
	 * bookstore owner is grumpy, the customers of that minute are not
	 * satisfied, otherwise they are satisfied. The bookstore owner knows a
	 * secret technique to keep themselves not grumpy for X minutes straight,
	 * but can only use it once. Return the maximum number of customers that can
	 * be satisfied throughout the day.
	 * 
	 * Example 1: Input: customers = [1,0,1,2,1,1,7,5], grumpy =
	 * [0,1,0,1,0,1,0,1], X = 3 Output: 16 Explanation: The bookstore owner
	 * keeps themselves not grumpy for the last 3 minutes. The maximum number of
	 * customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
	 * 
	 * 
	 * 1)What is the input(s)? - integer customers array, grumpy array and technique-x minutes
	 * What is the expected output? - integer
	 * integer Do I have constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!! How
	 * big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- [{10,12,1,2,1,1,7,5}] k=3 
	 * Negative data- 
	 * Edge Case- [0,5,0,6,0,7,0,8] k =3
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force, sliding window tech
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
	    	int[] customersArray={10,12,1,2,1,1,7,5};
	    	int[] grumpyArray=   {0,1,0,1,0,1,0,1};
	    	int notGrumpyWindow=3;
	    	//satisfiedCustomer(customersArray,grumpyArray,notGrumpyWindow);
	    	Assert.assertEquals(satisfiedCustomer(customersArray, grumpyArray, notGrumpyWindow),33);
	    	
	    }
	    
	    @Test
	    public void Test2(){
	    	int[] customersArray={1,0,1,2,1,1,7,5};
	    	int[] grumpyArray=   {0,1,0,1,0,1,0,1};
	    	int notGrumpyWindow=3;
	    	Assert.assertEquals(satisfiedCustomer(customersArray, grumpyArray, notGrumpyWindow),16);
	    	
	    }
	    @Test
	    public void Test3(){
	    	int[] customersArray={0,5,0,6,0,7,0,8};
	    	int[] grumpyArray=   {0,1,0,1,0,1,0,1};
	    	int notGrumpyWindow=3;
	    	//satisfiedCustomer(customersArray,grumpyArray,notGrumpyWindow);
	    	Assert.assertEquals(satisfiedCustomer(customersArray, grumpyArray, notGrumpyWindow),15);
	    	
	    }
	    /*
	     * Pseudo code
	     * Using Sliding window technique
	     * Sum the calories of k days
	     * Check if total calorie is upper or lower then plus one or minus 1
	     * Do a for loop and check for remaining consecutive days
	     * Add the calorie in the next window date and subtract the calorie from the previous window date
	     * Again check if total calorie is upper or lowe then plus one or minus 1
	     * return the count values
	     */
	    
	    //{6,4,0,0}--2 
	    
	    private int satisfiedCustomer(int[] customersArray,int[] grumpyArray,int notGrumpyWindow) {
	    	int satisfiedCustomer=0;
	    	for (int i = 0; i < grumpyArray.length; i++) {
				if (grumpyArray[i]==0 || (grumpyArray[i]==1 && i < notGrumpyWindow)) satisfiedCustomer+=customersArray[i];
			}
	    	int maxSatisfiedCustomer=satisfiedCustomer;
	    	for (int i = 1; i <= grumpyArray.length-notGrumpyWindow; i++) {	    		
	    		if (grumpyArray[i+notGrumpyWindow-1]==1)satisfiedCustomer+=customersArray[i+notGrumpyWindow-1];
	    		if (grumpyArray[i-1]==1) satisfiedCustomer=satisfiedCustomer-customersArray[i-1];
	    		if (satisfiedCustomer>maxSatisfiedCustomer)maxSatisfiedCustomer=satisfiedCustomer;
			}
	    	System.out.println(maxSatisfiedCustomer);
	    	return maxSatisfiedCustomer; 
	    }
	
}
