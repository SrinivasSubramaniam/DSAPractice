package dataStructures.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P20_NiceSubString {
	/*
	 * A string s is nice if, for every letter of the alphabet that s contains,
	 * it appears both in uppercase and lowercase. For example, "abABB" is nice
	 * because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not
	 * because 'b' appears, but 'B' does not.
	 * 
	 * Given a string s, return the longest substring of s that is nice. If
	 * there are multiple, return the substring of the earliest occurrence. If
	 * there are none, return an empty string.
	 * 
	 * 
	 * What is the input(s)? - integer array String What is the expected output?
	 * - integer array Do I have constraints to solve the problem? - Shouldn't
	 * use library sort Do I have all informations to go to next step!! How big
	 * is your test data set will be?
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "YazaAay" Output: "aAa" 
	 * Explanation: "aAa" is a nice string
	 * because 'A/a' is the only letter of the alphabet in s, and both 'A' and
	 * 'a' appear. "aAa" is the longest nice substring. 
	 * 
	 * Example 2:
	 * 
	 * Input: s = "Bb" Output: "Bb" 
	 * Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring. 
	 * 
	 * Example 3:
	 * 
	 * Input: s = "c" Output: "" 
	 * Explanation: There are no nice substrings.
	 * Example 4:
	 * 
	 * Input: s = "dDzeE" Output: "dD" Explanation: Both "dD" and "eE" are the
	 * longest nice substrings. As there are multiple longest nice substrings,
	 * return "dD" since it occurs earlier.
	 * 
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- [2,0,2,1,1,0]
	 * Negative - [] Edge- [2,2,0,0]
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force No - Can I break down the problem to sub problems?
	 *
	 * 4) Ask for the hint (If you don't know how to solve it)
	 *
	 *
	 * 5) Do I know alternate solution to solve this problem?
	 * 
	 * 6) If you know alternate solutions-> find out the O notations
	 * (performance) Then explain the both or the best (depends on the time) 1
	 * 
	 * 
	 * Approach 1-> Start with the worst -> Improve to optimize -> End up with
	 * the best Approach 2-> Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start with the Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 */

	@Test
	public void testData1() {
		String text="YazaAay";
		
		Assert.assertEquals(longestNiceSubstring(text),"aAa");
	}
	
	/*Pseudo code
	 * 
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
}
