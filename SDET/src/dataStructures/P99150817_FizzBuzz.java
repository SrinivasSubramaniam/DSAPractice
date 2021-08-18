package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P99150817_FizzBuzz {

	/*
	 * 
	 *1) Input-int
	 *	 Output -list
	 *	 Constraints-two pointer
	 *
	 *2) Test Data
	 *
	 * 	Positive data- n = 3
	 *  ["1","2","Fizz"]
	 * 	Negative data-
	 * 	Edge Case-10^4
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations- O n/2
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * Create a HashMap and store the values
	 * keep left and right pointer with 0 and nums
	 * if the left or right pointer is equal to 3 and 5 put FizzBuZZ
	 * If the left or right pointer is equal to 3 putt Fizz
	 * If the left or right pointer is equal to 5 putt Buzz
	 * 
	 * Time 
	 * Problem understanding-5 mins
	 * Test Data - 5 mins
	 * Psuedo code- 15 mins
	 * 
	 * 
	 */
	
	
		
	
	@Test
    public void test1(){
       int n=3;
       List<String> list=new ArrayList<String>();
       list.add(Integer.toString(1));
       list.add(Integer.toString(2));
       list.add("Fizz");
       System.out.println(fizzBuzz(n));
    }
	@Test
    public void test2(){
       int n=5;
       System.out.println(fizzBuzz(n));
    }
	@Test
    public void test3(){
       int n=15;
       System.out.println(fizzBuzz(n));
    }
	
public List<String> fizzBuzz(int n) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	int left=1,right=n;
	while (left<=right){
		if (left%15==0) map.put(left, "FizzBuZZ");
		else if (left%5==0) map.put(left, "Buzz");
		else if (left%3==0) map.put(left, "Fizz");
		else map.put(left, Integer.toString(left));
		left++;
		
		if (right%15==0) map.put(right, "FizzBuZZ");
		else if (right%5==0) map.put(right, "Buzz");
		else if (right%3==0) map.put(right, "Fizz");
		else map.put(right, Integer.toString(right));
		right--;
		
		
		
		
	}
	return new ArrayList<String>(map.values());
    
	}
}
