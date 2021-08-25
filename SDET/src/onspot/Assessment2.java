package onspot;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Assessment2 {
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
		Integer[] start={2,3,1,1};
		List<Integer> startList = Arrays.asList(start);
		Integer[] end={3,4,2,3};
		List<Integer> endList = Arrays.asList(end);
		findMaximumMeeting(startList,endList);

	}
	
	@Test
	public void test2() {
		Integer[] start={1,1,2};
		List<Integer> startList = Arrays.asList(start);
		Integer[] end={3,2,4};
		List<Integer> endList = Arrays.asList(end);
		findMaximumMeeting(startList,endList);

	}
	@Test
	public void test3() {
		Integer[] start={2,2};
		List<Integer> startList = Arrays.asList(start);
		Integer[] end={2,2};
		List<Integer> endList = Arrays.asList(end);
		findMaximumMeeting(startList,endList);

	}

	private int findMaximumMeeting(List<Integer> startList, List<Integer> endList) {
		int[][] times=new int[startList.size()][2];
		for (int i = 0; i < startList.size(); i++) {
			times[i][0]=startList.get(i);
			times[i][1]=endList.get(i);
		}
		System.out.println(Arrays.deepToString(times));
		Arrays.sort(times,(a,b)->{
			if (a[1]!=b[1]) return a[1]-b[1];
			else return a[0]-b[0];
		});
		System.out.println(Arrays.deepToString(times));		
		int end=0;
		int start=1;
		
		int counterTime=1;
		
		while(start<times.length){
			if (times[start][0]>=times[end][1]){
				counterTime++;
				end++;
			}
			start++;
		}
		System.out.println(counterTime);
		return 0;
		
	}


}
