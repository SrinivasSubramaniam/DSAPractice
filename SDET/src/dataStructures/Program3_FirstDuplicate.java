package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Program3_FirstDuplicate {
	
	/*
	 * Given an array of integers nums find the first duplicate number
	 * 
	 * Problem Solving Techniques :
	 * 1. Do you understand the question?
	 * 		Yes - Go to next step
	 * 		No - Ask the person to provide more detail with example(s).
	 * 
	 *  ->what is the input(s)? --> Integer Array
	 * 	->what is the expected output? --> Integer
	 *  ->Do i have constraints to solve the problem? --> first match
	 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
	 *  ->How big is your test data will be? -> 
	 *  
	 *  2. Test Data Set
	 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
	 *  ----> Positive - {3,4,3} {3,7,3,7}
	 *  ----> Negative - {1,2,3} {-1}
	 *  ----> Edge - {-3,-3,-3}
	 *  -> Validate with the interviewer if the data set is fine -> its depends on the interviewer
	 *  
	 *  3. Do i know how to solve it?
	 *  
	 *  Yes - Great, is there an alternate? -> Yes
	 *  No - Can i break down the problem into sub problems? 
	 *  then -> 
	 * 
	 * 4. Ask for hint (if you do not know how to solve it?) 
	 *  		-> Ask one time and thank the interviewer
	 *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence 
	 *  		   level to get the next question 
	 *  
	 * 5. Do I know alternate solutions as well?
	 * 	
	 * 	Yes - What are those?
	 *     way of Approach to solve with the following
	 *    -> Brute Force (Standard) -->  
	 *    -> inbuilt approach --> List
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1,2,3};
		
		boolean flag=false;
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			
			if (list.contains(n[i]))
			{
				flag=true;
				System.out.println(n[i]);
				break;
			}else
			{
				list.add(n[i]);
			}
		}
		if (flag==false)
		{
			System.out.println("-1");
		}
		

	}

}
