package dataStructures;

import org.junit.Test;
import org.testng.Assert;

public class P49_NextCharacter {
	/*
	 * Given a sorted character array and a target character, find the next
	 * biggest character in the array. char[] cha = {‘b’, ‘d’ , ‘h’}; 
	 * char k = ‘e’ Output -> h
	 * 
	 * 
	 * 1)What is the input(s)? - char array,character
	 * What is the expected output? -character
	 * Do I have constraints to solve the problem? -
	 * 
	 * at least once in s Do I have all informations to go to next step!!
	 * How big is your test data set will be?
	 *
	 *
	 * 2) Test Data Set Minimum of 3 data set !!
	 * 
	 * Positive data- {'b','d','h'}, 'e'
	 * Negative data- {'b','d','h'}, ' ' 
	 * Edge Case- {'b','d','h'},'h'
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
        char[] input={'b','d','h'};
        char target='e';
        System.out.println(nextCharacterBinarySearch(input, target));
        Assert.assertEquals('h', nextCharacterBinarySearch(input, target));
        
    }
	@Test
    public void test2(){
        char[] input={'b','d','h'};
        char target='h';
        System.out.println(nextCharacterBinarySearch(input, target));
        Assert.assertEquals(' ', nextCharacterBinarySearch(input, target));
        
    }
	@Test
    public void test3(){
        char[] input={'b','d','h'};
        char target='c';
        System.out.println(nextCharacterBinarySearch(input, target));
        Assert.assertEquals('d', nextCharacterBinarySearch(input, target));
        
    }
	@Test
    public void test4(){
        char[] input={'b','d','h'};
        char target='i';
        System.out.println(nextCharacterBinarySearch(input, target));
        Assert.assertEquals(' ', nextCharacterBinarySearch(input, target));
        
    }
	@Test
    public void test5(){
        char[] input={'b','d','e','h','i'};
        char target='c';
        System.out.println(nextCharacterBinarySearch(input, target));
        Assert.assertEquals('d', nextCharacterBinarySearch(input, target));
        
    }
	/*
	 * Declare three variable low,high and mid
	 * iterate till left reaches high
	 * calculate mid
	 * if mid is the target then return output as mid+1
	 * Otherwise check whether the mid value is less then the target, 
	 * if yes move the low next to mid
	 * Otherwise shift low to mid
	 * Check whether the last index is less than or equal to the target , return ' ' as output
	 * else return low value which is the next biggest character
	 * 
	 */
	
	private char nextCharacterBinarySearch(char[] input,char target){
		int low=0,high=input.length-1,mid;
		while (low<high){
			mid=(low+high)/2;
			if (input[mid]==target) return input[mid+1];
			else if (input[mid]<target) low=mid+1;
			else high=mid;
		}
		if (low==input.length-1 && input[low]<=target) return ' ';
		//if (target>input[low]) return ' ';
		return input[low];		
	}
	
	
	
}
