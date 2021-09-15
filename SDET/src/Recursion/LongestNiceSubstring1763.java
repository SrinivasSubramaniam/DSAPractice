package Recursion;

import java.util.*;

import org.junit.Test;
import org.junit.Assert;

public class LongestNiceSubstring1763 {
	@Test
	public void test1(){
		String s="YazaAay";
		Assert.assertEquals("aAa", longestNiceString(s));
	}
	@Test
	public void test2(){
		String s="dDzeE";
		Assert.assertEquals("dD", longestNiceString(s));
	}
	@Test
	public void test4(){
		String s="ijIJwuUnW";
		Assert.assertEquals("ijIJ", longestNiceString(s));
	}
	@Test
	public void test3(){
		String s="c";
		Assert.assertEquals("", longestNiceString(s));
	}
	/*Psuedo code
	 * Recursion & Divide and Conquer
	 * if string length is less than 2 return "" to break the recursion
	 * Create a set to store the unique characters
	 * iterate s and put all the characters in set
	 * Iterate s
	 * 		-- if each character is having both upper case and lower case then skip the remaining steps
	 * 		-- (else)This means that particular character can't present in nice string
	 * 		-- take two substring before that character and after that character
	 * 		-- call the same method by passing two strings separately
	 * 		-- finally check for the largest string and return that string
	 * 
	 *  Time Complexity - O(n)
	 *  Space Complexiyt - O(n)
	 *  
	 *  
	 *  Pseduo code - 20 mins
	 *  Coding - 10 mins
	 *  Debugging 10 mins
	 *  		
	 * 
	 * 
	 * 
	 */
	
	
	public String longestNiceSubstring(String s) {
        if (s.length()<2) return "";
        Set<Character> set=new HashSet<>();
        for (char c: s.toCharArray()) set.add(c);
        for (int i=0;i<s.length();i++){
            if (set.contains(Character.toUpperCase(s.charAt(i)))&& set.contains(Character.toLowerCase(s.charAt(i)))) continue;
            String s1=longestNiceSubstring(s.substring(0,i));
            String s2=longestNiceSubstring(s.substring(i+1));
            return s1.length()>=s2.length()? s1: s2;
        }
        return s;
    }
	
	/*
	 * Create a map and hold the occurences of each character
	 * iterate the string and put the character in map
	 * create a left pointer to hold the starting index
	 * iterate each character and see it has upper and lower case character
	 * else move the left and increment the left pointer till it reaches right+1
	 * 
	 * calculate the max value at each iteration end
	 * 
	 * 
	 * 
	 * 
	 */
	
	public String longestNiceString(String s){
		if (s.length()<2) return "";
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
		int left=0,max=0,startIndex=0;
		for (int right=0;right<s.length();right++){
			if (map.containsKey(Character.toUpperCase(s.charAt(right)))&&map.containsKey(Character.toLowerCase(s.charAt(right))) ){	

				if (right-left > max){
					max=right-left;
					startIndex=left;
				}
								
			}
			else {
				while (left<=right){
					if (map.get(s.charAt(left))>1) map.put(s.charAt(left), map.get(s.charAt(left))-1);
					else map.remove(s.charAt(left));
					left++;
				}
			}
			
			
		}
		System.out.println(s.substring(startIndex,startIndex+max+1));
		return s.substring(startIndex,startIndex+max+1);
		
	}

}
