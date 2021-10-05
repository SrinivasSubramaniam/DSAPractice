package dataStructures.recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.naming.spi.DirObjectFactory;

import org.junit.*;


public class P99_DecodeString {

	/*
	 * 
	 *1) Input-String
	 *	 Output -String
	 *	 Constraints-User recursion
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 3[a]2[bc]
	 * 	Negative data- [ab]
	 * 	Edge Case-3[a[c]]
	 * 
	 *3)Methods to Solve- Recursion
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	@Test
    public void test1(){
        String str1="3[a]2[bc]";
        System.out.println(findXRecurseMethod(str1));
    }
	@Test
    public void test2(){
        String str1="3[a2[c]]";
        System.out.println(findXRecurseMethod(str1));
    }
	@Test
    public void test3(){
        String str1="3[a[c]]";
        System.out.println(findXRecurseMethod(str1));
    }
	@Test
    public void test4(){
        String str1="[ac]";
        System.out.println(findXRecurseMethod(str1));
    }
	
	/*Find Closing bracket index
	 *Base condition: If closing bracket index is -1 then return String
	 *Do a while loop and check the associated opening bracket from closing bracket and store it in the opening bracket Index
	 *If there is no digit before the opening bracket assign the digitValue as 1
	 *else get the numeric value of that character
	 *Create a string builder and do a while loop for the digit value and append from opening to closing bracket
	 *Make a recursive call with the parameter including substring before digitValue and concatenated string value and value after closing bracket
	 */

	private String findXRecurseMethod(String str1) {
		int closingBracket=str1.indexOf(']');
		if (closingBracket==-1) return str1;
		int openingBracket=closingBracket;
		while (str1.charAt(--openingBracket)!='['){};
		int digitIndex=openingBracket-1;
		int digitValue;
		if (openingBracket==0) return str1.substring(openingBracket+1,closingBracket);
		if(!Character.isDigit(str1.charAt(openingBracket-1))){
			digitValue = 1;
			digitIndex =openingBracket;
		}
		else digitValue=Character.getNumericValue(str1.charAt(openingBracket-1));
		StringBuilder sb=new StringBuilder();
		while (digitValue-->0){
			sb.append(str1.substring(openingBracket+1,closingBracket));
		}
		return findXRecurseMethod(str1.substring(0, digitIndex)+sb.toString()+str1.substring(closingBracket+1));
	}
	
}
