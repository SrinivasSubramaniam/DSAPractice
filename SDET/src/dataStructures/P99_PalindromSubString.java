package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;

public class P99_PalindromSubString {

	/*
	 * 
	 * 1) Input- Output - Constraints-
	 *
	 * 2) Test Data
	 *
	 * Positive data- Negative data- Edge Case-
	 * 
	 * 3)Methods to Solve-
	 * 
	 * 4)O Notations-
	 * 
	 * 5)Psuedo code
	 */

	/*
	 * 1. Simplest possible case- 0 2. Test data - 5 ,4 3. Edge case- 4.
	 * Pattern- (n-1)
	 * 
	 * 
	 * 
	 */

	@Test
	public void tes1() {
		String str="abc";
	
		findMinSum(str);
	}
	@Test
	public void tes2() {
		String str="aab";
	
		findMinSum(str);
	}

	private String[] findMinSum(String str){
		String str1[]={"a","b"};
		String s="a";
		System.out.println(s.substring(0, 1));
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.substring(i,j+1).equals(new StringBuilder(str.substring(i,j+1)).reverse().toString())){
					list.add(str.substring(i,j+1));
				}
			}
		}
		System.out.println(list);
		
		return str1;
	}
}
