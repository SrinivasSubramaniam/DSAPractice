package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class CircularPrinterWheel {
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
		String s="BZA";
		circularWheel(s);
	}
	@Test
	public void test2() {
		String s="BCZ";
		circularWheel(s);
	}
	@Test
	public void test3() {
		String s="MZB";
		circularWheel(s);
	}
	
	/*
	 * 
	 * Psuedo code
	 * create a total time variable to store the time
	 * iterate through the string 
	 * Subtract the character difference of i and i-1
	 * Add to the total time and subtract 26- char difference
	 * 
	 * 
	 * 10.45 PM - 11.15 PM
	 */

	private int circularWheel(String s) {
		int totalTime=0;
		String str='A'+s;
		System.out.println(str);
		for(int i=0;i<str.length()-1;i++){
			int difference=Math.abs(str.charAt(i+1)- str.charAt(i));
			if (difference > 12 )totalTime+=26-difference;//26-25--> 1 || -->2 ||-->
			else totalTime+=difference;
		}
		System.out.println(totalTime);
		
		return totalTime;
	}
	

}
