package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Program2_TwoSumV1 {
	
	@Test
	public void testData1()
	{
		int[] n={2,4,3,2};
		int target=7;
		System.out.println(Arrays.toString(twoSum(n, target)));
		
	}
	@Test
	public void testData2()
	{
		int[] n={2,4,3,2};
		int target=9;
		System.out.println(Arrays.toString(twoSum(n, target)));
		
	}
	@Test
	public void testData3()
	{
		int[] n={1,5,6,7};
		int target=10;
		System.out.println(Arrays.toString(twoSum(n, target)));
		
	}
	
	private int[] twoSum(int[] array, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		   
	    for (int i = 0; i < array.length; i++) {
	    	int sub=target - array[i];
	        if (map.containsKey(sub)) 
	        {
	        	return new int[] {map.get(target-array[i]),i};
	        }
	        map.put(array[i], i);
	    }
		return new int[] {-1,-1};
		
	}
	

}
