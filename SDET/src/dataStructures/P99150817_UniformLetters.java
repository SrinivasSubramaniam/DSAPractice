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


public class P99150817_UniformLetters {

	/*
	 * 
	 *1) Input-String, int array
	 *	 Output -Boolean array
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- String input="abbccaadf";
       int[] targetedValues={4,2,5,3,7};
	 * 	Negative data-
	 * 	Edge Case-
	 * 
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * Create a integer value to hold the letter value
	 * create a character previous to hold the track of previous letter
	 * Create a Hashset to hold the letter values
	 * Iterate through the String
	 * If the character is not equal to the previous value then calculate previous value by subtracting with 'a'+1 char
	 * else calculate and add it to the value 
	 * add it to the values set
	 * 
	 * Iterate through the targeted values 
	 * if the targeted value is contained in the set then return true
	 * else false
	 * 
	 * 
	 * Time Complexity - O(N)+O(M)--> O(N)
	 * 
	 * PsuedoCode: 10 mins
	 * Code: 5 mins
	 * 
	 * 
	 * 
	 */
	
	
		
	
	//@Test
    public void test1(){
       String input="abbccaadf";
       int[] targetedValues={4,2,5,3,7};
       System.out.println(Arrays.toString(findX(input,targetedValues)));
    }
	@Test
    public void test2(){
       String input="aabc";
       int[] targetedValues={3};
       System.out.println(Arrays.toString(findX(input,targetedValues)));
    }

	private boolean[] findX(String input, int[] targetedValues) {
		int values=0;
		Character previousletter=' ';
		Set<Integer> uniformValues = new LinkedHashSet<Integer>();
		for (Character letter : input.toCharArray()) {
			if (letter!=previousletter)	values=letter-'a'+1;
			else values+=letter-'a'+1;
			uniformValues.add(values);
			previousletter=letter;
		}
		System.out.println(uniformValues);
		boolean[] outPut=new boolean[targetedValues.length];
		for (int i = 0; i < targetedValues.length; i++) {
			if (uniformValues.contains(targetedValues[i])){
				outPut[i]=true;
			}else outPut[i]=false;
		}
		return outPut;
	}


}
