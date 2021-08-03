package dataStructures;

import java.util.Arrays;

import org.junit.Test;

public class P04_RemoveElement {
	
	/*
	 * 
	 * 
	 * Problem Solving Techniques :
	 * 1. Do you understand the question?
	 * 		Yes - Go to next step
	 * 		No - Ask the person to provide more detail with example(s).
	 * 
	 *  ->what is the input(s)? --> Integer Array, integer target
	 * 	->what is the expected output? --> Integer array
	 *  ->Do i have constraints to solve the problem? -->
	 *  ->Do i have all informations to go to next step? -> If all the above mentioned steps (i.e., for Yes) we can proceed
	 *  ->How big is your test data will be? -> 
	 *  
	 *  2. Test Data Set
	 *  -> Minimum of 3 data set !! "Positive" , "Edge" and "Negative" 
	 *  ----> Positive - {1,3,3,5,6,3} 3
	 *  ----> Negative - {1,5,6,7} 3
	 *  ----> Edge - {3,3,3,3} 3
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
	 *    -> Brute Force (Simple Technique) -->  
	 *    -> inbuilt approach --> List
	 *  No - Can i break down the problems into sub problems?
	 * 
	 * 6. If you know alternate solutions-> find out the O notations (performance)
	 *  Then explain the both or the best (depends on the time)
	 *  
	 *  Approach 1-> Start with the worst -> Improve to optimize -> End up with the beset
	 *  Approach 2-> Write down the options and benefits and code the best
	 *  
	 * 7. Start with the Pseudo code
	 * 
	 * 8. Implement them in the code (editor)
	 * 
	 * 9. Test against the different data set
	 * 
	 * 10. If it fails, debug them to solve it
	 */

		@Test
		public void testData1()
		{
			int[] oldArray={1,3,3,5,6,3};
			int target=3;
			System.out.println(Arrays.toString(removeElement(oldArray,target)));
			
		}
		
		@Test
		public void testData2()
		{
			int[] oldArray={1,5,6,7};
			int target=3;
			System.out.println(Arrays.toString(removeElement(oldArray,target)));
			
		}
		
		@Test
		public void testData3()
		{
			int[] oldArray={3,3,3,3};
			int target=3;
			System.out.println(Arrays.toString(removeElement(oldArray,target)));
			
		}
		
		
		private int[] removeElement(int[] oldArray,int target)
		{		
			int pos=0;
			//3 4 2 4
			// pos=0
		for (int i = 0; i < oldArray.length; i++) {
			if (oldArray[i]!=target)
			{	
				//int temp=oldArray[pos];
				oldArray[pos++]=oldArray[i];
				//oldArray[i]=temp;
			}
			
		}
		
		if (pos==oldArray.length  ) return oldArray;
		if (pos==0) return new int[] {-1,-1};
		return Arrays.copyOfRange(oldArray,0,pos);
		
		/*int[] newArray=new int[pos];
		for (int i = 0; i < pos; i++) {
			newArray[i]=oldArray[i];
		}*/
		
		//return oldArray;
	}
}


