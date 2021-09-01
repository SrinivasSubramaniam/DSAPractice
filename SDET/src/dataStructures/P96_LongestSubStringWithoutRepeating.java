package dataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
        Assert.assertEquals(findX(s),4);
    }
	@Test
    public void test2(){
        String s="aaabcdaaa";
        Assert.assertEquals(findX(s),4);
    }
	@Test
    public void test3(){
        String s="abbbbbacdg";
        Assert.assertEquals(findX(s),5);
    }
	@Test
    public void test4(){
        String s="aabcdghibbc";
        Assert.assertEquals(findX(s),7);
    }
	@Test
    public void test5(){
        String s="abab";
        Assert.assertEquals(findX(s),2);
    }
	@Test
    public void test6(){
        String s="pwwkew";
        Assert.assertEquals(findX(s),3);
    }
	
	private int findX(String s){
		int max=Integer.MIN_VALUE;
		int left=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				left=Math.max(left, map.get(s.charAt(i))+1);
			}
				map.put(s.charAt(i), i);
				max=Math.max(max, (i-left)+1);
				
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
}
