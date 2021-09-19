package slidingWindow;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

public class FruitsMaximum904 {
	@Test
	public void test1(){
		int[] nums={1,2,1};
		Assert.assertEquals(3,totalFruitSliding(nums));
	}
	@Test
	public void test2(){
		int[] nums={3,3,1,3,2,1};
		Assert.assertEquals(4,totalFruitSliding(nums));
	}
	/*
	 * Pseudo code
	 * 1. Create a map to hold number and it's indices
	 * 2. create a left,right and max value
	 * 3. iterate the array
	 * 4. put the values in the key and it's indices
	 * 5. if map size is greater than 2
	 * 6. create a min and get the min values in the list
	 * 7. remove the value from the map
	 * 8. assign left to min+1
	 * 9. get the max value
	 * 
	 * 
	 * Time complexity- O(n)
	 * Space Complexity- O(1)
	 * 
	 * Time to solve
	 * 
	 * Psuedo code=5 mins
	 * Code- 7 mins
	 * Debug- 2 mins
	 * 
	 * 
	 * 
	 * 
	 */
	
	public int totalFruit(int[] fruits) {

		int left=0,right=0,max=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		while (right<fruits.length){
			map.put(fruits[right],right++);
			if (map.size()>2){
				int min=Collections.min(map.values());
				map.remove(fruits[min]);
				left=min+1;                
			}
			max=Math.max(max,right-left);
		}
		return max;

	}
	public int totalFruitSliding(int[] fruits) {

		int left=0,right=0,max=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		while (right<fruits.length){
			map.put(fruits[right],map.getOrDefault(fruits[right], 0)+1);
			right++;
			while (map.size()>2){
				map.put(fruits[left],map.get(fruits[left])-1);
				if(map.get(fruits[left])==0) map.remove(fruits[left]);
				left++;
			}
			max=Math.max(max,right-left);
		}
		return max;

	}
}
