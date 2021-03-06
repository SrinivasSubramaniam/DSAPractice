package onspot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SubArrayK {
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
		int k=5;
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(5);
		nums.add(10);
		nums.add(11);
		nums.add(9);
		nums.add(5);
		System.out.println(kSub(k, nums));
		

	}
	@Test
	public void test2() {
		int k=3;
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(1);
		System.out.println(kSub(k, nums));
		

	}
	

	public long kSub(int k, List<Integer> nums) {
	    
		// Cumulative Sum of each number in the list
        int sum = 0;
        
        // Return output 
        long output = 0;
        
        // Find the frequency of remainder occurrence
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Traverse 
        for(int i=1;i<=nums.size();i++) {
        	
        	// Calculate remainder and add K to it if it is negative
            int rem = sum%k < 0? sum%k + k : sum%k;
            
            //  If the remainder exist, update else add
            freqMap.put(rem, freqMap.getOrDefault(rem, 0)+1);
            
            // add the previous number to cumulative sum
            sum +=nums.get(i-1);
            
        	// Calculate remainder and add K to it if it is negative
            rem = sum%k < 0? sum%k + k : sum%k;
            
            // If found, add to the output
            if(freqMap.containsKey(rem)) {
            	output+=freqMap.get(rem);
            }
        }
        return output;

    }



}
