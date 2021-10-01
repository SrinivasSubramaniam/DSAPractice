package dataStructures.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P32_DietProblem {

	/*
	 * A dieter consumes calories[i] calories on the i-th day. For every
	 * consecutive sequence of k days, they look at T, the total calories
	 * consumed during that sequence of k days:
	 * 
	 * If T < lower, they performed poorly on their diet and lose 1 point; If T
	 * > upper, they performed well on their diet and gain 1 point; Otherwise,
	 * they performed normally and there is no change in points. Return the
	 * total number of points the dieter has after all calories.length days.
	 * 
	 * Note that: The total points could be negative.
	 * 
	 * Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3 Output: 0
	 * Explaination: calories[0], calories[1] < lower and calories[3],
	 * calories[4] > upper, total points = 0.
	 * 
	 * Input: calories = [3,2], k = 2, lower = 0, upper = 1 Output: 1
	 * Explaination: calories[0] + calories[1] > upper, total points = 1.
	 * 
	 * Input: calories = [6,5,0,0], k = 2, lower = 1, upper = 5 Output: 0
	 * Explaination: calories[0] + calories[1] > upper, calories[2] +
	 * calories[3] < lower, total points = 0.
	 * 
	 * 
	 * 1)What is the input(s)? - integer array
	 * What is the expected output? - integer  
	 * Do I have constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! 
	 * 
	 * Positive data- [1,2,3,4,5,6] k=1
	 * Negative data-[5,5,5,5] k=1
	 * Edge Case- [6,5,1,2] k =3
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
	    	int[] n={1,2,3,4,5};
	    	int k=1;
	    	int lower=3;
	    	int upper=3;
	    	dietPlan(n,k,lower,upper);
	    	
	    }
	    @Test
	    public void Test2(){
	    	int[] n={3,2};
	    	int k=2;
	    	int lower=0;
	    	int upper=1;
	    	dietPlan(n,k,lower,upper);
	    	
	    }
	    @Test
	    public void Test3(){
	    	int[] n={6,5,0,0};///4-2-->  2 times
	    	int k=2;
	    	int lower=1;
	    	int upper=5;
	    	dietPlan(n,k,lower,upper);
	    	
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
	    
	    private int dietPlan(int[] arr, int k, int lower,int upper) {
	    	int sum=0,count=0;
	    	for (int i = 0; i < k; i++) {
				sum+=arr[i];
			}
	    	if (sum<lower) count--;
	    	if (sum>upper) count++;
	    	for (int i = 1; i <= arr.length-k; i++) {
				sum+=arr[i+k-1]-arr[i-1];
				if (sum<lower) count--;
				if (sum>upper) count++;
			}
	    	System.out.println(count);
	    	return count; 
	    }
	    /*private int dietPlan(int[] arr, int k, int lower,int upper) {
	    	int count=0;
	    	for (int i = 0; i < arr.length; i+=k) {
	    		int windowItr=k;
	    		int sum=0;
	    		while (windowItr>0)
	    		{
	    			sum+=arr[i];
	    			windowItr--;
	    		}
	    		if (sum>upper) count++;
    			if (sum<lower) count--;
				
			}
	    	System.out.println(count);
	    	return count; 
	    }*/
	
}
