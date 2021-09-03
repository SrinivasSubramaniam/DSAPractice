package onspot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.junit.Test;

public class RearrangeString {
	/*Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

	Return any possible rearrangement of s or return "" if not possible.

	 

	Example 1:

	Input: s = "aab"
	Output: "aba"
	Example 2:

	Input: s = "aaab"
	Output: ""
	*
	*
	*
	*
	*
	*/
	
	@Test
	public void test1(){
		String str="aaabbc";
		System.out.println(findX(str));
	}
	@Test
	public void test2(){
		String str="aaab";
		System.out.println(findX(str));
	}
	@Test
	public void test3(){
		String str="vvvlo";
		System.out.println(findX(str));
	}

	private String findX(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (int i=0;i<str.length();i++){
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		}
		StringBuilder sbr=new StringBuilder();
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(set);
		Collections.sort(list,(a,b)->(b.getValue().compareTo(a.getValue())));
		System.out.println(list);
		Character[] arr=new Character[str.length()];
		int j=0;
		Entry<Character, Integer> entry1 = list.get(j);
		while (j<arr.length){
			arr[j]=entry1.getKey();
			entry1.setValue(entry1.getValue()-1);
			j+=2;
		}
		
		while (!list.isEmpty()){
			int i=1;
			while (i<list.size()){
				Entry<Character, Integer> entry = list.get(i);
				sbr.append(entry.getKey());
				entry.setValue(entry.getValue()-1);
				if (entry.getValue()==0){
					list.remove(i);
				}
				
				Entry<Character, Integer> secondEntry = list.get(i+1);
				sbr.append(secondEntry.getKey());
				secondEntry.setValue(secondEntry.getValue()-1);
				if (secondEntry.getValue()==0){
					list.remove(i);
				}
				
				
				
				else i++;
			}			
		}
		int length=sbr.length();
		if (sbr.toString().charAt(length-1)==sbr.toString().charAt(length-2)) return "";
		else return sbr.toString();
	}
}
