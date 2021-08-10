package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P97_SubStringMatch {

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
        String str1="welcome to test leaf to achieve";
        String str2="to";
        System.out.println(findXRecursion(str1,str2));
    }
	@Test
    public void test2(){
        String str1="hiasdhiasdhiasdhi";
        String str2="hi";
        System.out.println(findXRecursion(str1,str2));
    }

	private int findXRecursion(String str1,String str2) {
		if (!str1.contains(str2)) return 0;
		else {
			str1=str1.replaceFirst(str2, "");
			return 1+findXRecursion(str1, str2);
		}
	}
	
	
}
