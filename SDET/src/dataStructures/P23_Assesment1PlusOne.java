package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P23_Assesment1PlusOne {

	/*
	 * 
	 * 1) What is the input(s)? - integer array
	 * String What is the expected output? - integer array 
	 * Do I have constraints to solve the problem? - 
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- [4,3,2,1] 
	 * Negative -  Edge- [9,9]
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
	 * 10) If it fails, debug them to solve it
     /*
     *Psuedo code
     *Traverse the array from the last index
	 *check if last index value is less than 9, then increment last value and return array
	 *else put last value as 0 and that will increment the previous digits
	 *create a new array to fit the extra value like two digit number changed to three digit number
	 *assign 1 to first index of new array
     *Time complexity - O(n)
     *Space complexity - O(n)
     *
     /*/

    public int[] plusOne(int[] digits) {
     for(int i=digits.length-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++; 
            return digits;
        }
        digits[i] = 0;
     }
     int[] outputDigits = new int [digits.length+1];
     outputDigits[0] = 1;
     return outputDigits;
        
        
    }
	
	

}
