package dataStructures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.*;


public class P83_SecondLeastElement {
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
        String s ="amazon";
        Assert.assertEquals(findX(s),'a');
        
    }
	@Test
    public void test2(){
        String s ="ddddzzzabb";
        //System.out.println(findX(s));
        Assert.assertEquals(findX(s),'b');
        
    }
	@Test
    public void test3(){
        String s ="abbcccddd";
        //System.out.println(findX(s));
        Assert.assertEquals(findX(s),'b');
        
    }
	@Test
    public void test4(){
        String s ="abcccddd";
        //System.out.println(findX(s));
        Assert.assertEquals(findX(s),'c');
        
    }
	@Test
    public void test5(){
        String s ="dddzzzbbcc";
        //System.out.println(findX(s));
        Assert.assertEquals(findX(s),'d');
        
    }
	
	/*Psuedo code
	 * 
	 * 
	 */
	private char findX(String s){
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);			
		}
		int min = Collections.min(map.values());
		int secondMin=Integer.MAX_VALUE;
		char secondMaxvalue = ' ';
		for(Map.Entry<Character, Integer> each:map.entrySet()){
			if (each.getValue()<secondMin && each.getValue()!=min){
				secondMin = Math.min(each.getValue(), secondMin);
				secondMaxvalue=each.getKey();
			}
		}

		System.out.println(secondMin);
		System.out.println("second max value is "+ secondMaxvalue);
		return secondMaxvalue;
	}
	private char findXUsingASCII(String s){
		
		int[] ascii=new int[128];
		for (int i = 0; i < s.length(); i++) {
			ascii[s.charAt(i)]++;
		}
		int min=s.charAt(0);
		int secondMin=s.charAt(1);
		int j=1;
		while (ascii[s.charAt(0)]==ascii[s.charAt(j)]) {
			j++;
			secondMin=s.charAt(j);
		}
		for (int i = 0; i < ascii.length; i++) {
			if (ascii[i] < ascii[min] && ascii[i]!=0) {
				secondMin = min;
			    min = i;
			   } else if (ascii[i] < ascii[secondMin] && ascii[i] != ascii[min] && ascii[i]!=0)
				   secondMin = i;
		}
		System.out.println("second max is "+ secondMin);
		System.out.println("second max is "+ min);
		System.out.println("second min is "+ (char)secondMin);
		System.out.println("first min is "+ (char)min);
		return ' ';
	}
}
