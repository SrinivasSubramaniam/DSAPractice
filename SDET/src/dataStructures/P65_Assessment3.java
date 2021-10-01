package dataStructures;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

import org.junit.*;


public class P65_Assessment3 {
	/*
	 *
	 * 
	 * 
	 * 1)What is the input(s)? - 
	 * What is the expected output? 
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- 
	 * Negative data- 
	 * Edge Case-
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
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
	 *
	 *
	 *
	 * /
	 */
	 public static int getMaxDeletions(String s) {
		 String str="URRUDRL";
		 //String str="RRRR";
		 
		 Map<Character, Integer> map=new HashMap<Character, Integer>();
		 map.put('R', 0);
		 map.put('L', 0);
		 map.put('U', 0);
		 map.put('D', 0);
	      for (int i=0;i<str.length();i++){
	    	  map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
	      }
	       int deletions=Math.abs(map.get('R')-map.get('L'))+ Math.abs(map.get('D')-map.get('U'));
	       
	       int minDeletions=str.length()-deletions;
	       System.out.println(minDeletions);
	        return 1;
		    
}
	 
	 public static void main(String[] args) {
	        String s="URDR";
	        getMaxDeletions(s);
	    }
}
