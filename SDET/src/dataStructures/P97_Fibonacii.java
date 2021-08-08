package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P97_Fibonacii {

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
        int[] nums={1,0,1,1};
        System.out.println(findXRecursion(nums));
    }
	
	private int findX(int n){
		
		int n1=0,n2=1, n3=0;
		for (int i = 1; i < n; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+ " " );
		}
		return n;
	}
	
private int findXRecursion(int[] n){
		return 1;
	}
}
