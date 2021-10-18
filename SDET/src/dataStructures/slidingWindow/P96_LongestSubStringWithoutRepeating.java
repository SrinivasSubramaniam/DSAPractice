package dataStructures.slidingWindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P96_LongestSubStringWithoutRepeating {

	/*
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * 	Negative data- 
	 * 	Edge Case-
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	@Test
    public void test1(){
        String s="aaabcd";
        Assert.assertEquals(longestSubstring(s),4);
    }
	@Test
    public void test2(){
        String s="aaabcdaaa";
        Assert.assertEquals(longestSubstring(s),4);
    }
	@Test
    public void test3(){
        String s="abbbbbacdg";
        Assert.assertEquals(longestSubstring(s),5);
    }
	@Test
    public void test4(){
        String s="aabcdghibbc";
        Assert.assertEquals(longestSubstring(s),7);
    }
	@Test
    public void test5(){
        String s="abab";
        Assert.assertEquals(longestSubstring(s),2);
    }
	@Test
    public void test6(){
        String s="pwwkew";
        Assert.assertEquals(longestSubstring(s),3);
    }
	
	private int findX(String s){
		int max=Integer.MIN_VALUE;
		int left=0;
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
	private int longestSubstring(String str) {
    	int left=0,right=0,max=0;
    	int[] ascii=new int[128];
    	for (right = 0; right < str.length(); right++) { 		
    		ascii[str.charAt(right)]++;
    		while (ascii[str.charAt(right)]>1)
    		{
    			ascii[str.charAt(left++)]--;
    		}
    		max=Math.max(max,right-left+1);
			
		}
    	System.out.println(max);
		return max;
    }
	public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int res = 0;
        int j = 0;
        for(int i = 0; i< s.length(); i++) {
            j = Math.max(j,map[s.charAt(i)]);
            res = Math.max(res, i-j+1);
            map[s.charAt(i)] = i+1;
        }
        return res;
    }
	
	public int lengthOfLongestSubstringSet(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<Character>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
	}
}
