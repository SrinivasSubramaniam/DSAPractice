package onspot;

import java.util.Arrays;

import org.junit.Test;

public class P6_SwapNumber {
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		int num=7326;
		System.out.println(swapNumber(num));

	}

	private int swapNumber(int num) {
		char[] digits = Integer.toString(num).toCharArray();
		System.out.println(Arrays.toString(digits));
        
        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;
        }
        System.out.println(Arrays.toString(buckets));
        
        for (int i = 0; i < digits.length; i++) {
            for (int k = 9; k > digits[i] - '0'; k--) {
            	System.out.println("i is "+i);
            	System.out.println("k value is "+k);
            	System.out.println("k is "+buckets[k]);
                if (buckets[k] > i) {
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }
        //System.out.println(num);
        
        return num;
		
	}

}
