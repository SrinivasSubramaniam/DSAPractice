package onspot;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class Assessment3 {
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		
		
		List<List<Integer>> operations=new ArrayList<List<Integer>>();
		System.out.println(performOperations(arr, operations));
	}
	
	public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
	    ArrayDeque<Integer> dequeue=new ArrayDeque<Integer>();
	    Stack<Integer> stack=new Stack<Integer>();
	    List<Integer> outPut=new ArrayList<Integer>(arr);
	    
	    for (int i=0;i<operations.size();i++){
	            int start=operations.get(i).get(0);
	            int end=operations.get(i).get(1);
	        for (int j=0;j<outPut.size();j++){
	            if (j>=start && j<end) stack.push(outPut.get(j));
	            else dequeue.offer(outPut.get(j));
	        }
	        for (int k=0;k<arr.size();k++){
	            if (k>=start && k<end ) outPut.add(stack.pop());
	            else outPut.add(dequeue.poll());
	        }
	        
	    }
	    
	    return outPut;

	    }



}
