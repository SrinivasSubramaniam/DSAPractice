package onspot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LongestSubStringWithoutRepeating {
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
		String str="abcbadbcbb";
		int outPut=4;
		Assert.assertEquals(findLongesMap(str), outPut);
	}
	@Test
	public void test2() {
		String str="bbbb";
		int outPut=1;
		Assert.assertEquals(findLongesMap(str), outPut);
	}
	@Test
	public void test3() {
		String str="pwwkew";
		int outPut=3;
		Assert.assertEquals(findLongesMap(str), outPut);
	}
	@Test
	public void test4() {
		String str="abcddafghi";
		int outPut=6;
		Assert.assertEquals(findLongesMap(str), outPut);
	}
	@Test
	public void test5() {
		String str="abababc";
		int outPut=3;
		Assert.assertEquals(findLongesMap(str), outPut);
	}
	@Test
	public void test6() {
		String str="abdcbad";
		int outPut=4;
		Assert.assertEquals(findLongesMap(str), outPut);
	}
	/*
	 * Psuedo code
	 * 
	 * if the char is not present in the set
	 * then add the char to set and find max
	 * if the char is present remove till the value is removed from the set
	 * calculate the max
	 * 
	 * Time complexity - O(N^2)
	 * 
	 * 
	 * 
	 */
	

	private int findLongest(String s) {
		 int left = 0, right = 0, max = 0;
		    Set<Character> set = new HashSet<Character>();
		    while (right < s.length()) {
		        if (!set.contains(s.charAt(right))) {
		            set.add(s.charAt(right++));
		            max = Math.max(max, set.size());
		        } else {
		            set.remove(s.charAt(left++));
		        }
		    }
		    
		    return max;
	}
	
	private int findLongesMap(String s){
		int max=Integer.MIN_VALUE,left=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int right = 0; right < s.length(); right++) {
			if (map.containsKey(s.charAt(right))) {
				left=Math.max(left, map.get(s.charAt(right))+1);
			}
				map.put(s.charAt(right), right);
				max=Math.max(max, (right-left)+1);
				
		}
		System.out.println(max);
		return max;
	}


}
