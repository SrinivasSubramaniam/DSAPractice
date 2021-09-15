package prefixSuffix;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class BindarySubArraySum930 {
	@Test
	public void test1(){
		int[] nums={1,0,1,0,1};
		int goal=2;
		Assert.assertEquals(4, numSubArraysPrefixSum(nums, goal));
	}
	@Test
	public void test2(){
		int[] nums={0,0,0,0,0};
		int goal=0;
		Assert.assertEquals(15, numSubArraysPrefixSum(nums, goal));
	}
	/*Pseudo code
	 * 
	 * Create a map to store sum as key and its occurences as values
	 * create a count and sum variable a 0
	 * iterate the array
	 * do addition of value with existing sum
	 * if map contains sum - target then get the occurence and add to the count
	 * put sum and it's occurence to map
	 * 
	 *  Time complexity - O(n)
	 *  Space Complexity - O(1)
	 *  
	 *  Time taken
	 *  Pseudo code - 5mins
	 *  Code - 5 mins
	 * 
	 * 
	 * 
	 */
	public int numSubArraysPrefixSum(int[] nums,int goal){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(0,1);
		int count=0,sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if (map.containsKey(sum-goal)){
				count+=map.get(sum-goal);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
	}
	
	
	public int numSubarraysWithSum(int[] nums, int goal) {
        
         int psum = 0, res = 0, count[] = new int[nums.length + 1];
        count[0] = 1;
        for (int i : nums) {
            psum += i;
            if (psum >= goal)
                res += count[psum - goal];
            count[psum]++;
        }
        return res;
        
    }
	

}
