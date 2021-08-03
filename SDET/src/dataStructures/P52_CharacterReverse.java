package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.*;


public class P52_CharacterReverse {
	/*
	 * Given an array of characters, print the unique characters in reverse order
	 * 
	 * 
	 * 1)What is the input(s)? - character array
	 * What is the expected output? character
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- {'a','a','b','b','c','d','e','e'}
	 * Negative data- {}
	 * Edge Case-{'a','a','c','c','b','d','h','e'}
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
	@Test
    public void test1(){
        char[] input={'a','a','b','b','c','d','e','h'};
        reverseCharacter(input);
        
    }
	@Test
    public void test2(){
        char[] input={'a','a','c','c','b','d','h','e'};
        reverseCharacter(input);
        
    }
	@Test
    public void test3(){
        char[] input={};
        reverseCharacter(input);
        
    }
	
	/*
	 * Psuedo code
	 * Initialize a list
	 * iterate through the array and add the unique characters in list
	 * Reverse the list
	 * Use the iterator to print the list in reversing order
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity- O(n)
	 */
	private void reverseCharacter(char[] input){
	List<Character> list=new ArrayList<Character>();
	for (int i = 0; i < input.length; i++) {
		if (!list.contains(input[i])) list.add(input[i]);
	}
	Collections.reverse(list);
	Iterator<Character> itr = list.iterator();
	while (itr.hasNext()){
		System.out.print(itr.next()+" ");
	}
	System.out.println();
}
	
	/*private void findX(char[] input){
		if (input.length==0) System.out.println(' '); 
		int left=0,right=1;
    	while(right<input.length)
    	{
    		if (input[right]!=left){
    			char temp=input[right];
    			input[right++]=input[left];
    			input[left++]=temp;
    		}
    		else right++;
    	}
    	System.out.println(Arrays.toString(input));

	}*/
	/*private void findX(char[] input){
		int[] ascii=new int[128];
		for (int i = 0; i < input.length; i++) {
			if (ascii[input[i]]==0) ascii[input[i]]++ ;
		}
		for (int i = ascii.length-1; i>=0; i--) {
			if (ascii[i]==1) System.out.print((char)i);
		}
		
		//System.out.println(Arrays.toString(ascii));
	}*/
	
}
