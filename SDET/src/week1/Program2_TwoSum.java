package week1;

import java.util.HashMap;
import java.util.Map;

public class Program2_TwoSum {
	
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	 * Return the first targ
	 * Problem Solving Techniques :
	 * 1. Do you understand the question?
	 * 		Yes - Go to next step
	 * 		No - Ask the person to provide more detail with example(s).
	 * 
	 *  ->what is the input(s)? --> Integer Array, int
	 * 	->what is the expected output? --> Integer Array
	 *  ->Do i have constraints to solve the problem? --> first match
	 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
	 *  ->How big is your test data will be? -> 
	 *  
	 *  2. Test Data Set
	 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
	 *  ----> Positive - {2,4,6,8,12} 10
	 *  ----> Negative - {2,4,6,8} 16, {-1,-1 } 4, {} -1
	 *  ----> Edge - {7,3,5,5,7} 10 
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
	 *    -> Brute Force (Standard) --> Yes 
	 *    -> inbuilt approach --> 
	 */

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= {2,4,6,8,12};
		int target=9;
		int [] first=new int[2];
		boolean flag=false;
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i+1; j < n.length; j++) {
				int sum=n[i]+n[j];
				if (sum==target)
				{
					System.out.println("Pairs are "+ i +" , " + j);
					first[0]=i;
					first[1]=j;
					flag=true;
					break;
				}
				
			}
			
			if (flag==true)
			{
				break;
			}
						
		}
		if (flag==false)
		{
			System.out.println("-1 ");
		}

	}*/
	
	public static void main(String[] args) {
		int[] n= {2,4,6,8,12};
		
		
		int target=9;
		 int[] first = null;
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		   
		    for (int i = 0; i < n.length; i++) {
		        if (map.containsKey(target - n[i])) {
		        	first =new int[2];
		        	first[0] = map.get(target - n[i]);
		            first[1] = i;
		            break;
		        }
		        map.put(n[i], i);
		    }
		    
		    if (first!=null)
		    {
		    System.out.println("Pairs are ");
		    for (int i = 0; i < first.length; i++) {
				System.out.print(first[i]+" ");
			}
		    }
		    else
		    {
		    	System.out.println("-1");
		    }
	}
}

	
