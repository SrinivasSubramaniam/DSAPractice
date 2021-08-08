package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.naming.spi.DirObjectFactory;

import org.junit.*;


public class P97_DecodeString {

	/*
	 * 
	 *1) Input-
	 *	 Output -
	 *	 Constraints-
	 *
	 *2) Test Data
	 *
	 * 	Positive data- 
	 * 	Negative data- 
	 * 	Edge Case-
	 * 
	 *3)Methods to Solve-
	 * 
	 *4)O Notations-
	 * 
	 *5)Psuedo code
	 */
	
	/*
	 * 1. Simplest possible case- 0
	 * 2. Test data - 5 ,4 
	 * 3. Edge case- 
	 * 4. Pattern- (n-1)
	 * 
	 * 
	 * 
	 */
	
	
	/// 0 1 1 2 3 
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


	

	private String findXRecurseMethod(String str1) {
		int closingBracket=str1.indexOf(']');
		if (closingBracket==-1) return str1;
		int openingBracket=str1.indexOf('[');
		int digitIndex=openingBracket-1;
		int digitValue;
		if(!Character.isDigit(str1.charAt(openingBracket-1)))  digitValue = 1;
		else digitValue=Character.getNumericValue(str1.charAt(openingBracket-1));
		StringBuilder sb=new StringBuilder();
		while (digitValue>0){
			sb.append(str1.substring(openingBracket+1,closingBracket));
			digitValue--;
		}
		str1=findXRecurseMethod(str1.substring(0, digitIndex)+sb.toString()+str1.substring(closingBracket+1));
		return str1;
	}
	
	private String decodeUsingRecursion(String s) {
        StringBuilder str = new StringBuilder(s);
        if(str.indexOf("]")==-1) return "";
        int closingIndex = str.indexOf("]");
        int openingIndex = str.indexOf("[");
        int digit;
        if(!Character.isDigit(str.charAt(openingIndex-1)))  digit = 1;
        else digit = str.charAt(openingIndex-1);
        String subString = str.substring(openingIndex+1,closingIndex);
        while(digit>0) {
            subString = subString.concat(subString);
            digit--;
        }
        s = decodeUsingRecursion(subString+str.substring(closingIndex+1)+decodeUsingRecursion(s));
        return decodeUsingRecursion(s);
    }
	
}
