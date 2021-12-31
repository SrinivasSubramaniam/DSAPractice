package onspot;

import org.junit.Test;

public class Anag {
	
	@Test
	public void test1(){
		String s1="teatt";
		String s2="etatt";
		System.out.println(checkAnagrams(s1,s2));
		
	}
	// "tea" , "eat","ate" , "panam" , "anpam"
	// {"tea", "eat","ate" } {"panam" , "anpam"}
	//rotate the array 90,180;
	//palindrome
	//	two pointers
	//  ascii
	// 	map
	//anagram
	// map
	// arrays
	
	// 2-medium
	//
	
	
	
	private boolean checkAnagrams(String s1, String s2) {
		
		int[] arr1=new int[26];
		for(int i=0;i<s1.length();i++) arr1[s1.charAt(i)-'a']++;
		
		for(int i=0;i<s2.length();i++){
			if(arr1[s2.charAt(i)-'a']==0) return false;
			arr1[s1.charAt(i)-'a']--;
		}
		return true;
	}
	
	// Arrays
	//   sort -- > O(n log n)
	//	 equals
	
	// Map		-> O (n)
	//  two different maps
	// equals
	
	// Ascii 126 --> O (n) 
	// equals
	
	//Ascii 26 ---> O (n)
	//equals


}
