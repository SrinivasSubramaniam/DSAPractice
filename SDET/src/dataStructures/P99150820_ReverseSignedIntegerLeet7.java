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


public class P99150820_ReverseSignedIntegerLeet7 {

	/*
	 * 
	 * Given a signed 32-bit integer x, return x with its digits reversed.
	 *  If reversing x causes the value to go outside the signed 32-bit 
	 *  integer range [-231, 231 - 1], then return 0.
	 *  Assume the environment does not allow you to store
	 *  64-bit integers (signed or unsigned).
	 * 
	 * 
	 *1) Input-int 
	 *	 Output - int
	 *	 Constraints- Numbers going outside 32 bit should return 0
	 *
	 *2) Test Data
	 *
	 * 	Positive data - 123
	 * 	Negative data - 1534236469
	 * 	Edge Case -> 120
	 * 
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*

	 * 
	 * 
	 * Time Complexity - O (n)
	 * 
	 *
	 * 
	 * PsuedoCode: 7 mins
	 * Code: 10 mins
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
		
	
	@Test
    public void test1(){
		int x=123;
		Assert.assertEquals(321, reverse(x));
    }
	@Test
    public void test2(){
		int x=120;
		Assert.assertEquals(21, reverse(x));
    }
	@Test
    public void test3(){
		int x=1534236469;
		Assert.assertEquals(0, reverse(x));
    }

	public int reverse(int x) {
        long sum=0;
        while (x!=0){
            if (sum*10 <Integer.MIN_VALUE || sum*10 >Integer.MAX_VALUE) return 0;
            sum=(sum*10)+(x % 10);
            x=x/10;
        }
        return (int) sum;
        
    }


}
