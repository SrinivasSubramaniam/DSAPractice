package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P97_Count1SUsingArray {

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
	
	
	/// 0 1 1 2 3 
	@Test
    public void test1(){
        int[] n={0,1};
        System.out.println(findXRecursion(n));
    }
	private int findXRecursion(int[] n) {
		
		/*
		if (n==0) return 0;
		if (n%10==1) 
			return 1+findXRecursion(n/10);*/
		return 1;
	}
	
	
}
