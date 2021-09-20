package stringProblems;

import org.junit.*;

public class AddStrings415 {
	
	@Test
	public void test1(){
		String nums1="11";
		String nums2="123";
		Assert.assertEquals("134", findaddString(nums1,nums2));
		
	}
	@Test
	public void test3(){
		String nums1="456";
		String nums2="77";
		Assert.assertEquals("533", findaddString(nums1,nums2));
		
	}
	@Test
	public void test2(){
		String nums1="9";
		String nums2="1";
		Assert.assertEquals("10", findaddString(nums1,nums2));
		
	}
	
	/*Pseudo code
	 * create a carry and sum variable 
	 * create a string buffer to store the output
	 * create a i variable and assign the length of first string
	 * create a j variable and assign the length of first string
	 * do while loop where i or j less than length or carry is equal to 1
	 * Create a two local variable a and b
	 * if the i,j value is greater than or equal to 0 assign to integer value, decrement i and j post
	 * else assign as o 
	 * do a sum of a+b+carry
	 * append carry%10
	 * assign carry to carry/10
	 * 
	 * Time Complexity- O(n)
	 * Space Complexity- O(n)
	 * 
	 * Time 
	 * Pseudo code- 15 mins
	 * Code- 10 mins
	 *  
	 */

	private String findaddString(String nums1, String nums2) {
		int carry=0,sum=0;
		int i=nums1.length()-1;
		int j=nums2.length()-1;
		StringBuilder sb=new StringBuilder();
		while (i>=0 || j>=0 || carry==1){
			int a=i>=0?nums1.charAt(i--)-'0':0;
			int b=j>=0?nums2.charAt(j--)-'0':0;
			sum=a+b+carry;
			sb.append(sum%10);
			carry=sum/10;
		}
		return sb.reverse().toString();
	}

}
