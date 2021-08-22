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


public class P99150819_TrappingRainWater {

	/*
	 * 
	 * 
	 * 
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data
	 * 	Negative data
	 * 	Edge Case
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
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * Debug: 
	 * 
	 * 
	 * 
	 */
	
	
		
	
	@Test
    public void test1(){
		int[] input={0,4,2,0,3,2,5,2,7,2};
		findXStack(input);
    }
	@Test
    public void test2(){
		int[] input={1,2,3,0,0,0};
		findXStack(input);
    }
	@Test
    public void test3(){
		int[] input={0,4,2,0,3,2,5,2,3,2};
		findXStack(input);
    }
	/*Psuedo code
	 * 
	 * if input array length is less than 2 return 0
	 * create a outputSum variable, n for array length
	 * create a left and right max array to hold the left and right max values
	 * assign left max to zero index
	 * iterate the array from left to right from 1st index
	 * Calculate the left max with adjacent heights and store it
	 * Assign the right max to n-1 index
	 * Iterate the array from right to left from n-2
	 * Calculate the right max with the adjacent number and store it
	 * Calcualte outPut sum by adding to itself and min of (leftmax and right max) values and subtracting it
	 * return the outPut sum
	 * 
	 * 
	 */
	

	private int findX(int[] input) {
		if (input.length<2) return 0;
		int outPutSum=0;
		int n=input.length;
		int[] leftMax=new int[input.length];		
		int[] rightMax=new int[input.length];
		leftMax[0]=input[0];
		for (int i = 1; i < input.length; i++) {
			leftMax[i]=Math.max(leftMax[i-1], input[i]);
		}
		rightMax[n-1]=input[n-1];
		for (int i = n-2; i >=0; i--) {
			rightMax[i]=Math.max(rightMax[i+1], input[i]);
			outPutSum+=Math.min(leftMax[i],rightMax[i])-input[i];
		}
		System.out.println(outPutSum);
		return outPutSum;
	}
	
	
	private int findXStack(int[] input){
		Stack<Integer> stack =new Stack<Integer>();
		int outPutSum=0;
		for (int right=0;right<input.length;right++){
			while (!stack.isEmpty() && input[right] > input[stack.peek()]) {
				int bottom = stack.pop();
				if (stack.isEmpty()) break;
				int left = stack.peek();
				int tempSum = (right - left - 1) * (Math.min(input[left], input[right]) - input[bottom]);
				outPutSum += tempSum;
			}
			stack.push(right);
		}
		System.out.println(outPutSum);
		
		return outPutSum;
	}


}
