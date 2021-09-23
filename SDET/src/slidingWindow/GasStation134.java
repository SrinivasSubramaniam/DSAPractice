package slidingWindow;

import org.junit.Test;

import org.junit.*;

public class GasStation134 {
	@Test
	public void test1(){
		int[] gas={1,2,3,4,5};
		int[] cost={3,4,5,1,2};
		Assert.assertEquals(3, canCompleteCircuit(gas,cost));
	}
	@Test
	public void test2(){
		int[] gas={2,3,4};
		int[] cost={3,4,3};
		Assert.assertEquals(-1, canCompleteCircuit(gas,cost));
	}
	@Test
	public void test3(){
		int[] gas={5,1,2,3,4};
		int[] cost={4,4,1,5,1};
		Assert.assertEquals(4, canCompleteCircuit(gas,cost));
	}
	/*
	 * Psuedo code
	 * Create a totalSum and startIndex variable 
	 * iterate the array till the gas length
	 * Add totalSum to current gas station subtract cost
	 * if the total sum at the end is lesser then return -1
	 * make totalSum as 0
	 * Iterate the array till gas length
	 * if totalSum + gas of current station - cost of current station is less than 0 then increment the start index to +1 and make total sum as 0
	 * else add it to the total sum
	 * return start Index
	 * 
	 * Time complexity - O(2n)- O(n)
	 * Space Complexity- O(1)
	 * 
	 * Time taken
	 * Psuedo code- 15 mins
	 * Code- 15 mins
	 * Debug- 5 mins
	 * 
	 * 
	 * 
	 * 
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int totalSum=0,startIndex=0;
		for (int i=0;i<gas.length;i++){
			totalSum+=gas[i]-cost[i];
		}
		if (totalSum <0) return -1;
		totalSum=0;
		for (int i=0;i<gas.length;i++){
			if (totalSum+gas[i]-cost[i]<0){
				startIndex=i+1;
				totalSum=0;
			}else{
				totalSum+=gas[i]-cost[i];
			}
			
		}
        return startIndex;
        
    }
}
