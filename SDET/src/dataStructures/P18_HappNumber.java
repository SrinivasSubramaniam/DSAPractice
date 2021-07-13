package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P18_HappNumber {

		/*
				Write an algorithm to determine if a number n is happy. 
				A happy number is a number defined by the following process:
		
		Starting with any positive integer, replace the number by the sum of the squares of its digits.
		Repeat the process until the number equals 1 (where it will stay), or it loops endlessly
		 in a cycle which does not include 1.
		Those numbers for which this process ends in 1 are happy.
		Return true if n is a happy number, and false if not.
		
		Example 1:
		
		Input: n = 19
		Output: true
		Explanation:
		12 + 92 = 82
		82 + 22 = 68
		62 + 82 = 100
		12 + 02 + 02 = 1
		
		Example 2:
		Input: n = 2
		Output: false
	 * What is the input(s)? - int num
	 * String What is the expected output? - boolean 
	 * Do I have constraints to solve the problem? - 
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! 
	 * Positive- 19
	 * Negative -2
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solve it? - 
	 * Yes - great, Is there any alternate solution?- 
	 * No - Can I break down the problem to sub problems?
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)-- Sum of all squares which repeats itself can't become 1
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem? 
	 * 
	 * 6) If you know
	 * alternate solutions-> find out the O notations (performance) 
	 * Then explain the both or the best (depends on the time) 1
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
	 */

	@Test
	public  void testData1() {
		int num=19;
		Assert.assertEquals(isHappyNumber(num),true );
	}
	
	@Test
	public  void testData2() {
		int num=2;
		Assert.assertEquals(isHappyNumber(num),false );
	}
	
	
	/*
	 * Pseudo code
	 * Initialize a hash set to store sum of all square values 
	 * if set doesn't contains sum values
	 * add sum value in set
	 * declare sum=0
	 * do a while loop and store a sum of square values for checking the happy number
	 * if sum==1 return false
	 * else assign sum value to num which will check if it is already present in set
	 * 
	 * Time complexity- --> O(n^2)
	 * Space Comlexity --> O(n)
	 */


	private boolean isHappyNumber(int num) {
		Set<Integer> set=new HashSet<Integer>();
		while (!set.contains(num)) {
			set.add(num);
			int sum=0;
			while (num>0){
				sum = sum + (num % 10) * (num % 10);
				num /= 10;
			}
			if (sum==1) return true;
			num=sum;

		}
		return false;

	}

}
