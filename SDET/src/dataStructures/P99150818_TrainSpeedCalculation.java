package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P99150818_TrainSpeedCalculation {

	/*
	 * Given an int array [1,4,20,3,10,5] and target sum 33.
If target subarray sum is found, return true else false
Time : 20 Minutes 
- Write another 2 test data (edge and neg)
- Pseudo Code for Optimised Solution
- Code, Debug
- Time everything 
- Do it yourself !! 
	 * 
	 * 
	 * 
	 *1) Input-int array
	 *	 Output - boolean
	 *	 Constraints- no
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * [1,4,20,3,10,5]
	 * target = 38
	 * 	Negative data- 
	 * [1,4,20,3]
	 * target -39
	 * 	Edge Case- 
	 * [20,3,22,1,5] 
	 * target - 23
	 * 
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * 
	 * 
	 * Time Complexity - 
	 * 
	 * PsuedoCode:  mins
	 * Code: mins
	 * Debug:  mins
	 * 
	 * 
	 * 
	 */
	
	
		
	
	@Test
    public void test1(){
		int[] input={1,3,2};
		double hour=6;
		System.out.println(findX(input, hour));
    }
	@Test
    public void test2(){
		int[] input={1,3,2};
		double hour=2.7;
		System.out.println(findX(input, hour));
    }
	@Test
    public void test3(){
		int[] input={1,3,2};
		double hour=1.9;
		System.out.println(findX(input, hour));
    }
	
	/*Psuedo code
	 * 
	 * Create a variable to to iterate till length -1
	 * Create a outPutSpeed variable as -1
	 *  Create a left and right pointer with 0 and 10000000
	 *  if hour is less than length -1 then return -1
	 *  do a while loop for left less than or equal to right
	 *  calculate mid
	 *  iterate the array calculate ceiling sum of number divide by mid value
	 *  add the last number divide by mid with calculated sum
	 *  if calculated sum is greater than hour then shift left to mid+1
	 *  else assign the mid value to a outPutaraible and decrement right to mid-1
	 *  return outPutvariable 
	 */
	private int findX(int[] input, double hour) {
		int x=-123;
		int g=-x;
		System.out.println(g);
		int sum = 1056389759;
		if (sum>Integer.MAX_VALUE) System.out.println(0);
		/*int value=9646324350;
		System.out.println(9646324350+1);*/
		//System.out.println(9646324350);
		int n = input.length-1 , outPutSpeed=-1;
        int left = 1, right = 10000000;
        if (hour<n) return outPutSpeed;
        while(left <= right){
            int mid = (left +right)/2;
            double tempHour= 0;
            for(int i=0;i<n ;i++){
                tempHour+=Math.ceil((double)input[i]/mid);
            }
            tempHour+=((double)input[n]/mid);
            if(tempHour > hour){left = mid+1;}
            else
            {outPutSpeed = mid;
            right = mid-1;}
        }
        return outPutSpeed;
		
	}


}
