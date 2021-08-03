package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class P28_ValidPalindrome {

	/*
	 *
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 *1)What is the input(s)? - String, Character
	 * String What is the expected output? - integer array 
	 * Do I have constraints to solve the problem? - s[i] and c are lowercase English letters,It is guaranteed that c occurs at least once in s
	 * Do I have all informations to go to next step!! How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !! Positive- "aaab" Negative -
	 * Edge- "loveleetcode"
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?- Brute force
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
	 * 10) If it fails, debug them to solve it /* Psuedo code Traverse the array
	 * from the last index check if last index value is less than 9, then
	 * increment last value and return array else put last value as 0 and that
	 * will increment the previous digits create a new array to fit the extra
	 * value like two digit number changed to three digit number assign 1 to
	 * first index of new array Time complexity - O(n) Space complexity - O(n)
	 *
	 *Psuedo code
	 *
	 *
	 *
	 *
	 * /
	 */
	
	    @Test
	    public void test1() {
	        String text="tebbem";
	        //Character ch='e';
	        //validPalindrome(text);
	        Assert.assertEquals( validPalindrome(text), false);
	        
	    }
	    @Test
	    public void test2() {
	        String text="abca";
	        //Character ch='e';
	        //validPalindrome(text);
	        Assert.assertEquals( validPalindrome(text), true);      
	    }
	    @Test
	    public void test3() {
	        String text="aba";
	        //Character ch='e';
	        //validPalindrome(text);
	        Assert.assertEquals( validPalindrome(text), true);      
	    }
	    @Test
	    public void test4() {
	        String text="abc";
	        //Character ch='e';
	        //validPalindrome(text);
	        Assert.assertEquals( validPalindrome(text), false);      
	    }
	    
	    @Test
	    public void test5() {
	        String text="deeee";
	        //Character ch='e';
	        //validPalindrome(text);
	        Assert.assertEquals( validPalindrome(text), true);      
	    }
	    
	    
	    /*
	     * Pseudo code
	     * Create an Output array of same text length
	     * Initialize a previous value to calculate log the distance
	     * Traverse through the text from left to right, 
	     * if character is present then assign assign 0
	     * else increment the previous value
	     * Repeat the same thing for left to right 
	     * While assigning compare the existing value with current distance and assign the minimum value 
	     * 
	     * 
	     * Time Complexity-> O(n)
	     * Space Complexity-> O(n)
	     * 
	     */



	/* public boolean validPalindrome(String s) {
	        int i=0,j=s.length()-1;
	        while (i<j){
	           if (s.charAt(i)!=s.charAt(j)){
	        	   if (s.charAt(i+1)!=s.charAt(j)||s.charAt(i)!=s.charAt(j-1)) return false;
	           }
	           i++;
	           j--;
	        }
	        return true;
	        
	    }*/
	    
	    public boolean validPalindrome(String s) {
	        int left = 0, right = s.length() - 1;
	        
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	            	//if (s.charAt(left+1)!=s.charAt(right)||s.charAt(left)!=s.charAt(right-1)) return false;
	                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1);          
	            	}
	            left++;
	            right--;
	        }

	        return true;
	    }
	    private boolean checkPalindrome(String s, int i, int j) {
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) return false;
	            i++;
	            j--;
	        }
	        return true;
    }
}

