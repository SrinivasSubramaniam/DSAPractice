package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P9912_Stringreverse {

	/*
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * 	Negative data- 
	 * 	Edge Case-
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * 1. Simplest possible case- 0
	 * 2. Test data - 5 ,4 
	 * 3. Edge case- 
	 * 4. Pattern- (n-1)
	 * 
	 * 
	 * 
	 */
	
	@Test
    public void test1(){
        String str1="amazon";
        System.out.println(findXRecursion(str1));
    }
	@Test
    public void test2(){
        String str1=" ";
        System.out.println(findXRecursion(str1));
    }

	private String findXRecursion(String str1) {
		if (str1.isEmpty()) return str1;
		else
		{
			return  findXRecursion(str1.substring(1))+str1.charAt(0);
		}
	}
	
	
}
