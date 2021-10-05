package onspot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Dam {
	/*
	 * 
	 * 1) Input-
	 * Output -  
	 * Constraints- 
	 *
	 * 2) Test Data
	 *
	 * Positive data -
	 * Negative data
	 * Edge Case
	 * 
	 * 3) Methods to Solve-
	 * 
	 * 4) O Notations-
	 * 
	 * 5) Psuedo code
	 */

	/*
	 * 
	 *
	 * 
	 * PsuedoCode: 
	 * Code: 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		List<Integer> listPos=new ArrayList<Integer>();
		listPos.add(1);
		listPos.add(2);
		listPos.add(4);
		listPos.add(7);
		List<Integer> listHeights=new ArrayList<Integer>();
		listHeights.add(4);
		listHeights.add(6);
		listHeights.add(8);
		listHeights.add(11);
		findHeight(listPos,listHeights);

	}
	@Test
	public void test2() {
		List<Integer> listPos=new ArrayList<Integer>();
		listPos.add(1);
		listPos.add(3);
		listPos.add(7);
		List<Integer> listHeights=new ArrayList<Integer>();
		listHeights.add(4);
		listHeights.add(3);
		listHeights.add(3);
		findHeight(listPos,listHeights);

	}
	@Test
	public void test3() {
		List<Integer> listPos=new ArrayList<Integer>();
		listPos.add(4);
		listPos.add(5);
		listPos.add(6);
		listPos.add(9);
		listPos.add(10);
		listPos.add(11);
		listPos.add(12);
		listPos.add(13);
		listPos.add(14);
		List<Integer> listHeights=new ArrayList<Integer>();
		listHeights.add(20);
		listHeights.add(22);
		listHeights.add(11);
		listHeights.add(14);
		listHeights.add(21);
		listHeights.add(19);
		listHeights.add(14);
		listHeights.add(23);
		findHeight(listPos,listHeights);

	}
	

	private int findHeight(List<Integer> listPos, List<Integer> listHeights) {
		Integer max = Collections.max(listPos);
		if (listPos.size()==max) return 0;
		int[] damHeight =new int[max+1];
		int j=0;
		for (int i=1;i<damHeight.length;i++){
			if (!listPos.contains(i)){
				damHeight[i]=damHeight[i-1]+1;			
			}else{
				if (j<listHeights.size())
				damHeight[i]=listHeights.get(j++);
			}
		}
		System.out.println(Arrays.toString(damHeight));
		max=Integer.MIN_VALUE;
		for (int i=damHeight.length-2;i>=0;i--){
			if (!listPos.contains(i)){
				int temp=damHeight[i+1]+1;
				if (temp < damHeight[i]) damHeight[i] = temp;
				max=Math.max(max, damHeight[i]);
				
			}
		}
		System.out.println(max);
		return max;
		
	}


}
