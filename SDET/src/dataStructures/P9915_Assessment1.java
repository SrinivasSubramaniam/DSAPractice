package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.*;


public class P9915_Assessment1 {

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
	
	/*@Test
    public void test1(){
       ArrayList<Integer> nums=new ArrayList<Integer>();
       nums.add(1);
       nums.add(2);
       nums.add(3);
       nums.add(4);
       nums.add(1);
       int k =3;
        System.out.println(kSub(k,nums));
    }*/
	
	/*@Test
    public void test2(){
       ArrayList<Integer> nums=new ArrayList<Integer>();
       nums.add(5);
       nums.add(10);
       nums.add(11);
       nums.add(9);
       nums.add(5);
       int k =5;
        System.out.println(kSub(k,nums));
    }
	@Test
    public void test3(){
       ArrayList<Integer> nums=new ArrayList<Integer>();
       nums.add(1);
       nums.add(2);
       nums.add(3);
       nums.add(4);
       nums.add(1);
       int k =3;
        System.out.println(kSub(k,nums));
    }
	@Test
    public void test4(){
       ArrayList<Integer> nums=new ArrayList<Integer>();
       nums.add(3);
       nums.add(1);
       nums.add(2);
       int k =3;
        System.out.println(kSub(k,nums));
    }
	@Test
    public void test5(){
       ArrayList<Integer> nums=new ArrayList<Integer>();
       nums.add(-3);
       nums.add(1);
       nums.add(2);
       int k =3;
        System.out.println(kSub(k,nums));
    }*/
	@Test
    public void test6(){
       ArrayList<Integer> nums=new ArrayList<Integer>();
       nums.add(4);
       nums.add(5);
       nums.add(0);
       nums.add(-2);
       nums.add(-3);
       nums.add(1);
       int k =5;
        System.out.println(kSub(k,nums));
    }

	public long kSubBrute(int k, List<Integer> nums) {
		long outPut = 0;
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			sum = 0;
			for (int j = i; j < nums.size(); j++) {
				sum += nums.get(j);
				if (sum % k == 0)
					outPut++;
			}
		}
		return outPut;

	}
	public long kSub(int k, List<Integer> nums) {
		long outPut = 0;
		
		return outPut;

	}

	
	}
