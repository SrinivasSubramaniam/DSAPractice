package dataStructures.Math;

import org.junit.Test;

import org.junit.*;

public class StringtoInteger8 {
	
	@Test
	public void test1(){
		String s="42";
		Assert.assertEquals(42, myAtoi(s));
	}
	@Test
	public void test2(){
		String s="   -42";
		Assert.assertEquals(-42, myAtoi(s));
	}
	@Test
	public void test3(){
		String s="4193 with words";
		Assert.assertEquals(4193, myAtoi(s));
	}
	@Test
	public void test4(){
		String s="words and 987";
		Assert.assertEquals(0, myAtoi(s));
	}
	@Test
	public void test5(){
		String s="-91283472332";
		Assert.assertEquals(-2147483648, myAtoi(s));
		
	}
	
	

	private int myAtoi(String s) {
        s=s.trim();
        if (s.length()==0) return 0;
        int index=0, sign=1;
        long sum=0;
        if (s.charAt(0)=='+'){
            sign=1;
            index++;
        }
        if (s.charAt(0)=='-'){
            sign=-1;
            index++;
        }
        while (index<s.length()){
            if (!Character.isDigit(s.charAt(index))) return (int) sum * sign ;
            sum=(sum*10)+s.charAt(index)-'0';
            if (sign==1 && sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign==-1 && (-1*sum) <Integer.MIN_VALUE ) return Integer.MIN_VALUE;
            index++;
        }
        return (int) sum *sign;
	}
}
