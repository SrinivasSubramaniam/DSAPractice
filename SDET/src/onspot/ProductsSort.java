package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class ProductsSort {
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
		int[] nums={4,5,6,5,4,3};
		productsSort(nums);
	}
	@Test
	public void test2() {
		int[] nums={4,5,6,5,4,3,2,2,2};
		productsSort(nums);
	}

	/*Psuedo Code
	 * put array in tree map
	 * iterate from 1 to nums.length
	 * check in the map for the each each if it matches with the value
	 * if value is equal then put the key in the array
	 * if the value is more than 1 put it in n times
	 * 
	 * Time - 9.45- 10.15
	 */

	private int[] productsSort(int[] nums) {
		Map<Integer, Integer> map= new TreeMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], map.getOrDefault(nums[i],0 )+1);
			
		}
	int j=0;
		for(int i=1;i<nums.length;i++){
			for (Entry<Integer,Integer> each:map.entrySet()){
				if (each.getValue()==i){
					int temp=i;
					while (temp>0){
						nums[j++]=each.getKey();
						temp--;
					}
					
				}
			}
		}
		
			System.out.println(Arrays.toString(nums));
			return nums;
	}
	

}
