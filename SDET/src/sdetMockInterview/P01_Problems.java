package sdetMockInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P01_Problems {

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
	@Test
    public void test1(){
        int[] nums ={2,3,4,5,6};
        int target=3;
        Assert.assertEquals(findX(nums, target),3);
    }
	
	private int findX(int[] nums,int target){
		return 1;
	}
}
