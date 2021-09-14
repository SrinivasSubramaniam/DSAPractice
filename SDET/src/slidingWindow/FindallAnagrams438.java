package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindallAnagrams438 {
	
	@Test
	public void test1(){
		String s="abab";
		String p="ab";
		System.out.println(findAnagrams(s, p));
	}
	
	/*Psuedo code
	 *
	 *Sliding Window
	 *Create a list to hold the indices
	 *Create a ascii array for both matching string and original strin
	 *Put the matching string and original string till matching string length in ascii array
	 *Check if the both ascii array are same put the indices in list
	 *In next for loop iterate the window by adding next character and removing previous character
	 *Check if the both ascii array are same put the indices in list
	 *
	 *Time Complexity- O(n)+O(m)-> O(n)
	 *Space Complexity- O(26)
	 *
	 * 
	 * Pseudo code- 5 Mins
	 * Code - 5 Mins
	 * Debug - 5 Mins
	 * 
	 * 
	 */
	
	public List<Integer> findAnagrams(String s, String p) {
		int[] sAscii=new int [26];
		int[] pAscii=new int [26];
		List<Integer> list=new ArrayList<Integer>();
		if (p.length()>s.length()) return new ArrayList<Integer>();
		for (int i=0;i<p.length();i++){
			sAscii[s.charAt(i) -'a']++;
			pAscii[p.charAt(i) -'a']++;
		}
		if (Arrays.equals(pAscii,sAscii)) list.add(0);
		int left=0;

		for (int right=p.length();right<s.length();right++){
			sAscii[s.charAt(left++)-'a']--;
			sAscii[s.charAt(right)-'a']++;
			if (Arrays.equals(sAscii,pAscii)) list.add(left);


		}
		return list;
    
    
    /*char[] matchPattern = p.toCharArray();
    	char[] windowPattern=new char[p.length()];
    	Arrays.sort(matchPattern);
    	List<Integer> list =new ArrayList<Integer>();
    	for (int i = 0; i <= s.length()-p.length(); i++) {
    		int window=p.length()+i;
    		windowPattern=s.substring(i,window).toCharArray();
    		Arrays.sort(windowPattern);
    		if (Arrays.equals(matchPattern,windowPattern )) list.add(i);
		}
    	System.out.println(list); 	
    	
    	return list;  */  
}

}
