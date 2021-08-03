package dataStructures;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;


public class P88_RomanInteger {
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
	@Test
    public void test1(){
        String str="IV";
        findX(str);
    }
	@Test
    public void test2(){
        String str="LVIII";
        findX(str);
    }
	@Test
    public void test4(){
        String str="CDXCIV";
        findX(str);
    }
	@Test
    public void test5(){
        String str="XCIV";
        findX(str);
    }
	@Test
    public void test6(){
        String str="MCMXCIV";
        findX(str);
    }
	@Test
    public void test7(){
        String str="XLIX";
        findX(str);
    }
	@Test
    public void test8(){
        String str="MDM";
        findX(str);
    }
	
	
	/*1000 100 1000 10 100 4 
	 * 
	 * Psuedo code
	 * Create a map and put all the roman character and integer as key values
	 * Initialize a Output varaible to store the sum 
	 * Do a for loop and check if the next integer value is greater than the previous value
	 * then subtract the previous value from the sum
	 * then add the sum to next integer value - previous integer value
	 * else just add and assign the integer value to the output
	 * 
	 * Time complexity - O(n)
	 * Space complexity - O(n)
	 * 
	 */
	private int findX(String str){
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int outPut=map.get(str.charAt(0));
		
		for (int i = 1; i < str.length(); i++) {
			if (map.get(str.charAt(i))>map.get(str.charAt(i-1))){
				outPut-=map.get(str.charAt(i-1));
				outPut+=map.get(str.charAt(i))-map.get(str.charAt(i-1));
			}
			else  outPut += map.get(str.charAt(i));	
		}
		
		System.out.println(outPut);
		return outPut;
		
}
}
