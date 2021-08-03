package dataStructures;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;


public class P54_CharacterOccurence {
	/*
	 *Given a string print the characters
	 * and their count as a string str="abcdee" output - "a1b1c1d1e2"
	 * 
	 * 
	 * 1)What is the input(s)? - String
	 * What is the expected output? - String
	 * Do I have constraints to solve the problem? -
	 * Do I have all informations to go to next step!! 
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- "bbddccddd"
	 * Negative data- " "
	 * Edge Case- "aabbcccdddaa"
	 * 
	 * Validate the data set with the interviewer
	 *
	 * 3) Do I know how to solver it? - yes Yes - great, Is there any alternate
	 * solution?-
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
	 *
	 *
	 *
	 * /
	 */
	@Test
    public void test1(){
       String s="aabbcccddd";
       characterOccurence(s);
        Assert.assertEquals(characterOccurence(s),"a2b2c3d3");
        
    }
	@Test
    public void test2(){
       String s="bbddccddd";
       characterOccurence(s);
        Assert.assertEquals(characterOccurence(s),"b2c2d5");
        
    }
	@Test
    public void test3(){
       String s="aabbcccdddaa";
       characterOccurence(s);
        Assert.assertEquals(characterOccurence(s),"a4b2c3d3");
        
    }
	@Test
    public void test4(){
       String s="";
       characterOccurence(s);
        Assert.assertEquals(characterOccurence(s)," ");
        
    }
	/*Psuedo code
	 * Initialize a map variable to store the character and it's count of occurrence
	 * Initialize a string buffer to append and give the string
	 * Iterate through the string and put the character and it's occurrence in map
	 * Iterate through the map and append the key and value to the string buffer
	 * finally return the buffer output by converting to string
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity - O(n) 
	 * 
	 */
	private String characterOccurence(String s){
		if (s.length()==0) return " ";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		StringBuffer buffer = new StringBuffer("");
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()){
			buffer.append(entry.getKey()+""+entry.getValue()+"");
		}
		System.out.println(buffer);		
		return buffer.toString();
	}
}
