package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P9915_Assessment3 {

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
        List<Integer> ratings=new ArrayList<Integer>();
        ratings.add(1);
        ratings.add(3);
        ratings.add(6);
        ratings.add(6);
        System.out.println(findX(ratings));
    }
	@Test
    public void test2(){
        List<Integer> ratings=new ArrayList<Integer>();
        ratings.add(4);
        ratings.add(2);
        ratings.add(5);
        ratings.add(1);
        System.out.println(findX(ratings));
    }
	private int findX(List<Integer> ratings) {
		Collections.sort(ratings);
		int left=0,right=ratings.size()-1;
		int biasedAmount=0;
		while (left<right){
			biasedAmount+=Math.abs(ratings.get(left)-ratings.get(left+1));
			biasedAmount+=Math.abs(ratings.get(right)-ratings.get(right-1));
			left+=2;
			right-=2;
		}
		return biasedAmount;
	}
	}
