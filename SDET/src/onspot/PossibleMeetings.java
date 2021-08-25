package onspot;

import java.util.Arrays;

import org.junit.Test;

public class PossibleMeetings {
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
		int[][] intervals={{0,30},{5,10},{15,20}};
		System.out.println(findMeetings(intervals));

	}
	@Test
	public void test2() {
		int[][] intervals={{7,10},{2,4}};
		System.out.println(findMeetings(intervals));

	}
	@Test
	public void test3() {
		int[][] intervals={{3,3},{3,4}};
		System.out.println(findMeetings(intervals));

	}

	private boolean findMeetings(int[][] intervals) {
		System.out.println(Arrays.deepToString(intervals));
		Arrays.sort(intervals,(a,b)->{
			if (a[1]!=b[1]) return a[1]-b[1];
			else return a[0]-b[0];
		});
		System.out.println(Arrays.deepToString(intervals));
		int start=1,end=0;
		while (start<intervals.length){
			if (intervals[start][0]<intervals[end][1]){
				return false;
			}
			start++;
			end++;
		}
		return true;
		
	}

}
