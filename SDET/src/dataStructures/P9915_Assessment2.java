package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P9915_Assessment2 {

	/*
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * 	Negative data- 
	 * 	Edge Case-
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	@Test
    public void test1(){
        List<Long> lengths=new ArrayList<Long>();
        lengths.add((long) 4);
        lengths.add((long) 2);
        lengths.add((long) 3);
        long minLength=7;
        System.out.println(lengths);
        System.out.println(findX(lengths,minLength));
    }
	@Test
    public void test2(){
        List<Long> lengths=new ArrayList<Long>();
        lengths.add((long) 4);
        lengths.add((long) 3);
        lengths.add((long) 2);
        long minLength=7;
        System.out.println(lengths);
        System.out.println(findX(lengths,minLength));
    }

	@Test
    public void test3(){
        List<Long> lengths=new ArrayList<Long>();
        lengths.add((long) 3);
        lengths.add((long) 5);
        lengths.add((long) 4);
        lengths.add((long) 3);
        long minLength=9;
        System.out.println(lengths);
        System.out.println(findX(lengths,minLength));
    }
	private String findX(List<Long> lengths, Long minLength) {
		int sum=0;
		for (int i = 0; i < lengths.size(); i++) {
			sum+=lengths.get(i);
		}
		if (sum<minLength) return "Impossible";
		int left=0;
		for (int right = lengths.size()-1; right >1; right--) {
			if (lengths.get(right)<lengths.get(left)){
				sum-=lengths.remove(right);
			}else{
				sum-=lengths.remove(left);
				left++;
			}
			if (sum<minLength) return "Impossible";
			
		}
		return "Possible";
	}
	private String findXOptimised(List<Long> lengths, Long minLength) {
		int sum=0;
		for (int i = 0; i < lengths.size(); i++) {
			sum+=lengths.get(i);
		}
		if (sum<minLength) return "Impossible";
		int left=0,right=lengths.size()-1;
		while (right-left>1 ) {
			if (lengths.get(right)<lengths.get(left)){
				sum-=lengths.get(right--);
				if (sum<minLength) return "Impossible";
				
			}
			if (right-left<=1) break;
			if (lengths.get(left)<=lengths.get(right)) {
				sum-=lengths.get(left++);
				if (sum<minLength) return "Impossible";
			}
			
			
		}
		return "Possible";
	}
	}
