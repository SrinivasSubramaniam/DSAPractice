package SDETMockInterview;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class DigitSumMaxSum {
	
	@Test
	public void test1(){
		int[] A={51,17,71,42};
		Assert.assertEquals(93, findMaxSum(A));
	}
	@Test
	public void test2(){
		int[] A={42,33,60};
		Assert.assertEquals(102, findMaxSum(A));
	}
	@Test
	public void test3(){
		int[] A={51,32,43};
		Assert.assertEquals(-1, findMaxSum(A));
	}
	@Test
	public void test4(){
		int[] A={17,71,44,53};
		Assert.assertEquals(124, findMaxSum(A));
	}

	/*
	 * Create a map to hold the digits sum and corresponding higher number
	 * Iterate the array
	 * get digit sum of each digit by taking mod and adding it 
	 * add the digit sum  to the map with corresponding number
	 * if the digit sum is already present in the map
	 * 		- find the maxSum by adding current num to the existing num
	 * 		- if the current number is bigger than the one which is already present in the map, then replace
	 * 
	 * 
	 * Time complexity - O(n)
	 * Space complexity- O(n)
	 * 
	 * 
	 * Time
	 * 		Referred the solution
	 * Pseudo code- 10 mins
	 * Code- 10 mins
	 * Debug - 5 mins
	 * 
	 * 
	 * 
	 */


	private int findMaxSum(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        for(int num : a){
            int sum = digitSum(num);
            if(map.containsKey(sum)){
                maxSum = Math.max(maxSum, map.get(sum) + num);
                if(map.get(sum) < num){
                    map.put(sum, num);
                }
            }else{
                map.put(sum, num);
            }
        }
        return maxSum;
    }
    public int digitSum(int num){
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }

}
