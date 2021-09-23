package onspot;

import org.junit.*;
import java.util.*;

public class RansomNote383 {
	@Test
	public void test1(){
		String ransomNote = "a";
		String magazine = "b";
		Assert.assertFalse(canConstructOptimized(ransomNote,magazine));
	}
	
	/*Psuedocode
	 *create a int array of 26 length
	 *In array the respective character position of magazine increment the count
	 *iterate the ransom string 
	 * take the respective character position and if the value is 0 return false
	 * else decrement the value
	 * return true
	 * 
	 * Time Complexity-O(n)
	 * Space Complexity- O(26)
	 * 
	 * Time taken
	 * Pseudo code- 5 mins
	 * Code- 7 Mins
	 */
	public boolean canConstructOptimized(String ransomNote, String magazine) {
       int[] magArr=new int[26];
       for (int i=0;i<magazine.length();i++){
    	   magArr[magazine.charAt(i)-'a']++;
       }
       for (int i=0;i<ransomNote.length();i++){
    	    int ranInt= ransomNote.charAt(i)-'a';
    	    if (magArr[ranInt]==0){
    	    	return false;
    	    }
    	    else {
    	    	magArr[ranInt]--;
    	    }
       }
        return true;
    }
	public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magMap=new HashMap<Character,Integer>();
        for (Character each: magazine.toCharArray()){
            magMap.put(each,magMap.getOrDefault(each,0)+1);
        }
        Map<Character,Integer> ranMap=new HashMap<Character,Integer>();
        for (Character each: ransomNote.toCharArray()){
            ranMap.put(each,ranMap.getOrDefault(each,0)+1);
        }
        for (Map.Entry<Character,Integer> each:ranMap.entrySet()){
            if (!magMap.containsKey(each.getKey())) return false;
            else {
                if (each.getValue()>magMap.get(each.getKey())) return false;
        }
        }
        return true;
    }

}
