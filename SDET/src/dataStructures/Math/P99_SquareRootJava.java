package dataStructures.Math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.*;


public class P99_SquareRootJava {

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
        int nums=15;
        System.out.println(findXRecursion(nums));
    }
	
	private double findXRecursion(int n) {
		double squareroot = n;
		double temp = 0;
		while (squareroot-temp!=0) {
			temp=squareroot;
			squareroot = (squareroot + (n / squareroot)) / 2;
			//System.out.println(squareroot);
		}
		System.out.println(squareroot);
		return squareroot;

	}
	private double findSquareRoot(int n){
		double i=2,j=n/2;
		return findSquareBinary(n,i,j);
	}

	private double findSquareBinary(int number,double i,double j) {
		double midvalue = (i+j)/2;  
		double square = midvalue * midvalue;   
		if(square==number||Math.abs(square-number)<0.0000001)  return midvalue;  
		else if(square>number)	return findSquareBinary(number, i, midvalue);  
		else  return findSquareBinary(number, midvalue, j);
	}
	
}
