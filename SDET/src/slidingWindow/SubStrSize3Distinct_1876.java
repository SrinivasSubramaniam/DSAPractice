package slidingWindow;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class SubStrSize3Distinct_1876 {
	
	@Test
	public void test1(){
		String str="xyzzaz";
		Assert.assertEquals(1, countGoodSubstringOptimized(str));
	}
	@Test
	public void test2(){
		String str="aababcabc";
		Assert.assertEquals(4, countGoodSubstringOptimized(str));
	}
	@Test
	public void test3(){
		String str="x";
		Assert.assertEquals(0, countGoodSubstringOptimized(str));
	}
	
	
	 /*
    1. declare a count value as 0 and create a map
    2. Iterate till 3 characters and check if the size is 3 then increase the counter
    3. Slide the window till length-3 
    4. Remove the first character and add the next char check if the size is 3 then increase the counter
    5. return counter  
    
    Time Complexity - O(2n) -> O(n)
    Space Complexity- O(m)
    
    
    
    Time 
    Pseudoe code-5 mins
    Code -7 mins 
    Debug and run -3 mins  
    
    
    Mistakes
    1. Didn't consider when length is less than 3
    2. To be removed from the map only when count is 1
    
    
    
    */
	public int countGoodSubstrings(String s) {
		int count=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		if (s.length()<3) return 0;
		for (int i=0;i<3;i++){
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
		if (map.size()==3) count++;
		for (int i=1;i<=s.length()-3;i++){
			if (map.get(s.charAt(i-1))==1) map.remove(s.charAt(i-1));
			else map.put(s.charAt(i-1),map.getOrDefault(s.charAt(i-1),0)-1);
			map.put(s.charAt(i+3-1),map.getOrDefault(s.charAt(i+3-1),0)+1);
			if (map.size()==3) count++;
		}
		return count++;
	}
	
	/*initialize a counter
	 * start the loop from 1st index and iterate till legnth-1
	 * Check for the 3 characters i-1,i,i+1 if they are not same then increase the counter 
	 * 
	 * Time Complexity - O(N)
	 * Space COmplexity - O(1)
	 * 
	 */
	
	public int countGoodSubstringOptimized(String s) {
		int count=0;
		for(int i=1;i<s.length()-1;i++){
			if (s.charAt(i-1)!=s.charAt(i)&&s.charAt(i)!=s.charAt(i+1)&&s.charAt(i-1)!=s.charAt(i+1))
				count++;
		}
		
		return count;
	}


}
