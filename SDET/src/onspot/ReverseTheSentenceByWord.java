package onspot;

import org.junit.Assert;
import org.junit.Test;



public class ReverseTheSentenceByWord {
	
	/*
	 * reverse the given sentence by a word
	 * 
	 * 
	 * time complexity less than O(n)
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1(){
		String str="todays is a beautiful day";
		reverseString(str);
		String outPut="day beautifula a is today";
		Assert.assertEquals(reverseString(str), outPut);
		
	}
	
	/*
	 * 
	 * Psuedo code
	 * Declare left and right variable with left as 0 and right as length-1
	 * iterate the character from left and 
	 * 
	 */

	private String reverseString(String str) {
		int left=0,right=str.length()-1;
		while (left<right){
			if (!Character.isSpace(str.charAt(left))) left++;
			if (!Character.isSpace(str.charAt(right))) right--;
			if (Character.isSpace(str.charAt(left)) &&Character.isSpace(str.charAt(right))){
				
			}
			
		}		
		return str;
	}
	
	

}
