package onspot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class LongestEvenWords {
	/*
	 * 
	 * 1) Input- Output - Constraints-
	 *
	 * 2) Test Data
	 *
	 * Positive data - Negative data Edge Case
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
	 * PsuedoCode: Code:
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		String s = "time to write a great code";
		System.out.println(findLongesEvenWord(s));

	}

	private String findLongesEvenWord(String s) {
		String[] split = s.split(" ");
		int max=Integer.MIN_VALUE;
		String maxEven="";
		for (int i=0;i<split.length;i++){
			if (split[i].length()%2==0 && split[i].length()>max ){
				max=split[i].length();
				maxEven=split[i];
			}
			
		}
		return maxEven;
		
	}

}
