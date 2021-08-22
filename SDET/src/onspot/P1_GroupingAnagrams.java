package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P1_GroupingAnagrams {

	/*
	 * Given an array of strings strs, group the anagrams together. 
	 * You can return the answer in any order.
	 * An Anagram is a word or phrase formed by rearranging
	 * the letters of a different word or phrase, typically 
	 * using all the original letters exactly once. List<List<String>>
	 *  
	 * 
	 * 
	 * 1) Input-List
	 * Output - List<List<String>()> 
	 * Constraints- Numbers going outside 32 bit
	 * should return 0
	 *
	 * 2) Test Data
	 *
	 * Positive data - 123 Negative data - 1534236469 Edge Case -> 120
	 * 
	 * 
	 * 3)Methods to Solve-
	 * 
	 * 4)O Notations-
	 * 
	 * 5)Psuedo code
	 */
	
	/*

	 * 
	 * 
	 * Time Complexity - O (n)
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
	
	/*
	 * Create a list of hash maps
	 * iterate through the list of string and put the char occurence in list of maps
	 * iterate through the maps and check if other map is equal and add it to the list if it not contains
	 *  
	 * 
	 */
		
	
	@Test
    public void test1(){
		
		String[] input={"eat","tea","tan","ate","nat","bat"};
		System.out.println(anagrams(input));
    }
	@Test
    public void test2(){
		
		String[] input={""};
		System.out.println(anagrams(input));
    }
	@Test
    public void test3(){
		
		String[] input={"a"};
		System.out.println(anagrams(input));
    }
	/*
	 * Create a Map to store the ascii String as key and list of strings as value
	 * Iterate the array
	 * create a ascii array of size 26
	 * iterate the input string and put the character count in ascii array
	 * convert the ascii array to string
	 * check if the map doesn't contain the List of string values  create a list, put ascii and list to the map
	 * if it contains then add the strings to the value
	 * 
	 * 
	 * 
	 */
	private List<List<String>> anagrams(String[] input) {
		Map<String,List<String>> map=new HashMap<String, List<String>>();
		
		for (String str : input) {
			int[] ascii=new int [26];
			for(int i=0;i<str.length();i++){
				ascii[str.charAt(i)-'a']++;
			}
			
			String asciiKey = Arrays.toString(ascii);
			if (!map.containsKey(asciiKey)){
				map.put(asciiKey, new ArrayList<String>());
			}
			map.get(asciiKey).add(str);		
			//return new List<List<String>()>();
		}
		List<List<String>> list=new ArrayList<List<String>>(map.values());
		return list;
		
	}
	
	/*private void anagrams(List<String> list) {
		List<Map<Character,Integer>> maplist=new ArrayList<Map<Character,Integer>>();
		for(int i=0;i<list.size();i++){
			String str = list.get(i);
			Map<Character,Integer> map=new HashMap<Character,Integer>();
			maplist.add(map);
			for (int j = 0; j < str.length(); j++) {
				map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)+1);
				
			}
			
		}
		System.out.println(maplist);
		List<List<String>> outPutList=new ArrayList<List<String>>();
		
		for(int i=0;i<maplist.size();i++){
			List<String> innerList=new ArrayList<String>();
			outPutList.add(innerList);
			for (int j = i+1; j < maplist.size(); j++) {
				if (maplist.get(i).equals(maplist.get(j)) && !innerList.contains(list.get(i)))
				innerList.add(list.get(j));
				
			}
		}
		System.out.println(outPutList);
		System.out.println(outPutList.size());
		
		
	}*/

	


}
